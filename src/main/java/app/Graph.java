package app;

import java.util.*;

    public class Graph {
        private Map<Integer, Set<Integer>> adjacencyList;

        public Graph() {
            this.adjacencyList = new HashMap<>();
        }


        public void addVertex(int vertex) {
            adjacencyList.putIfAbsent(vertex, new HashSet<>());
        }


        public void addEdge(int source, int destination) {
            addVertex(source);
            addVertex(destination);
            adjacencyList.get(source).add(destination);
            adjacencyList.get(destination).add(source); // Для неорієнтованого графа
        }


        public void removeVertex(int vertex) {
            if (adjacencyList.containsKey(vertex)) {
                // Видалити всі ребра, пов'язані з вершиною
                for (int adjacent : adjacencyList.get(vertex)) {
                    adjacencyList.get(adjacent).remove(vertex);
                }
                adjacencyList.remove(vertex);
            }
        }


        public void removeEdge(int source, int destination) {
            if (adjacencyList.containsKey(source)) {
                adjacencyList.get(source).remove(destination);
            }
            if (adjacencyList.containsKey(destination)) {
                adjacencyList.get(destination).remove(source);
            }
        }

        // Перевірка наявності вершини
        public boolean hasVertex(int vertex) {
            return adjacencyList.containsKey(vertex);
        }

        // Перевірка наявності ребра
        public boolean hasEdge(int source, int destination) {
            return adjacencyList.containsKey(source) && adjacencyList.get(source).contains(destination);
        }

        public void printGraph() {
            for (int vertex : adjacencyList.keySet()) {
                System.out.println(vertex + " -> " + adjacencyList.get(vertex));
            }
        }


    }


