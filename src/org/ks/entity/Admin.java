package org.ks.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class Admin implements Serializable{
	private Integer admin_id;
	private String admin_code;
	private String password;
	private String name;
	private String telephone;
	private String email;
	private Timestamp enrolldate;

	public Integer getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(Integer admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_code() {
		return admin_code;
	}

	public void setAdmin_code(String admin_code) {
		this.admin_code = admin_code;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getEnrolldate() {
		return enrolldate;
	}

	public void setEnrolldate(Timestamp enrolldate) {
		this.enrolldate = enrolldate;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Admin{");
		sb.append("admin_id=").append(admin_id);
		sb.append(", admin_code='").append(admin_code).append('\'');
		sb.append(", password='").append(password).append('\'');
		sb.append(", name='").append(name).append('\'');
		sb.append(", telephone='").append(telephone).append('\'');
		sb.append(", email='").append(email).append('\'');
		sb.append(", enrolldate=").append(enrolldate);
		sb.append('}');
		return sb.toString();
	}
}
