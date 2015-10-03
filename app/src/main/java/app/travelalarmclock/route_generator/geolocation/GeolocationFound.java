package app.travelalarmclock.route_generator.geolocation;

/**
 * Created by Юрий on 28.09.2015.
 */
public class GeolocationFound extends Geolocation {
    private double precision; //погрешность определения

    public GeolocationFound() {
        super();
        this.precision = 0;
    }

    public GeolocationFound(GeolocationFound obj) {
        super(obj);
        this.precision = obj.precision;
    }

    public GeolocationFound(double latitude, double longitude, double precision) {
        super(latitude, longitude);
        this.precision = precision;
    }

    public GeolocationFound(String Coordinates) {
        super(Coordinates);
        //пока неизвестен формат строки
    }

    public void set(double latitude, double longitude, double precision) {
        super.set(latitude, longitude);
        this.precision = precision;
    }

    public void set(String Coordinates) {
        super.set(Coordinates);
        //пока неизвестен формат строки
    }
}
