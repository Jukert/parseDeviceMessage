package reader;

import common.Device;
import common.Message;
import util.CoordinateUtil;
import util.DateUtil;

public class DataParser {

    public static Message getMessageLine(String line){
        String data[] = line.split(";");
        return new Message(
                new Device(
                       Long.parseLong(data[0])
               ),
                DateUtil.getUnix(data[1],data[2]),
                CoordinateUtil.coordinateConversion(data[5]),
                CoordinateUtil.coordinateConversion(data[3]),
                Integer.valueOf(data[7]),
                Integer.valueOf(data[8]),
                Integer.valueOf(data[9]),
                Integer.valueOf(data[10]),
                data[11]
        );
    }

}
