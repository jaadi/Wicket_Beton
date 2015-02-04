package de.nj.model;

import java.io.Serializable;

public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String uName;
	private String uGender;
	
	public User ()
	{}
	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuGender() {
		return uGender;
	}

	public void setuGender(String uGender) {
		this.uGender = uGender;
	}

	@Override
	public String toString() {
		return "User [uName=" + uName + ", uGender=" + uGender + "]";
	}	

}
