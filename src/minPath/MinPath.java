package minPath;

import TopologicalOrdering.TopologicalOrdering;
import vertices.Edge;
import vertices.Vertex;
import vertices.VtxEdg;

import java.util.List;
import java.util.Stack;

public class MinPath {

    private TopologicalOrdering<VtxEdg> topOrd;

    private List<VtxEdg> graph;

    private Stack<VtxEdg> orderedGraph;

    public MinPath (List<VtxEdg> graph){
        this.topOrd = new TopologicalOrdering<VtxEdg>();
        this.orderedGraph = topOrd.order(graph);
        orderedGraph.peek().setMinDistance(0);
        this.graph = graph;
    }

    public void compute (){
        while(!orderedGraph.isEmpty()){
            VtxEdg u = orderedGraph.pop();
            for(Edge e : u.getAdjacencyEdgesList()){
                VtxEdg v = e.getTarget();
                if(v.getMinDistance() > e.getWeight() + u.getMinDistance()){
                    v.setMinDistance(u.getMinDistance()+e.getWeight());
                    v.setPredecessor(u);
                }
            }
        }
    }

    public void printOrderedVertices () {
        topOrd.printOrderedVertices();
    }

}
