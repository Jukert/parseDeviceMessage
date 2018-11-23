package dao.interfaces;

import common.Message;

import java.sql.SQLException;
import java.util.List;

public interface MessageDao {

    Message create(Message message) throws SQLException;

    void remove(String id);

    List<Message> findAll();

    Message findOne(int id);

    Message update(Message message);


}
