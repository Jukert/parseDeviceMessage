package jdbc;

import org.postgresql.ds.PGPoolingDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcDaoTemplate {

    private PGPoolingDataSource poolingSource = PoolingSource.getDatasourse();
    private DataSource dataSource;

    public JdbcDaoTemplate(DataSource dataSource) {//using jndi
        if (dataSource == null) {
            throw new IllegalArgumentException("Data source is null");
        }
        this.dataSource = dataSource;
    }


    public JdbcDaoTemplate() {

    }


    public<T> List<T> query(String sql, List<Object> parameters, RowMapper<T> mapper) throws SQLException {
        try (Connection conn = poolingSource.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);

            int i = 0;
            for (Object param : parameters) {
                ps.setObject(++i, param);
            }

            ResultSet rs = ps.executeQuery();

            List<T> items = new ArrayList<>();
            i = 0;
            while (rs.next()) {//row mapper...
                items.add(mapper.mapRow(rs, ++i));
            }
            return items;
        }
    }


    public int queryUpdate(String sql, List<Object> parameters) throws SQLException {
        try (Connection conn = poolingSource.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);

            int i = 0;
            for (Object param : parameters) {
                    ps.setObject(++i, param);
            }
            return ps.executeUpdate();
        }
    }


}
