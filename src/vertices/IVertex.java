package vertices;

import java.util.Collection;

public interface IVertex <V extends IVertex>{

    String getName ();

    boolean isVisited () ;

    void setVisited (boolean visited);

    Collection<V> getNeighbors ();


}
