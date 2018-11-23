package common;

public final class Device {

    private int id;
    private long imei;
    private String name;


    public Device() {
    }

    public Device(long imei) {
        this.imei = imei;
    }

    public Device(long imei, String name) {
        this.imei = imei;
        this.name = name;
    }

    public Device(int id, long imei, String name) {
        this.id = id;
        this.imei = imei;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public long getImei() {
        return imei;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", imei=" + imei +
                ", name='" + name + '\'' +
                '}';
    }
}
