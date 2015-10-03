package app.travelalarmclock.route_generator.map_realization;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Юрий on 28.09.2015.
 */
public class Graph {
    private int numberOfNodes;
    private int routes[][];

    public Graph(int numberOfNodes, int routes[][]) {
        this.numberOfNodes = numberOfNodes;
        this.routes = new int[this.numberOfNodes][this.numberOfNodes];
        for (int i=0; i<this.numberOfNodes; i++){
            for (int j=0; j<this.numberOfNodes; j++){
                this.routes[i][j]=routes[i][j];
            }
        }

    }

    public int numberOfNodes() {
        return this.numberOfNodes;
    }

    public List<Integer> neighbors(int node) {
        List<Integer> neighbors = new ArrayList<Integer>();
        for (int i = 0; i < node; i++) {
            if (this.routes[node][i] != 0)
                neighbors.add(i);
        }
        return neighbors;
    }

    public int getRouteWeight(int node1, int node2) {
        return this.routes[node1][node2];
    }

    public void setRouteWeight(int node1, int node2, int weight) {
        this.routes[node1][node2] = weight;
    }

    public void deleteRoute(int node1, int node2) {
        this.routes[node1][node2] = 0;
    }
}
