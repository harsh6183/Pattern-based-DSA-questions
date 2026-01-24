class Solution {
    public int lastStoneWeight(int[] stones) {
        //Brute approach
        //Time complexity O(n^2 logn)

//         List<Integer> list =  new ArrayList<>();
//         for (int stone : stones){
//             list.add(stone);
//         }
//         while(list.size()>1){
//             Collections.sort(list);

//             int stone1=list.remove(list.size()-1);
//             int stone2=list.remove(list.size()-1);

//             if(stone1==stone2){
//                 continue;
//             }

//             list.add(stone1-stone2)
// ;        }
// return list.size()==0?0:list.get(0);

    //Optimize approach using HEAP

    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    for(int stone:stones){
        pq.add(stone);
    }

    while(pq.size()>1){
        int stone1=pq.poll();//1st last
        int stone2=pq.poll();//2nd last

        if(stone1==stone2){
            continue;
        }
        pq.add(stone1-stone2);
    }

    return pq.size()==0?0:pq.peek();

    }
}
