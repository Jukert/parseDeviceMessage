package util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    private static final String patternDate = "ddMMyyHHmmss";

    public static long getUnix(String dateStr, String time){
        return LocalDateTime
                .parse(
                        dateStr+""+time,
                        DateTimeFormatter.ofPattern(patternDate)
                )
                .atZone(ZoneId.of("GMT+03:00"))
                .toEpochSecond();
    }
}
