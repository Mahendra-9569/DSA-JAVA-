import java.util.*;

public class Graph {
    public static void dfs(int [][] graph, Boolean[] vis, int node){
        vis[node] = true;
        for(int i = 0; i<graph[node].length; i++){
            if(graph[node][i] == 1 && vis[i] == false){
                dfs(graph, vis, i);
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        
        // ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        // for (int i = 0; i < vertices; i++) {
        //     graph.add(new ArrayList<>());
        // }



        int graph[][] = new int[vertices][vertices];

    
        System.out.println("Enter edges (u v):");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

        
            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        Boolean vis[] = new Boolean[vertices];
        for(int i = 0; i<vertices; i++){
            vis[i] = false;
        }
        int cnt = 0;
        for (int i = 0; i < vertices; i++) {
            
            if(vis[i] == false){
                cnt++;
                dfs(graph, vis, i);
            }
        }

        System.out.print( "No of provinces: " + cnt);

    }
}
