package app.travelalarmclock.navigation;

/**
 *  CoordinateGetter - Ключевой класс в пакете
 *
 *  По запросу возвращает координаты получиные либо при помощи gps модуля,
 *  либо при помощи анализа gsm/wi-fi сетей.
 *
 * @see GsmCoordinateGetter
 * @see GpsCoordinateGetter
 * @see CoordinatePoint
 *
 * @author Бабанин Максим
 * @version 1.0
 */
public class CoordinateGetter {
    GsmCoordinateGetter gsmCoordinateGetter;
    GpsCoordinateGetter gpsCoordinateGetter;

    public CoordinatePoint getCoordinate(){

        return null;
    }
}
