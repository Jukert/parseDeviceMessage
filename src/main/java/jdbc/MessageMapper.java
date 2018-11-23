package jdbc;

import common.Device;
import common.Message;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageMapper implements RowMapper<Message> {
    @Override
    public Message mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Message(
                new Device(
                        rs.getInt("id"),
                        rs.getLong("imei"),
                        rs.getString("name")
                ),
                rs.getInt("date"),
                rs.getDouble("longitude"),
                rs.getDouble("latitude"),
                rs.getInt("speed"),
                rs.getInt("course"),
                rs.getInt("height"),
                rs.getInt("sats"),
                rs.getString("params")
        );
    }
}
