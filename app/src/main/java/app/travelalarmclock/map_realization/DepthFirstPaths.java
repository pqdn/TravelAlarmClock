package app.travelalarmclock.map_realization;

import java.util.ArrayList;

/**
 * Created by Юрий on 29.09.2015.
 */
public class DepthFirstPaths <NodeType> {
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
        for (Integer i : graph.neighbors(node))
            if (!marked[i]) {
                edgeTo[i] = node;
                dfs(graph, i);
            }
    }

    public boolean hasPathTo(int node) {
        return marked[node];
    }

    public Iterable<Integer> pathTo(int node) {
        if (!hasPathTo(node)) return null;
        ArrayList<Integer> path = new ArrayList<Integer>();
        for (int i = node; i != sourseNode; i = edgeTo[i])
            path.add(i);
        path.add(sourseNode);
        return path;
    }
}
