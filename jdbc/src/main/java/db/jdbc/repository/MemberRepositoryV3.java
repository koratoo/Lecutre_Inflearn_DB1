package db.jdbc.repository;

import lombok.extern.slf4j.Slf4j;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

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
    private Connection getConnection() throws SQLException{
        Connection con = dataSource.getConnection();
        log.info("get connectinon={}, class={}",con,con.getClass());
        return con;
    }


}
