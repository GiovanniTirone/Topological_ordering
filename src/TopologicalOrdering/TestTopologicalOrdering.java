package TopologicalOrdering;

import vertices.Vertex;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TestTopologicalOrdering {
    public static void main(String[] args) {
        List<Vertex> graphVertices = new ArrayList<>();
        graphVertices.add(new Vertex("0"));
        graphVertices.add(new Vertex("1"));
        graphVertices.add(new Vertex("2"));
        graphVertices.add(new Vertex("3"));
        graphVertices.add(new Vertex("4"));
        graphVertices.add(new Vertex("5"));

        graphVertices.get(2).addNeighbor(graphVertices.get(3));
        graphVertices.get(3).addNeighbor(graphVertices.get(1));
        graphVertices.get(4).addNeighbor(graphVertices.get(0));
        graphVertices.get(4).addNeighbor(graphVertices.get(1));
        graphVertices.get(5).addNeighbor(graphVertices.get(0));
        graphVertices.get(5).addNeighbor(graphVertices.get(2));

        TopologicalOrdering<Vertex> topOrd = new TopologicalOrdering<Vertex>();
        Stack<Vertex> stack = topOrd.order(graphVertices);
        topOrd.printOrderedVertices();
    }
}