package com.tandem.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.tandem.model.User;

@Repository
public class UserDaoImpl implements UserDao {

public UserDaoImpl(NamedParameterJdbcTemplate template) {  
        this.template = template;  
}

	NamedParameterJdbcTemplate template;

	@Override
	public List<User> findAll() {
		return template.query("select * from users", new UserRowMapper());
	}

	@Override
	public void insertUser(User emp) {
		final String sql = "insert into users(UserId, UserFirstname, UserLastname , UserCity, UserEmail) values(:UserId,:UserFirstname,:UserEmail,:UserCity)";
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource().addValue("UserId", emp.getUserId())
				.addValue("UserFirstname", emp.getUserFirstname()).addValue("UserLastname", emp.getUserLastname()).addValue("UserEmail", emp.getUserEmail())
				.addValue("UserCity", emp.getUserCity());
		template.update(sql, param, holder);
	}

	@Override
	public void updateUser(User emp) {
		final String sql = "update users set UserFirstname=:UserFirstname, UserLastname=:UserLastname, UserCity=:UserCity, UserEmail=:UserEmail where UserId=:UserId";
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource().addValue("UserId", emp.getUserId())
				.addValue("UserFirstname", emp.getUserFirstname()).addValue("UserLastname", emp.getUserLastname()).addValue("UserEmail", emp.getUserEmail())
				.addValue("UserCity", emp.getUserCity());
		template.update(sql, param, holder);
	}

	@Override
	public void executeUpdateUser(User emp) {
		final String sql = "update users set UserFirstname=:UserFirstname, UserLastname=:UserLastname, UserCity=:UserCity, UserEmail=:UserEmail where UserId=:UserId";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("UserId", emp.getUserId());
		map.put("UserFirstname", emp.getUserFirstname());
		map.put("UserLastname", emp.getUserLastname());
		map.put("UserEmail", emp.getUserEmail());
		map.put("UserCity", emp.getUserCity());
		template.execute(sql, map, new PreparedStatementCallback<Object>() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		});
	}

	@Override
	public void deleteUser(User emp) {
		final String sql = "delete from users where UserId=:UserId";
		Map<String, Object> map = new HashMap<>();
		map.put("UserId", emp.getUserId());
		template.execute(sql, map, new PreparedStatementCallback<Object>() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		});
	}

}
