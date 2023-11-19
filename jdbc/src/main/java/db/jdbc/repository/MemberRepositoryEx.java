package db.jdbc.repository;

import db.jdbc.domain.Member;

import java.sql.SQLException;

//Exception을 가지고 있는 클래스
public interface MemberRepositoryEx {
    Member save(Member member) throws SQLException;
    Member findById(String memberId);
    void update(String memberId,int money) ;
    void delete(String memberId) ;
}
