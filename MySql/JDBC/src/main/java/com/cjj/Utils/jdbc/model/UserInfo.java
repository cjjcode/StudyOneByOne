package com.cjj.Utils.jdbc.model;

import java.io.Serializable;

public class UserInfo implements Serializable{

	private static final long serialVersionUID = 4996754875363206030L;
	private int id;  
    private String username;  
    private String pswd;
    
	public UserInfo(int id, String username, String pswd) {
		super();
		this.id = id;
		this.username = username;
		this.pswd = pswd;
	}

	public UserInfo() {
	}

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

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((pswd == null) ? 0 : pswd.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo other = (UserInfo) obj;
		if (id != other.id)
			return false;
		if (pswd == null) {
			if (other.pswd != null)
				return false;
		} else if (!pswd.equals(other.pswd))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", username=" + username + ", pswd=" + pswd + "]";
	}  
    
    
    
    
}
