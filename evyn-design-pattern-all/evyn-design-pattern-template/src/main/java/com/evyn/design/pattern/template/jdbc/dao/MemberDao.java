package com.evyn.design.pattern.template.jdbc.dao;

import com.evyn.design.pattern.template.jdbc.JdbcTemplate;
import com.evyn.design.pattern.template.jdbc.Member;
import com.evyn.design.pattern.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @ClassName MemberDao
 * @Description:
 * @Author xyw
 * @Date 2019/3/16 20:43
 * @Version 1.0
 */
public class MemberDao extends JdbcTemplate {

    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){
        String sql = "select * feom t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUserName(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        }, null);
    }
}
