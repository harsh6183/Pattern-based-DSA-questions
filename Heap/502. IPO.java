class Project implements Comparable<Project>{

    int profits;
    int capital;
    Project (int profits,int capital){
        this.profits=profits;
        this.capital=capital;
    }

    public int compareTo(Project that){
        return this.capital-that.capital; //This will sort the capital in incresing order
    }

}
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Project> minPQ = new PriorityQueue<>();
        int n = capital.length;
        //insert project in minPQ
        for(int i =0; i<n;i++){
            minPQ.offer(new Project(profits[i], capital[i]));
        }


        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        while(k>0){
            while(!minPQ.isEmpty()&& minPQ.peek().capital<=w){
                maxPQ.offer(minPQ.poll().profits);
            }
            if(maxPQ.isEmpty()) break;
            w+=maxPQ.poll();
            k--;
        }
        return w;
    }
}
