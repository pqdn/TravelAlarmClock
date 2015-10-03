package app.travelalarmclock.route_generator.map_realization;

import java.util.ArrayList;
import java.util.List;

import app.travelalarmclock.route_generator.geolocation.MetroStation;

/**
 * Created by Юрий on 04.10.2015.
 */
public class RoutesBuilder {
    private List<Route> rotes;

    public RoutesBuilder(MetroMap metroMap, MetroStation initialStation, MetroStation finalStation) {
        this.rotes = new ArrayList<Route>();
        List<MetroStation> transferStations;
        for (int i = 0; i < metroMap.getNumberOfLines(); i++) {
            transferStations = new ArrayList<MetroStation>();
            transferStations.add(initialStation);
            if (metroMap.getLines()[initialStation.getColor().getCode()][i] != null)
                transferStations.add(metroMap.getLines()[initialStation.getColor().getCode()][i]);
            if (metroMap.getLines()[i][initialStation.getColor().getCode()] != null)
                transferStations.add(metroMap.getLines()[i][initialStation.getColor().getCode()]);
            if (metroMap.getLines()[i][finalStation.getColor().getCode()] != null)
                transferStations.add(metroMap.getLines()[i][finalStation.getColor().getCode()]);
            if (metroMap.getLines()[finalStation.getColor().getCode()][i] != null)
                transferStations.add(metroMap.getLines()[finalStation.getColor().getCode()][i]);
            transferStations.add(finalStation);
            this.rotes.add(new Route(metroMap, transferStations));
            if (!rotes.get(i).getHasTransfer())
                break;
        }
    }

    List<Route> getRotes() {
        return this.rotes;
    }

}
