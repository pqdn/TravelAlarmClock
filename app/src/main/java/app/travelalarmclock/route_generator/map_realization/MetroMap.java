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
        stations = new ArrayList<List<MetroStation>>();

        stations.add(new ArrayList<MetroStation>());
        stations.get(0).add(new MetroStation("Девяткино", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Гражданский проспект	", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Академическая", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Политехническая", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Площадь Мужества", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Лесная", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Выборгская", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Площадь Ленина", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Чернышевская", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Площадь Восстания", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Владимирская", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Пушкинская", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Технологический институт 1", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Балтийская", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Нарвская", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Кировский завод", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Автово", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Ленинский проспект", 0.0, 0.0, MetroLineColor.RED));
        stations.get(0).add(new MetroStation("Проспект Ветеранов", 0.0, 0.0, MetroLineColor.RED));
        stations.add(new ArrayList<MetroStation>());
        stations.get(1).add(new MetroStation("Парнас", 0.0, 0.0, MetroLineColor.BLUE));
        stations.get(1).add(new MetroStation("Проспект Просвещения", 0.0, 0.0, MetroLineColor.BLUE));
        stations.get(1).add(new MetroStation("Озерки", 0.0, 0.0, MetroLineColor.BLUE));
        stations.get(1).add(new MetroStation("Удельная", 0.0, 0.0, MetroLineColor.BLUE));
        stations.get(1).add(new MetroStation("Пионерская", 0.0, 0.0, MetroLineColor.BLUE));
        stations.get(1).add(new MetroStation("Чёрная речка", 0.0, 0.0, MetroLineColor.BLUE));
        stations.get(1).add(new MetroStation("Петроградская", 0.0, 0.0, MetroLineColor.BLUE));
        stations.get(1).add(new MetroStation("Горьковская", 0.0, 0.0, MetroLineColor.BLUE));
        stations.get(1).add(new MetroStation("Невский проспект", 0.0, 0.0, MetroLineColor.BLUE));
        stations.get(1).add(new MetroStation("Сенная площадь", 0.0, 0.0, MetroLineColor.BLUE));
        stations.get(1).add(new MetroStation("Технологический институт 2", 0.0, 0.0, MetroLineColor.BLUE));
        stations.get(1).add(new MetroStation("Фрунзенская", 0.0, 0.0, MetroLineColor.BLUE));
        stations.get(1).add(new MetroStation("Московские ворота", 0.0, 0.0, MetroLineColor.BLUE));
        stations.get(1).add(new MetroStation("Электросила", 0.0, 0.0, MetroLineColor.BLUE));
        stations.get(1).add(new MetroStation("Парк Победы", 0.0, 0.0, MetroLineColor.BLUE));
        stations.get(1).add(new MetroStation("Московская", 0.0, 0.0, MetroLineColor.BLUE));
        stations.get(1).add(new MetroStation("Звёздная", 0.0, 0.0, MetroLineColor.BLUE));
        stations.get(1).add(new MetroStation("Купчино", 0.0, 0.0, MetroLineColor.BLUE));
        stations.add(new ArrayList<MetroStation>());
        stations.get(2).add(new MetroStation("Приморская", 0.0, 0.0, MetroLineColor.GREEN));
        stations.get(2).add(new MetroStation("Василеостровская", 0.0, 0.0, MetroLineColor.GREEN));
        stations.get(2).add(new MetroStation("Гостиный двор", 0.0, 0.0, MetroLineColor.GREEN));
        stations.get(2).add(new MetroStation("Маяковская", 0.0, 0.0, MetroLineColor.GREEN));
        stations.get(2).add(new MetroStation("Площадь Александра Невского 1", 0.0, 0.0, MetroLineColor.GREEN));
        stations.get(2).add(new MetroStation("Елизаровская", 0.0, 0.0, MetroLineColor.GREEN));
        stations.get(2).add(new MetroStation("Ломоносовская", 0.0, 0.0, MetroLineColor.GREEN));
        stations.get(2).add(new MetroStation("Пролетарская", 0.0, 0.0, MetroLineColor.GREEN));
        stations.get(2).add(new MetroStation("Обухово", 0.0, 0.0, MetroLineColor.GREEN));
        stations.get(2).add(new MetroStation("Рыбацкое", 0.0, 0.0, MetroLineColor.GREEN));
        stations.add(new ArrayList<MetroStation>());
        stations.get(3).add(new MetroStation("Спасская", 0.0, 0.0, MetroLineColor.ORANGE));
        stations.get(3).add(new MetroStation("Достоевская", 0.0, 0.0, MetroLineColor.ORANGE));
        stations.get(3).add(new MetroStation("Лиговский проспект", 0.0, 0.0, MetroLineColor.ORANGE));
        stations.get(3).add(new MetroStation("Площадь Александра Невского 2", 0.0, 0.0, MetroLineColor.ORANGE));
        stations.get(3).add(new MetroStation("Новочеркасская", 0.0, 0.0, MetroLineColor.ORANGE));
        stations.get(3).add(new MetroStation("Ладожская", 0.0, 0.0, MetroLineColor.ORANGE));
        stations.get(3).add(new MetroStation("Проспект Большевиков", 0.0, 0.0, MetroLineColor.ORANGE));
        stations.get(3).add(new MetroStation("Улица Дыбенко", 0.0, 0.0, MetroLineColor.ORANGE));
        stations.add(new ArrayList<MetroStation>());
        stations.get(4).add(new MetroStation("Комендантский проспект", 0.0, 0.0, MetroLineColor.PURPLE));
        stations.get(4).add(new MetroStation("Старая Деревня", 0.0, 0.0, MetroLineColor.PURPLE));
        stations.get(4).add(new MetroStation("Крестовский остров", 0.0, 0.0, MetroLineColor.PURPLE));
        stations.get(4).add(new MetroStation("Чкаловская", 0.0, 0.0, MetroLineColor.PURPLE));
        stations.get(4).add(new MetroStation("Спортивная", 0.0, 0.0, MetroLineColor.PURPLE));
        stations.get(4).add(new MetroStation("Адмиралтейская", 0.0, 0.0, MetroLineColor.PURPLE));
        stations.get(4).add(new MetroStation("Садовая", 0.0, 0.0, MetroLineColor.PURPLE));
        stations.get(4).add(new MetroStation("Звенигородская", 0.0, 0.0, MetroLineColor.PURPLE));
        stations.get(4).add(new MetroStation("Обводный канал", 0.0, 0.0, MetroLineColor.PURPLE));
        stations.get(4).add(new MetroStation("Волковская", 0.0, 0.0, MetroLineColor.PURPLE));
        stations.get(4).add(new MetroStation("Бухарестская", 0.0, 0.0, MetroLineColor.PURPLE));
        stations.get(4).add(new MetroStation("Международная", 0.0, 0.0, MetroLineColor.PURPLE));


        this.lines = new MetroStation[][]{{null, stations.get(0).get(12), stations.get(0).get(9), stations.get(0).get(10), stations.get(0).get(11)},
                {stations.get(1).get(10), null, stations.get(1).get(8), stations.get(1).get(9), stations.get(1).get(9)},
                {stations.get(2).get(4), stations.get(2).get(3), null, stations.get(3).get(5), null},
                {stations.get(3).get(1), stations.get(3).get(0), stations.get(1).get(3), null, stations.get(3).get(0)},
                {stations.get(4).get(7), stations.get(4).get(6), null, stations.get(4).get(6), null}};

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
}
