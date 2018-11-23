package util;

public class CoordinateUtil {

    public static Double coordinateConversion(String lat){
        return round(
                round(Double.valueOf(lat)/100,0)
                        + (round(Double.valueOf(lat),0)%100)/60
                        + (Double.valueOf(lat.substring(lat.indexOf("."))))/36,
                6);
    }


    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        if (String.valueOf(value).length()>places){
            long factor = (long) Math.pow(10, places);
            value = value * factor;
            int tmp = (int)value;
            return (double) tmp / factor;
        }
        return value;
    }
}
