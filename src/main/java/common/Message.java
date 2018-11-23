package common;

public final class Message {


    private int id;
    private Device device;
    private long date;
    private double longitude;
    private double latitude;
    private int speed;
    private int course;
    private int height;
    private int sats;
    private String params;

    public Message() {
    }

    public Message(Device device, long date, double longitude, double latitude, int speed, int course, int height, int sats, String params) {
        this.device = device;
        this.date = date;
        this.longitude = longitude;
        this.latitude = latitude;
        this.speed = speed;
        this.course = course;
        this.height = height;
        this.sats = sats;
        this.params = params;
    }

    public Message(int id, Device device, long date, double longitude, double latitude, int speed, int course, int height, int sats, String params) {
        this.id = id;
        this.device = device;
        this.date = date;
        this.longitude = longitude;
        this.latitude = latitude;
        this.speed = speed;
        this.course = course;
        this.height = height;
        this.sats = sats;
        this.params = params;
    }

    public int getId() {
        return id;
    }

    public Device getDevice() {
        return device;
    }

    public long getDate() {
        return date;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCourse() {
        return course;
    }

    public int getHeight() {
        return height;
    }

    public int getSats() {
        return sats;
    }

    public String getParams() {
        return params;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", device=" + device.toString() +
                ", date=" + date +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", speed=" + speed +
                ", course=" + course +
                ", height=" + height +
                ", sats=" + sats +
                ", params='" + params + '\'' +
                '}';
    }
}
