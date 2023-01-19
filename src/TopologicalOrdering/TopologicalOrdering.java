package TopologicalOrdering;

import vertices.IVertex;
import vertices.Vertex;

import java.util.Collection;
import java.util.Stack;

public class TopologicalOrdering<V extends IVertex<V>> {

    private Stack<V> stack;

    public TopologicalOrdering () {
        this.stack = new Stack<>();
    }


    private void dfs (V vertex) {
        vertex.setVisited(true);
        for(V v : vertex.getNeighbors())
            if(!v.isVisited()) dfs(v);
        this.stack.push(vertex);
    }

    public Stack<V> order (Collection<V> graphVertices){
        for(V v : graphVertices)
            if(!v.isVisited())
                dfs(v);
        return this.stack;
    }

    public void printOrderedVertices () {
        for(int i=this.stack.size()-1 ; i>=0; i--){
            System.out.println(stack.get(i));
        }
    }


}
