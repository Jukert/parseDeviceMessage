package jdbc;

import common.Device;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DeviceMapper implements RowMapper<Device> {
    @Override
    public Device mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Device(
                rs.getInt("id"),
                rs.getLong("imei"),
                rs.getString("name")
        );
    }
}
