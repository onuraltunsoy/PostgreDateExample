package com.altunsoy.UserApplicaiton.Model;

import java.sql.Date;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


@Table(name = "users")
@Entity
public class User {
	

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String name;
	 
	 public User() {
		super();
	}

	@Column(name = "saved_date", columnDefinition= "TIMESTAMP WITH TIME ZONE")
	private ZonedDateTime savedDate;
	 
	 public User(String name, ZonedDateTime savedDate, @NotNull Date bornDate) {
		super();
		this.name = name;
		this.savedDate = savedDate;
		this.bornDate = bornDate;
	}

	@Column(name = "born_Date", columnDefinition= "TIMESTAMP WITH TIME ZONE")
	 @NotNull
	//// @Temporal(TemporalType.TIMESTAMP)
	 private Date bornDate;
	 
	
	 public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", savedDate=" + savedDate + ", bornDate=" + bornDate + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ZonedDateTime getSavedDate() {
		return savedDate;
	}

	public void setSavedDate(ZonedDateTime savedDate) {
		this.savedDate = savedDate;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	
	 
	
}
