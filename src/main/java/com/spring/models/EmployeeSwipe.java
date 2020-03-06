package com.spring.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employeeSwipe")
public class EmployeeSwipe {
	
	private int id;
	private Date date;
	private Date swipein;
	private Date swipeout;
	private String location;
	
	public EmployeeSwipe(int id, Date date, Date swipein, Date swipeout, String location) {
		super();
		this.id = id;
		this.date = date;
		this.swipein = swipein;
		this.swipeout = swipeout;
		this.location = location;
	}
	

	@Id
	@GeneratedValue
	
	public int getId() {
		return id;
	}
	@Column(name="location")
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="date")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Column(name="swipein")
	public Date getSwipein() {
		return swipein;
	}
	public void setSwipein(Date swipein) {
		this.swipein = swipein;
	}
	@Column(name="swipeout")
	public Date getSwipeout() {
		return swipeout;
	}
	public void setSwipeout(Date swipeout) {
		this.swipeout = swipeout;
	}
	
}
