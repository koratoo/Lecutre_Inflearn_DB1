package db.jdbc.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.support.JdbcUtils;

import javax.sql.DataSource;
import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 트랜잭션 - 트랜잭션 매니저
 * DataSourceUtils.getConnection()
 * DataSourceUtils.releaseConncetion()
 */
@Slf4j
public class MemberRepositoryV3 {


    private final DataSource dataSource;
    public MemberRepositoryV3(DataSource dataSource){
        this.dataSource=dataSource;
    }

    private void close(Connection con, Statement stmt, ResultSet rs){
        JdbcUtils.closeResultSet(rs);
        JdbcUtils.closeStatement(stmt);
        //주의! 트랜잭션 동기화를 사용하려면 DataSourceRealease를 사용해야한다.
        DataSourceUtils.releaseConnection(con,dataSource);
//        JdbcUtils.closeConnection(con);
    }
    private Connection getConnection() throws SQLException{
        //주의! 트랜잭션 동기화를 사용하려면 DataSourceUtils를 사용해야 한다.
        Connection con = dataSource.getConnection();
        log.info("get connectinon={}, class={}",con,con.getClass());
        return con;
    }


    public Member findById(String fromId) {
        return null;
    }
}
