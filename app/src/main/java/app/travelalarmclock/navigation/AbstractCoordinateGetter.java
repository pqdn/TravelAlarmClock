package app.travelalarmclock.navigation;

/**
 * Класс GsmCoordinateGetter содержит поля: координаты (coordinate) и ошибка измерений (inaccuracy)
 *
 * @author Бабанин Максим
 * @version 1.0
 */
abstract class AbstractCoordinateGetter {
    private CoordinatePoint coordinate;
    private double inaccuracy;

    public AbstractCoordinateGetter() {
        coordinate = new CoordinatePoint();
    }

    public CoordinatePoint getCoordinate() {
        return coordinate;
    }

    public double getInaccuracy() {
        return inaccuracy;
    }

    /**
     * Показывает возможно ли получить координаты мобильного устройства в данный момент времени
     * @return boolean
     */
    public abstract boolean isWork();

    /**
     * Обновить координаты мобильного устройства
     */
    public abstract void calculateCurrentPosition();
}
