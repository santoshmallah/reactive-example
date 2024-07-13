package com.main.reactive_example.model;

import java.util.Date;

public class UserDetailVO {

	private int id;
	private String username;
	private String first_name;
	private String last_name;
	private String email;
	private Date created_date;
	private String update_by;
	private Date update_date;
	private int is_active;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public String getUpdate_by() {
		return update_by;
	}

	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

	public int getIs_active() {
		return is_active;
	}

	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}

	@Override
	public String toString() {
		return "UserDetailVO [id=" + id + ", username=" + username + ", first_name=" + first_name + ", last_name="
				+ last_name + ", email=" + email + ", created_date=" + created_date + ", update_by=" + update_by
				+ ", update_date=" + update_date + ", is_active=" + is_active + "]";
	}

}
