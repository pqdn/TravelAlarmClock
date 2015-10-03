package app.travelalarmclock.route_generator;

import java.util.ArrayList;
import java.util.List;

import app.travelalarmclock.route_generator.geolocation.MetroStation;
import app.travelalarmclock.route_generator.map_realization.DepthFirstPaths;
import app.travelalarmclock.route_generator.map_realization.Graph;
import app.travelalarmclock.route_generator.map_realization.Route;

/**
 * Created by Юрий on 30.09.2015.
 */
public class RouteBuilder {
    private List<Route> rotes;

    public RouteBuilder(List<MetroStation> stationsList, Graph metroMap, MetroStation initialStation, MetroStation finalStation){
        rotes = new ArrayList<Route>();
        DepthFirstPaths routeSearch = new DepthFirstPaths(metroMap, stationsList.indexOf(initialStation));

    }

}
