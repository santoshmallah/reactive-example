package com.main.reactive_example.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.main.reactive_example.model.UserDetailVO;

public class UserDetailMapper implements RowMapper<UserDetailVO> {

	@Override
	public UserDetailVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserDetailVO userDetailVO = new UserDetailVO();
		try {
			userDetailVO.setId(rs.getInt("id"));
			userDetailVO.setUsername(rs.getString("username"));
			userDetailVO.setFirst_name(rs.getString("first_name"));
			userDetailVO.setLast_name(rs.getString("last_name"));
			userDetailVO.setEmail(rs.getString("email"));
			userDetailVO.setUpdate_date(rs.getDate("update_date"));
			userDetailVO.setUpdate_by(rs.getString("update_by"));
			userDetailVO.setCreated_date(rs.getDate("created_date"));
			userDetailVO.setIs_active(rs.getInt("is_active"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userDetailVO;
	}

}
