package app.travelalarmclock.navigation;

/**
 * @author Бабанин Максим
 * @version 1.0
 *
 * Класс содержит заданные координаты широты (latitude) и долготы (longitude)
 */
public class CoordinatePoint {
    private double lat;
    private double lon;

    public CoordinatePoint() {
        setPoint(0, 0);
    }

    public CoordinatePoint(double lon, double lat){
        setPoint(lon, lat);
    }


    /**
     * @return Возвращает значение широты
     */
    public double getLat() {
        return lat;
    }

    /**
     * Установить значение широты
     * @param lat Широта
     */
    public void setLat(double lat) {
        this.lat = lat;
    }

    /**
     * @return Возвращает значение долготы
     */
    public double getLon() {
        return lon;
    }

    /**
     * Установить значение долготы
     * @param lon Долгота
     */
    public void setLon(double lon) {
        this.lon = lon;
    }

    /**
     * Установить значение широты и долготы
     * @param lon Долгота
     * @param lat Широта
     */
    public void setPoint(double lon, double lat){
        this.setLat(lat);
        this.setLon(lon);
    }

    /**
     * @return Возвращает новый объект CoordinatePoint, с такими же координатами
     */
    public CoordinatePoint getPoint(){
        return new CoordinatePoint(getLon(), getLat());
    }

    @Override
    public String toString() {
        return "latitude:" + getLat() + " longitude: "  + getLon();
    }
}
