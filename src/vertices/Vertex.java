package vertices;

import java.util.ArrayList;
import java.util.Collection;

public class Vertex implements  IVertex<Vertex> {

    private String name;
    private boolean visited;
    private Collection<Vertex> neighbors;

    public Vertex (String name) {
        this.name = name;
        this.visited = false;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor (Vertex vertex){
        this.neighbors.add(vertex);
    }


    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Collection<Vertex> getNeighbors() {
        return neighbors;
    }



    @Override
    public String toString () {
        return "vertices.Vertex: " + this.name;
    }


}
