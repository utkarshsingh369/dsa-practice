/*
 * 1. Take input for 1-indexed weighted undirected graph.
 * 2. Represent using adjacency list.
 * 3. Traverse by starting on all nodes using BFS
 */

package graph;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;

public class AA_Representation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Map<Integer,ArrayList<Edge>> graph = new HashMap<>();

        int n = sc.nextInt();

        int m = sc.nextInt();

        for(int i=0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w));
        }

        System.out.println("GRAPH::");
        for(int i = 0;i<=n;i++){
            System.out.println(i+": "+graph.getOrDefault(i, new ArrayList<>()));
        }
    }

    static class Edge{
        int node;
        int weight;
        Edge(int node, int weight){
            this.node = node;
            this.weight = weight;
        }
        @Override
        public String toString() {
            return """
            [%d, %d]""".formatted(this.node, this.weight);
        }
    }
    
 }