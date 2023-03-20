public class Adj_Matrix {
    private int V; // no of vertex's
    private int E; //no of edges
    int[][] addMatrix;


    // constructer
    public Adj_Matrix(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.addMatrix = new int[nodes][nodes];
    }

    // method for storing the values
    public void addEdge(int u, int v) {
        this.addMatrix[u][v] = 1;
        this.addMatrix[v][u] = 1; // becz undirected graph there is two way of the traversal
        E++;
    }

    // for printing the Add_Matrix
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertex's,  " + E + " Edges " + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for (int w : addMatrix[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Adj_Matrix g = new Adj_Matrix(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        System.out.println(g);


    }


}