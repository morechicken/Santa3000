import java.io.Serializable;

public class Coordinate implements Serializable{

    private double latitude;
    private double longitude;

    public Coordinate(double pLatitude, double pLongitude) {
        latitude = pLatitude;
        longitude = pLongitude;
    }

    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }
    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }
}
