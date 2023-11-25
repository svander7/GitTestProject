package com.coderscampus;

import java.time.LocalDate;

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
	