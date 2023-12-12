package com.coderscampus;

import java.time.LocalDate;


/**
 * Branches
 * main/master -> represents the code that's actually live on the internet (ie coderscampus.com)
 * UAT (not typical)
 * QA
 * Dev
 * 
 * 
 * Environments
 * Production -> main/master
 * UAT (not typical)
 * QA
 * Dev
 */

public class Profile {
	private Integer id;
	private String ProfileName;

	private LocalDate createdDate;
	
		public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProfileName() {
		return ProfileName;
	}
	public void setProfileName(String name) {
		this.ProfileName = name;
	}
}