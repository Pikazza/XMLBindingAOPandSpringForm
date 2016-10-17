package com.springform.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@SuppressWarnings("unchecked")
@XmlRootElement(name="User")
public class User {

	 private String username;
	 private String password;
	    private String email;
	    private Date birthDate;
	    private String profession;
	    
	    private AddressHistory addressHistory;
	
    
	   
		public AddressHistory getAddressHistory() {
			return addressHistory;
		}
//		@XmlElement
		public void setAddressHistory(AddressHistory addressHistory) {
			this.addressHistory = addressHistory;
		}
		public String getUsername() {
		return username;
	}
//		@XmlElement
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
//	@XmlElement
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
//	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthDate() {
		return birthDate;
		// (Date) new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy").parse(birthDate)
	}
//	@XmlElement
	public void setBirthDate(Date birthDate) {
		this.birthDate =birthDate;
	}
	public String getProfession() {
		return profession;
	}
//	@XmlElement
	public void setProfession(String profession) {
		this.profession = profession;
	}


		
	
	
		
}
