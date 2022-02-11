package com.sachin.ctrl;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String Title;
	private String Description;
	private String Type;
	private LocalDate Date;
	private LocalTime StartTime;
	private LocalTime EndTime;
	private Double Location_lon;
	private Double Location_lan;
	private String Phone;
	
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type="Trash Picking";
		if(type.equals("SC"))
		{
			Type="Scrap Collection";
		}
		else {
			Type="Trash Picking";
		}
		
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	public LocalTime getStartTime() {
		return StartTime;
	}
	public void setStartTime(LocalTime startTime) {
		StartTime = startTime;
	}
	public LocalTime getEndTime() {
		return EndTime;
	}
	public void setEndTime(LocalTime endTime) {
		EndTime = endTime;
	}
	public Double getLocation_lon() {
		return Location_lon;
	}
	public void setLocation_lon(Double location_lon) {
		Location_lon = location_lon;
	}
	public Double getLocation_lan() {
		return Location_lan;
	}
	public void setLocation_lan(Double location_lan) {
		Location_lan = location_lan;
	}
	
	
	
	
}
