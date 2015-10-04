package app.travelalarmclock.route_generator.map_realization;

import java.util.ArrayList;
import java.util.List;

import app.travelalarmclock.route_generator.geolocation.MetroStation;

/**
 * Created by Юрий on 29.09.2015.
 */

/**
 * Класс хранит маршрут между двумя станциями метрополитена
 */
public class Route {
    /**
     * Список станций на маршруте
     */
    private List<MetroStation> route;
    /**
     * Свойство, отвечающее за наличие пересадок в маршруте
     */
    private boolean hasTransfer;
    /**
     * Список "опорных" станций: станция отправления, пересадочные станции каждой из веток маршрута,
     * станция прибытия
     */
    private List<MetroStation> transferStations;

    /**
     * Создает экземпляр маршрута по следующим входным параметрам:
     *
     * @param map - cхема метрополитена,
     * @param transferStations - список "опорных" станций.
     */
    public Route(MetroMap map, List<MetroStation> transferStations) {
        this.route = new ArrayList<MetroStation>();
        this.transferStations = transferStations;
        this.hasTransfer = this.transferStations.size() > 2;
        /*Для каждых двух станций одной ветки из списка промежуточных строится маршрут между ними
        и довбавляется к общему маршруту
         */
        for (int i = 0; i < this.transferStations.size() - 1; i += 2) {
            //this.route.add(transferStations.get(i));
            int lineNumber = transferStations.get(i).getColor().getCode();
            int begin = map.getStations()[lineNumber].indexOf(transferStations.get(i));
            int end = map.getStations()[lineNumber].indexOf(transferStations.get(i + 1));
            int sign = (end - begin) / Math.abs(end - begin);
            for (int j = begin; j != end; j = j + sign) {
                this.route.add(map.getStations()[lineNumber].get(j));
            }
            //this.route.add(transferStations.get(i+1));
        }
        this.route.add(transferStations.get(this.transferStations.size() - 1));
    }

    /**
     * Метод отвечающий за наличие пересадок
     * @return возвращает "true" при наличии пересадок и "false" при их отсутствии
     */
    public boolean getHasTransfer() {
        return this.hasTransfer;
    }

    /**
     * @return возвращает список станций на маршруте
     */
    public List<MetroStation> getRoute() {
        return this.route;
    }


    /**
     * @return возвращает список станций на маршруте
     */
    public List<MetroStation> getTransferStations() {
        return this.transferStations;
    }

}
