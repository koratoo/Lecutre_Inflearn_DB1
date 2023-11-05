package db.jdbc.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.support.JdbcUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Slf4j
public class MemberRepositoryV1 {
    private final DataSource dataSource;
    public MemberRepositoryV1(DataSource dataSource){
        this.dataSource = dataSource;
    }

    private void close(Connection con, Statement stmt, ResultSet rs){
        JdbcUtils.closeResultSet(rs);
        JdbcUtils.closeStatement(stmt);
        JdbcUtils.closeConnection(con);
    }

    private Connection getConnection() throws SQLException{
        Connection con = dataSource.getConnection();
        log.info("get connection={}, class={}",con,con.getClass());
        return con;
    }
}
