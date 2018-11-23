package dao;

import common.Device;
import dao.interfaces.DeviceDao;
import jdbc.DeviceMapper;
import jdbc.JdbcDaoTemplate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeviceDaoDb extends JdbcDaoTemplate implements DeviceDao {


    @Override
    public Device create(Device device) {

        String sql =
                "INSERT INTO device (imei, name) " +
                        "VALUES (?,?)";

        List<Object> deviceProp = new ArrayList<>();
        deviceProp.add(device.getImei());
        deviceProp.add(device.getName());

        try {
            queryUpdate(sql,deviceProp);
            return device;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void remove(String id) {
        throw new IllegalArgumentException("Not found this object");
    }

    @Override
    public List<Device> findAll() {

        String sql =
                "SELECT id,imei " +
                        "FROM device";

        List<Device> devices = new ArrayList<>();
        return devices;
    }

    @Override
    public Device findOne(int id) {
        throw new IllegalArgumentException("Not found this object");
    }

    @Override
    public Device update(Device device) {
        throw new IllegalArgumentException("Not found this object");
    }

    public Device findByImei(Long imei) {
        String sql =
                "SELECT id,imei,name " +
                        "FROM device " +
                        "WHERE imei=?";

        List<Object> deviceProp = new ArrayList<>();
        deviceProp.add(imei);
        List<Device> device = null;
        try {
            device = query(sql, deviceProp, new DeviceMapper());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (device.size() > 0)
            return device.get(0);
        else
            return null;
    }
}
