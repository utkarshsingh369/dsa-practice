package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AC_DFS {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            ArrayList<Integer[]> list = new ArrayList<>();
            list.add([2,3]);
            int n = sc.nextInt();
            int m = sc.nextInt();
            Map<Integer, ArrayList<Integer>> graph = new HashMap<>();

            for(int i=0;i<m;i++){
                int u= sc.nextInt();
                int v = sc.nextInt();
                graph.putIfAbsent(u, new ArrayList<>());
                graph.putIfAbsent(v, new ArrayList<>());
                graph.get(u).add(v);
                graph.get(v).add(u);
            }

            for(int i=1;i<=n;i++){
                System.out.println("""
                        BFS(%d):
                            %s
                        """.formatted(i, dfs(i,n,graph)));
            }
        }
    }
    static String dfs(Integer startNode, Integer noOfNodes, Map<Integer, ArrayList<Integer>> graph){
        boolean[] visited = new boolean[noOfNodes+1];
        ArrayList<Integer> res = new ArrayList<>();
        dfsUtil(startNode, visited, res, graph);
        return res.toString();
    }

    static void dfsUtil(Integer node, boolean[] visited, ArrayList<Integer> res, Map<Integer, ArrayList<Integer>> graph){
        visited[node] = true;
        res.add(node);

        for(Integer neighbor: graph.get(node)){
            if(!visited[neighbor]){
                dfsUtil(neighbor, visited, res, graph);
            }
        }
    }
}
