package app.travelalarmclock.route_generator.map_realization;


import org.junit.Test;

import java.util.List;

import app.travelalarmclock.route_generator.MetroMap;

/**
 * Created by Юрий on 03.10.2015.
 */
public class DepthFirstPathsTest {

    @Test
    public void testPathTo() throws Exception {
        int sourceNode = 7;
        int destinationNode = 23;
        MetroMap map = new MetroMap();
        Graph graph = new Graph(map.NumberOfStations(),map.RoutesMatrix());
        DepthFirstPaths dfs = new DepthFirstPaths(graph, sourceNode);
        List<Integer> routeInt = dfs.pathTo(destinationNode);
        Route routeMap = new Route(map.StationsList(), graph, routeInt);
        for (int i=0; i<routeMap.getRoute().size(); i++){
            System.out.println(routeMap.getRoute().get(i).getName());
        }

    }
}