package app.travelalarmclock.route_generator.map_realization;

import java.util.ArrayList;
import java.util.List;

import app.travelalarmclock.route_generator.geolocation.MetroStation;

/**
 * Created by Юрий on 29.09.2015.
 */
public class Route {
    private List<MetroStation> route;
    private boolean hasTransfer;
    private List<MetroStation> transferStations;
    private int routeLenght;

    public Route(MetroStation stationsList[], Graph metroMap, List<Integer> path) {
        this.route = new ArrayList<MetroStation>();
        this.transferStations = new ArrayList<MetroStation>();
        this.hasTransfer = false;
        this.routeLenght = 0;

        for (int i = 0; i < path.size(); i++) {
            this.route.add(stationsList[path.get(i)]);
            if (this.route.size() > 1) {
                if ((route.get(i - 1).getColor()) != (route.get(i).getColor())) {
                    this.hasTransfer = true;
                    transferStations.add(route.get(i - 1));
                }
                this.routeLenght+=metroMap.getRouteWeight(path.get(i-1),path.get(i));
            }
        }
    }

    public boolean hasTransfer() {
        return this.hasTransfer;
    }

    public List<MetroStation> getRoute (){
        return  this.route;
    }



}
