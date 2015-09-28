package app.travelalarmclock.geolocation;

/**
 * Created by Юрий on 28.09.2015.
 */
public interface Station {
    String getName();

    void setName(String name);

    Geolocation getGeolocation();

    void setGeolocation(Geolocation coordinates);

    void setGeolocation(double latitude, double longitude);
}
