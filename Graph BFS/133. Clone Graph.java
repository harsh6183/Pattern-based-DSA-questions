/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }

        //Making the map to store the node and edge values
        Map<Node,Node> map = new HashMap<>();
        //Using the BFS to clone the graph level wise
        Queue<Node> queue= new ArrayDeque<>();

        queue.add(node);
        map.put(node,new Node(node.val,new ArrayList<>()));

        //BFS methodology 
        while(!queue.isEmpty()){
            Node h = queue.poll();

            for(Node neighbor:h.neighbors){

                //Simply means exploring adjacent nodes & if the adjacent of the node is not present in the map then add them 
                if(!map.containsKey(neighbor)){
                    map.put(neighbor, new Node(neighbor.val,new ArrayList<>()));
                    queue.add(neighbor);
                }

                //This is to get the neighborhood nodes to first node
                map.get(h).neighbors.add(map.get(neighbor));
            }
        }

        return map.get(node);
    }
}
