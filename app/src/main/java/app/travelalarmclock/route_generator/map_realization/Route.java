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

    public Route(MetroMap map, List<MetroStation> transferStations) {
        this.route = new ArrayList<MetroStation>();
        this.transferStations = transferStations;
        this.hasTransfer = this.transferStations.size() > 2;

        for (int i = 0; i < this.transferStations.size() - 1; i++) {
            this.route.add(transferStations.get(i));
            int lineNumber = transferStations.get(i).getColor().getCode();
            int begin = map.Stations()[lineNumber].indexOf(transferStations.get(i));
            int end = map.Stations()[transferStations.get(i + 1).getColor().getCode()].indexOf(transferStations.get(i + 1));
            int sign = (end - begin) / Math.abs(end - begin);
            for (int j = begin; j != end; j = j + sign) {
                this.route.add(map.Stations()[lineNumber].get(j));
            }
        }
        this.route.add(transferStations.get(this.transferStations.size() - 1));
    }

    public boolean hasTransfer() {
        return this.hasTransfer;
    }

    public List<MetroStation> getRoute() {
        return this.route;
    }

    public List<MetroStation> getTransferStations() {
        return this.transferStations;
    }

}
