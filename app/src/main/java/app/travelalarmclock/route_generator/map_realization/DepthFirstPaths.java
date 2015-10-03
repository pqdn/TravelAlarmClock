package app.travelalarmclock.route_generator.map_realization;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Юрий on 29.09.2015.
 */
public class DepthFirstPaths {
    private boolean[] marked;
    private int[] edgeTo;
    private int sourseNode;

    public DepthFirstPaths(Graph graph, int sourseNode) {
        this.marked = new boolean[graph.numberOfNodes()];
        this.edgeTo = new int[graph.numberOfNodes()];
        this.sourseNode = sourseNode;
        dfs(graph, sourseNode);
    }

    private void dfs(Graph graph, int node) {
        marked[node] = true;
        List<Integer> buffer = graph.neighbors(node);
        for (Integer i : buffer)
            if (!marked[i]) {
                edgeTo[i] = node;
                dfs(graph, i);
            }
    }

    public boolean hasPathTo(int node) {
        return marked[node];
    }

    public List<Integer> pathTo(int node) {
        if (!hasPathTo(node)) return null;
        List<Integer> path = new ArrayList<Integer>();
        for (int i = node; i != sourseNode; i = edgeTo[i])
            path.add(i);
        path.add(sourseNode);
        return path;
    }
}
