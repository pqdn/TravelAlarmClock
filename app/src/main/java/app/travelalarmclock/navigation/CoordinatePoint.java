package app.travelalarmclock.navigation;

/**
 * Класс CoordinatePoint содержит поля:  координата широты (latitude) и координата долготы (longitude)
 *
 * @author Бабанин Максим
 * @version 1.0
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

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

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
