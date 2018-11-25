import common.Message;
import dao.DeviceDaoDb;
import dao.MessageDaoDb;
import dao.interfaces.MessageDao;
import reader.MessageReader;

import java.sql.SQLException;

public class Application {

    public static void main(String[] args) {

        MessageReader reader = new MessageReader("C:\\Users\\User\\Desktop\\programms\\Java\\parsedate\\src\\main\\resources\\data\\messages_backup.txt");
        MessageDao messageDao = new MessageDaoDb(new DeviceDaoDb());

        try {
            for (Message d :
                    reader.read()) {
                messageDao.create(d);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
