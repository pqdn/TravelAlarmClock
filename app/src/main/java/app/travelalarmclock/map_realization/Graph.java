package app.travelalarmclock.map_realization;

/**
 * Created by Юрий on 28.09.2015.
 */
public class Graph <Node> {
    private int numberOfStations;
    private int routes[][];
    private Node nodes[];

    public Graph (){
        this.numberOfStations=0;
        this.routes=null;
        this.nodes=null;
    }

    public Graph (int numberOfStations, int routes[][], Node stations[]) {
        this.numberOfStations=numberOfStations;
        this.routes=routes.clone();

    }

    public Graph (Graph obj) {
        this.numberOfStations=obj.numberOfStations;
    }
    }

}
