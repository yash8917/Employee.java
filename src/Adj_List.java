import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Adj_List {

//    we implement the adj list in the form of -> Array of ArrayList

    static class Edge{
        int src ;
        int dest;
        int wt;

        public Edge(int src, int dest , int wt) {
            this.src = src;
            this.dest = dest;
            this.wt=wt;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,3));
        graph[2].add(new Edge(2,1,4));
        graph[2].add(new Edge(2,3,-10));

        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,54));
    }

    public static void bfs(ArrayList<Edge> graph[] , int V){
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        boolean[] vis = new boolean[V];
        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                vis[curr] = true;
                System.out.print("Visited :"+ curr+" ");
                //print thee neighbour
                 for (int i = 0; i < graph[curr].size() ; i++) {
                     Edge e = graph[curr].get(i);
                     q.add(e.dest);
                }

            }
            }
        }


    public static void main(String[] args) {
        int V =4;

        ArrayList<Edge> graph[] =new ArrayList[V];
        createGraph(graph);
//        print 2's neighbour
//        for (int i = 0; i < graph[2].size(); i++) {
//            Edge e =graph[2].get(i);
//            System.out.println(e.dest+" "+e.wt);
//        }
    bfs(graph,V);

    }

}
