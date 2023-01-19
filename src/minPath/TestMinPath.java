package minPath;

import TopologicalOrdering.TopologicalOrdering;
import vertices.Edge;
import vertices.VtxEdg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TestMinPath {

    public static void main(String[] args) {

        VtxEdg s = new VtxEdg("s");
        VtxEdg a = new VtxEdg("a");
        VtxEdg b = new VtxEdg("b");
        VtxEdg c = new VtxEdg("c");
        VtxEdg d = new VtxEdg("d");
        VtxEdg e = new VtxEdg("e");

        s.addEdge(new Edge(a,1));
        s.addEdge(new Edge(c,2));
        c.addEdge(new Edge(a,4));
        c.addEdge(new Edge(d,3));
        a.addEdge(new Edge(b,6));
        b.addEdge(new Edge(d,1));
        b.addEdge(new Edge(e,2));
        d.addEdge(new Edge(e,1));

        List<VtxEdg> graph = new ArrayList<>(Arrays.asList(s, a, b, c, d, e));

        MinPath minPath = new MinPath(graph);
        minPath.printOrderedVertices();
        minPath.compute();
        graph.forEach(vtxEdg ->
                System.out.println("dist(s,"+ vtxEdg.getName() +") = " + vtxEdg.getMinDistance() +
                        "   " + vtxEdg));
    }
}
