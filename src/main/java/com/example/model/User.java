package com.example.model;

import com.example.domain.USER_ROLE;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class User {
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;


	@Setter
	@Getter
	private String fullName;

	@Setter
	@Getter
    private String email;

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@Setter
	@Getter
	private String password;

	/*public String getFullName(){
		return this.fullName;
	}

	public String getEmail(){
		return this.email;
	}

	public String getPassword(){
		return this.password;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setEmail(String email){
		this.email =  email;
	}

	public void setPassword(String password){
		this.password = password;
	}*/
	@Setter
	@Getter
	@Embedded
	private TwoFactorAuth twoFactorAuth = new TwoFactorAuth();
	
	private USER_ROLE role= USER_ROLE.ROLE_CUSTOMER;

}
