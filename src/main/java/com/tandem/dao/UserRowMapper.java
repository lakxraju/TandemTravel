package com.tandem.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tandem.model.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User userObj = new User();
		userObj.setUserId(rs.getString("UserId"));
		userObj.setUserFirstname(rs.getString("UserFirstname"));
		userObj.setUserLastname(rs.getString("UserLastname"));
		userObj.setUserCity(rs.getString("UserCity"));
		userObj.setUserEmail(rs.getString("UserEmail"));
		return userObj;
	}

}
