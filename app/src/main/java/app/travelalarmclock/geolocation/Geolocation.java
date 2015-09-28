package app.travelalarmclock.geolocation;

/**
 * Created by Юрий on 28.09.2015.
 */
public class Geolocation {
    private double latitude; //широта
    private double longitude; //долгота
    //private double altitude; //высота над уровнем моря

    public Geolocation() {
        this.latitude = 0;
        this.longitude = 0;
    }

    public Geolocation(Geolocation obj) {
        this.latitude = obj.latitude;
        this.longitude = obj.longitude;
    }

    public Geolocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Geolocation(String Coordinates) {
        //пока неизвестен формат строки
    }

    public void set(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void set(String Coordinates) {
        //пока неизвестен формат строки
    }

}
