package com.example.algorithmtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassroomGraph {
    private Map<String, List<Edge>> adjacencyList;

    public ClassroomGraph() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(String vertex) {
        adjacencyList.put(vertex, new ArrayList<>());
    }

    public void addEdge(String source, String destination, int weight) {
        adjacencyList.get(source).add(new Edge(destination, weight));
        adjacencyList.get(destination).add(new Edge(source, weight));
    }

    public List<Edge> getNeighbors(String vertex) {
        return adjacencyList.getOrDefault(vertex, new ArrayList<>());
    }

    public static class Edge {
        private String destination;
        private int weight;

        public Edge(String destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }

        public String getDestination() {
            return destination;
        }

        public int getWeight() {
            return weight;
        }
    }
}
