package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

/*
 * 1. Traverse a graph using BFS, starting from all nodes
 */
public class AB_BFS {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            Map<Integer, ArrayList<Integer>> graph =  new HashMap<>();

            for(int i=0;i<m;i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                graph.putIfAbsent(u, new ArrayList<>());
                graph.putIfAbsent(v, new ArrayList<>());
                graph.get(u).add(v);
                graph.get(v).add(u);
            }

            for(int i = 1;i<=n;i++){
                System.out.println("""
                    BFS(%d):
                        %s
                """.formatted(i, bfs(graph,i,n)));
        
            }
        }
    }
    public static String bfs(Map<Integer, ArrayList<Integer>> graph, Integer i, Integer n){
        boolean[] visited = new boolean[n+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        visited[i]=true;
        ArrayList<Integer> ans= new ArrayList<>();
        while(!queue.isEmpty()){
            Integer node = queue.poll();
            for(Integer neighbor: graph.get(node)){
                if(!visited[neighbor]){
                    queue.add(neighbor);
                    visited[neighbor]= true;
                }
            }
            ans.add(node);
        }
        return ans.toString();
    }
}
