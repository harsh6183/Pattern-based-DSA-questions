class Solution {
    public int totalFruit(int[] fruits) {
        int max =0;
        //Applying sliding window 
        int i =0;
        int j=0;

        Map<Integer,Integer> map= new HashMap<>();

        //Time Comp O(n), S O(1)
        while(j<fruits.length){
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);

            while(map.size()>2){
                map.put(fruits[i],map.get(fruits[i])-1);

                if(map.get(fruits[i])==0){
                map.remove(fruits[i]);//Map is empty with perticular number then remove
            }
                 i=i+1;
         }
         max=Math.max(max,j-i+1);//Size
         j=j+1;
            
        }
        return max;
    }
}
