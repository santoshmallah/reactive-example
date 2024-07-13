package com.main.reactive_example.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.main.reactive_example.dao.UserDao;
import com.main.reactive_example.model.UserDetailVO;
import com.main.reactive_example.rowmapper.UserDetailMapper;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public String userDetail() {
		try {
			List<UserDetailVO> userDetail=jdbcTemplate.query("select * from User_Entity", new UserDetailMapper());
			System.out.println("userDetail==>"+userDetail.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
