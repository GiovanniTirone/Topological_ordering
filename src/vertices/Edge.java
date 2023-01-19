package vertices;

public class Edge {

    private VtxEdg target;
    private int weight;

    public Edge (VtxEdg target, int weight){
        this.target = target;
        this.weight = weight;
    }

    public VtxEdg getTarget (){
        return this.target;
    };

    public int getWeight() {
        return weight;
    }
}
