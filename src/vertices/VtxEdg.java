package vertices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class VtxEdg implements IVertex<VtxEdg>{

    private String name;
    private boolean visited;
    private int minDistance;
    private VtxEdg predecessor;
    private List<Edge> adjacencyEdgesList;

    public VtxEdg (String name) {
        this.name = name;
        this.minDistance = Integer.MAX_VALUE;
        this.adjacencyEdgesList = new ArrayList<>();
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isVisited() {
        return this.visited;
    }

    @Override
    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(int minDistance) {
        this.minDistance = minDistance;
    }

    public VtxEdg getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(VtxEdg predecessor) {
        this.predecessor = predecessor;
    }

    public List<Edge> getAdjacencyEdgesList() {
        return adjacencyEdgesList;
    }

    @Override
    public Collection<VtxEdg> getNeighbors() {
        return this.adjacencyEdgesList.stream().map(Edge::getTarget).toList();
    }

    public void addEdge (Edge edge) {
        this.adjacencyEdgesList.add(edge);
    }



    @Override
    public String toString () {
        String predecessorStr = predecessor == null ? "" :  predecessor + " --> ";
        return  predecessorStr + name;
    }
}
