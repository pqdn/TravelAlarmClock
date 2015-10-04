package app.travelalarmclock;

import android.app.Activity;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;


import java.util.List;

import app.travelalarmclock.route_generator.geolocation.MetroLineColor;
import app.travelalarmclock.route_generator.geolocation.MetroStation;
import app.travelalarmclock.route_generator.map_realization.MetroMap;
import app.travelalarmclock.route_generator.map_realization.Route;
import app.travelalarmclock.route_generator.map_realization.RoutesBuilder;

import static org.junit.Assert.assertTrue;


/**
 * Created by Юрий on 04.10.2015.
 */

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class RoutesBuilderTest {
    @Test
    public void NoTransferRouteTest() throws Exception{
        Log.d("routeTest","Start");
        MetroMap map = new MetroMap();
        RoutesBuilder routesBuilder = new RoutesBuilder(map,
                map.getStations().get(MetroLineColor.RED.getCode()).get(3),
                map.getStations().get(MetroLineColor.RED.getCode()).get(11));
        List<Route> rotes;
        rotes=routesBuilder.getRotes();

        for (Route rote:rotes){
            for (MetroStation station:rote.getRoute()){
                //System.out.println(station.getName());
            }
        }
    }
    @Test
    public void OneTransferRouteTest() throws Exception{
        Log.d("routeTest","Start");
        MetroMap map = new MetroMap();
        RoutesBuilder routesBuilder = new RoutesBuilder(map,
                map.getStations().get(MetroLineColor.RED.getCode()).get(3),
                map.getStations().get(MetroLineColor.BLUE.getCode()).get(16));
        List<Route> rotes;
        rotes=routesBuilder.getRotes();

        for (Route rote:rotes){
            System.out.println("Маршрут:");
            for (MetroStation station:rote.getRoute()){
                System.out.println(station.getName());
            }
        }
    }
}
