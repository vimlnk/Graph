package app;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        System.out.println("Граф після додавання вершин і ребер:");
        graph.printGraph();

        System.out.println("Чи існує вершина 1? " + graph.hasVertex(1));
        System.out.println("Чи існує ребро між 1 і 2? " + graph.hasEdge(1, 2));


        graph.removeVertex(2);

        System.out.println("Граф після видалення вершини 2:");
        graph.printGraph();


        graph.addEdge(1, 3);
        graph.removeEdge(1, 3);


        System.out.println("Граф після видалення ребра між 1 і 3:");
        graph.printGraph();
    }
}