package app.travelalarmclock.route_generator.map_realization;

import java.util.ArrayList;
import java.util.List;

import app.travelalarmclock.route_generator.geolocation.MetroLineColor;
import app.travelalarmclock.route_generator.geolocation.MetroStation;

/**
 * Created by Юрий on 27.09.2015.
 */

/**
 * Класс хранит данные о метрополитене.
 */
public class MetroMap {
    /**
     * Количество станциий в метрополитене.
     */
    private int numberOfStations;
    /**
     * Количество веток в метрополитене.
     */
    private int numberOfLines;
    /**
     * Массив из веток мерополитена, каждая ветка представлена списком станций.
     */
    private List<List<MetroStation>> stations;
    /**
     * Двумерный массив с пересадочными станциями
     */
    private MetroStation lines[][];

    public MetroMap() {
        this.numberOfStations = 67;
        this.numberOfLines = 5;
        this.stations = new ArrayList<List<MetroStation>>();

        for (int i = 0; i < this.numberOfLines; i++)
            this.stations.add(new ArrayList<MetroStation>());
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Девяткино", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Гражданский проспект", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Академическая", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Политехническая", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Площадь Мужества", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Лесная", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Выборгская", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Площадь Ленина", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Чернышевская", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Площадь Восстания", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Владимирская", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Пушкинская", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Технологический институт 1", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Балтийская", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Нарвская", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Кировский завод", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Автово", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Ленинский проспект", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.RED.getCode()).add(new MetroStation("Проспект Ветеранов", 0.0, 0.0, MetroLineColor.RED));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Парнас", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Проспект Просвещения", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Озерки", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Удельная", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Пионерская", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Чёрная речка", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Петроградская", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Горьковская", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Невский проспект", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Сенная площадь", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Технологический институт 2", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Фрунзенская", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Московские ворота", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Электросила", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Парк Победы", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Московская", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Звёздная", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.BLUE.getCode()).add(new MetroStation("Купчино", 0.0, 0.0, MetroLineColor.BLUE));
        this.stations.get(MetroLineColor.GREEN.getCode()).add(new MetroStation("Приморская", 0.0, 0.0, MetroLineColor.GREEN));
        this.stations.get(MetroLineColor.GREEN.getCode()).add(new MetroStation("Василеостровская", 0.0, 0.0, MetroLineColor.GREEN));
        this.stations.get(MetroLineColor.GREEN.getCode()).add(new MetroStation("Гостиный двор", 0.0, 0.0, MetroLineColor.GREEN));
        this.stations.get(MetroLineColor.GREEN.getCode()).add(new MetroStation("Маяковская", 0.0, 0.0, MetroLineColor.GREEN));
        this.stations.get(MetroLineColor.GREEN.getCode()).add(new MetroStation("Площадь Александра Невского 1", 0.0, 0.0, MetroLineColor.GREEN));
        this.stations.get(MetroLineColor.GREEN.getCode()).add(new MetroStation("Елизаровская", 0.0, 0.0, MetroLineColor.GREEN));
        this.stations.get(MetroLineColor.GREEN.getCode()).add(new MetroStation("Ломоносовская", 0.0, 0.0, MetroLineColor.GREEN));
        this.stations.get(MetroLineColor.GREEN.getCode()).add(new MetroStation("Пролетарская", 0.0, 0.0, MetroLineColor.GREEN));
        this.stations.get(MetroLineColor.GREEN.getCode()).add(new MetroStation("Обухово", 0.0, 0.0, MetroLineColor.GREEN));
        this.stations.get(MetroLineColor.GREEN.getCode()).add(new MetroStation("Рыбацкое", 0.0, 0.0, MetroLineColor.GREEN));
        this.stations.get(MetroLineColor.ORANGE.getCode()).add(new MetroStation("Спасская", 0.0, 0.0, MetroLineColor.ORANGE));
        this.stations.get(MetroLineColor.ORANGE.getCode()).add(new MetroStation("Достоевская", 0.0, 0.0, MetroLineColor.ORANGE));
        this.stations.get(MetroLineColor.ORANGE.getCode()).add(new MetroStation("Лиговский проспект", 0.0, 0.0, MetroLineColor.ORANGE));
        this.stations.get(MetroLineColor.ORANGE.getCode()).add(new MetroStation("Площадь Александра Невского 2", 0.0, 0.0, MetroLineColor.ORANGE));
        this.stations.get(MetroLineColor.ORANGE.getCode()).add(new MetroStation("Новочеркасская", 0.0, 0.0, MetroLineColor.ORANGE));
        this.stations.get(MetroLineColor.ORANGE.getCode()).add(new MetroStation("Ладожская", 0.0, 0.0, MetroLineColor.ORANGE));
        this.stations.get(MetroLineColor.ORANGE.getCode()).add(new MetroStation("Проспект Большевиков", 0.0, 0.0, MetroLineColor.ORANGE));
        this.stations.get(MetroLineColor.ORANGE.getCode()).add(new MetroStation("Улица Дыбенко", 0.0, 0.0, MetroLineColor.ORANGE));
        this.stations.get(MetroLineColor.PURPLE.getCode()).add(new MetroStation("Комендантский проспект", 0.0, 0.0, MetroLineColor.PURPLE));
        this.stations.get(MetroLineColor.PURPLE.getCode()).add(new MetroStation("Старая Деревня", 0.0, 0.0, MetroLineColor.PURPLE));
        this.stations.get(MetroLineColor.PURPLE.getCode()).add(new MetroStation("Крестовский остров", 0.0, 0.0, MetroLineColor.PURPLE));
        this.stations.get(MetroLineColor.PURPLE.getCode()).add(new MetroStation("Чкаловская", 0.0, 0.0, MetroLineColor.PURPLE));
        this.stations.get(MetroLineColor.PURPLE.getCode()).add(new MetroStation("Спортивная", 0.0, 0.0, MetroLineColor.PURPLE));
        this.stations.get(MetroLineColor.PURPLE.getCode()).add(new MetroStation("Адмиралтейская", 0.0, 0.0, MetroLineColor.PURPLE));
        this.stations.get(MetroLineColor.PURPLE.getCode()).add(new MetroStation("Садовая", 0.0, 0.0, MetroLineColor.PURPLE));
        this.stations.get(MetroLineColor.PURPLE.getCode()).add(new MetroStation("Звенигородская", 0.0, 0.0, MetroLineColor.PURPLE));
        this.stations.get(MetroLineColor.PURPLE.getCode()).add(new MetroStation("Обводный канал", 0.0, 0.0, MetroLineColor.PURPLE));
        this.stations.get(MetroLineColor.PURPLE.getCode()).add(new MetroStation("Волковская", 0.0, 0.0, MetroLineColor.PURPLE));
        this.stations.get(MetroLineColor.PURPLE.getCode()).add(new MetroStation("Бухарестская", 0.0, 0.0, MetroLineColor.PURPLE));
        this.stations.get(MetroLineColor.PURPLE.getCode()).add(new MetroStation("Международная", 0.0, 0.0, MetroLineColor.PURPLE));


