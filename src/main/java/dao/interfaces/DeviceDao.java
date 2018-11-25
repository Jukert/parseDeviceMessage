package dao.interfaces;

import common.Device;

import java.util.List;

public interface DeviceDao {

     Device create(Device device);

     void remove(String id);


     List<Device> findAll();

     Device findOne(int id);

     Device update(Device device);

     public Device findByImei(Long imei);

}
