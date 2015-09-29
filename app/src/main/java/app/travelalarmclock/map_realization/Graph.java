package app.travelalarmclock.map_realization;

import java.util.ArrayList;

/**
 * Created by Юрий on 28.09.2015.
 */
public class Graph <NodeType> {
    private int numberOfNodes;
    private int routes[][];

    public Graph (int numberOfNodes, int routes[][], int nodes[]) {
        this.numberOfNodes=numberOfNodes;
        this.routes=routes;
    }

    public int numberOfNodes(){
        return this.numberOfNodes;
    }

    public ArrayList<Integer> neighbors(int node){
        ArrayList<Integer> neighbors = new ArrayList<Integer>();
        for (int i=0; i<this.numberOfNodes; i++){
            if (this.routes[node][i]!=0)
                neighbors.add(i);
        }
        return neighbors;
    }

    public int getRouteWeight (int node1, int node2){
        return this.routes[node1][node2];
    }

    public void setRouteWeight (int node1, int node2, int weight){
        this.routes[node1][node2]=weight;
    }

}