        this.lines = new MetroStation[this.numberOfLines][this.numberOfLines];
        this.lines[MetroLineColor.RED.getCode()][MetroLineColor.RED.getCode()] = getStation(null);
        this.lines[MetroLineColor.RED.getCode()][MetroLineColor.BLUE.getCode()] = getStation("Технологический институт 1");
        this.lines[MetroLineColor.RED.getCode()][MetroLineColor.GREEN.getCode()] = getStation("Площадь Восстания");
        this.lines[MetroLineColor.RED.getCode()][MetroLineColor.ORANGE.getCode()] = getStation("Владимирская");
        this.lines[MetroLineColor.RED.getCode()][MetroLineColor.PURPLE.getCode()] = getStation("Пушкинская");
        this.lines[MetroLineColor.BLUE.getCode()][MetroLineColor.RED.getCode()] = getStation("Технологический институт 2");
        this.lines[MetroLineColor.BLUE.getCode()][MetroLineColor.BLUE.getCode()] = getStation(null);
        this.lines[MetroLineColor.BLUE.getCode()][MetroLineColor.GREEN.getCode()] = getStation("Невский проспект");
        this.lines[MetroLineColor.BLUE.getCode()][MetroLineColor.ORANGE.getCode()] = getStation("Сенная площадь");
        this.lines[MetroLineColor.BLUE.getCode()][MetroLineColor.PURPLE.getCode()] = getStation("Сенная площадь");
        this.lines[MetroLineColor.GREEN.getCode()][MetroLineColor.RED.getCode()] = getStation("Маяковская");
        this.lines[MetroLineColor.GREEN.getCode()][MetroLineColor.BLUE.getCode()] = getStation("Гостиный двор");
        this.lines[MetroLineColor.GREEN.getCode()][MetroLineColor.GREEN.getCode()] = getStation(null);
        this.lines[MetroLineColor.GREEN.getCode()][MetroLineColor.ORANGE.getCode()] = getStation("Площадь Александра Невского 1");
        this.lines[MetroLineColor.GREEN.getCode()][MetroLineColor.PURPLE.getCode()] = getStation(null);
        this.lines[MetroLineColor.ORANGE.getCode()][MetroLineColor.RED.getCode()] = getStation("Достоевская");
        this.lines[MetroLineColor.ORANGE.getCode()][MetroLineColor.BLUE.getCode()] = getStation("Спасская");
        this.lines[MetroLineColor.ORANGE.getCode()][MetroLineColor.GREEN.getCode()] = getStation("Площадь Александра Невского 2");
        this.lines[MetroLineColor.ORANGE.getCode()][MetroLineColor.ORANGE.getCode()] = getStation(null);
        this.lines[MetroLineColor.ORANGE.getCode()][MetroLineColor.PURPLE.getCode()] = getStation("Спасская");
        this.lines[MetroLineColor.PURPLE.getCode()][MetroLineColor.RED.getCode()] = getStation("Звенигородская");
        this.lines[MetroLineColor.PURPLE.getCode()][MetroLineColor.BLUE.getCode()] = getStation("Садовая");
        this.lines[MetroLineColor.PURPLE.getCode()][MetroLineColor.GREEN.getCode()] = getStation(null);
        this.lines[MetroLineColor.PURPLE.getCode()][MetroLineColor.ORANGE.getCode()] = getStation("Садовая");
        this.lines[MetroLineColor.PURPLE.getCode()][MetroLineColor.PURPLE.getCode()] = getStation(null);

    }

    public List<List<MetroStation>> getStations() {
        return this.stations;
    }

    public int getNumberOfStations() {
        return this.numberOfStations;
    }

    public MetroStation[][] getLines() {
        return this.lines;
    }

    public int getNumberOfLines() {
        return this.numberOfLines;
    }

    public MetroStation getStation(String stationName) {
        if (stationName == null)
            return null;
        for (MetroLineColor lineColor : MetroLineColor.values()) {
            for (MetroStation station : this.getStations().get(lineColor.getCode())) {
                if (station.getName().equals(stationName))
                    return station;
            }
        }
        return null;
    }
}
