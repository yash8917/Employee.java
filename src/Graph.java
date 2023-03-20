import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    static class Edge{
         int src ;
         int dest;
         int weigth;
         public Edge(int s , int d , int w){
             this.src = s;
             this.dest = d ;
             this.weigth = w;
         }
    }
    public static void  createGraph(ArrayList<Edge> graph[]){
        for(int i = 0 ; i<graph.length ; i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0 ,2,2));

        graph[1].add(new Edge(1 ,2,10));
        graph[1].add(new Edge(1 ,3,0));

        graph[2].add(new Edge(2 ,0,2));
        graph[2].add(new Edge(2 ,1,10));
        graph[2].add(new Edge(2 ,3,-1));

        graph[3].add(new Edge(3 ,1,0));
        graph[3].add(new Edge(3 ,2,-1));

    }

    //Depth first search - it is that method in which we will find the traverse on the node which is unconnected

//    public void dfs(){
//        boolean[] visited = new boolean[V];
//        for(int v =0 ; v<V ; v++){
//            if(!visited[v]){
//                dfs(v,visited);
//            }
//        }
//    }
//    public void dfs(int v , boolean[] visited){
//        visited[v]= true;
//        System.out.println(v +" ");
//        for (int w : [v]){
//            if(!visited[w]){
//                dfs(w,visited);
//            }
//        }
//    }

//    Bfs
//    public void bfs(int s){
//        boolean[] visited = new boolean[V];
//        Queue<Integer> q = new LinkedList<>();
//        visited[s] = true;
//        q.offer(s);
//        while(!q.isEmpty()){
//            int u = q.poll();
//            System.out.println(u + " ");
//            for (int v: adj[u]) {
//                if(!visited[v]){
//                    visited[v] = true;
//                    q.offer(v);
//                }
//            }
//        }
//    }


    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
//        print 2's neibours
        createGraph(graph);
        for(int i = 0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.print("n->  "+e.dest+" w-> "+e.weigth+"\n");
        }
    }
}
