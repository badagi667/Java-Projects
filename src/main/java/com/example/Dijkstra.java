package com.example;

import java.util.*;

public class Dijkstra {
    static class Edge {
        int target, weight;
        Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    public static Map<Integer, Integer> dijkstra(Map<Integer, List<Edge>> graph, int start) {
        // Distance map initialized to infinity
        Map<Integer, Integer> dist = new HashMap<>();
        for (int node : graph.keySet()) {
            dist.put(node, Integer.MAX_VALUE);
        }
        dist.put(start, 0);

        // Priority queue for greedy choice (smallest distance first)
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{start, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int currentDist = current[1];

            if (currentDist > dist.get(node)) continue;

            // Explore neighbors
            for (Edge edge : graph.get(node)) {
                int newDist = currentDist + edge.weight;
                if (newDist < dist.get(edge.target)) {
                    dist.put(edge.target, newDist);
                    pq.add(new int[]{edge.target, newDist});
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        // Graph represented as adjacency list
        Map<Integer, List<Edge>> graph = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            graph.put(i, new ArrayList<>());
        }

        // Add edges (undirected for example)
        graph.get(0).add(new Edge(1, 10));
        graph.get(0).add(new Edge(4, 5));
        graph.get(1).add(new Edge(2, 1));
        graph.get(1).add(new Edge(4, 2));
        graph.get(2).add(new Edge(3, 4));
        graph.get(3).add(new Edge(0, 7));
        graph.get(4).add(new Edge(1, 3));
        graph.get(4).add(new Edge(2, 9));
        graph.get(4).add(new Edge(3, 2));

        // Run Dijkstra
        Map<Integer, Integer> distances = dijkstra(graph, 0);

        // Print shortest distances
        for (int node : distances.keySet()) {
            System.out.println("Distance from 0 to " + node + " = " + distances.get(node));
        }
    }
}
