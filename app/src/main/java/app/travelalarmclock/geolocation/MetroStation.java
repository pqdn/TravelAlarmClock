package app.travelalarmclock.geolocation;

/**
 * Created by Юрий on 27.09.2015.
 */
public class MetroStation implements Station {
    private String name;
    private Geolocation coordinates;
    private MetroLineColor color;

    public MetroStation() {
        this.name="";
        this.coordinates=new Geolocation(0, 0);
        this.color=MetroLineColor.NOCOLOR;
    }

    public MetroStation(String name, Geolocation coordinates, MetroLineColor color) {
        this.name = name;
        this.coordinates = coordinates;
        this.color = color;
    }

    public MetroStation(MetroStation obj){
        this(obj.getName(),obj.getGeolocation(),obj.getColor());
    }


    public MetroStation(String name, double latitude, double longitude, MetroLineColor color) {
        this.name = name;
        this.coordinates = new Geolocation(latitude, longitude);
        this.color = color;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public Geolocation getGeolocation(){
        //Geolocation returnCoordinates=new Geolocation(this.coordinates);
        return this.coordinates;
    }

    public void setGeolocation(Geolocation coordinates){
        this.coordinates= new Geolocation(coordinates);
    }

    public void setGeolocation(double latitude, double longitude) {
        this.coordinates = new Geolocation(latitude,longitude);
    }

    public MetroLineColor getColor() {
        return this.color;
    }

    public void setColor (MetroLineColor color){
        this.color=color;
    }

}
