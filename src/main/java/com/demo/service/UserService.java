package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import java.sql.*;
import com.demo.dao.UserDao;
import com.demo.domain.User;


@Service
public class UserService {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	private UserDao userdao = new UserDao();
	
	public List<User> query(){
        String sql = "select * from user";

        List<User> userList = jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setUsername(resultSet.getString("username"));
                
               
                return user;
            }
        });

        return userList;
    }
	
	public User findUserByUserName(String userName){
		 
		
		return userdao.findUserByUserName(userName);
	}

}
