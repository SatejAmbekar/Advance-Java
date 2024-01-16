package com.example.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "RailwaysSpring")

public class Railway extends BaseEntity {

	/*
	 * • ID (unique identifier for each Railway, auto generated, starts from 1) •
	 * Name • Category (Enum, example: Express,Shatabdi,AC,Metro) • Start_time •
	 * End_time • Source • Destiation
	 * 
	 */
	@Column(name="Railway_Name",nullable = false)
	private String railwayName;
	@Enumerated(EnumType.STRING)
	@Column(length=20)
	private Category category;
	
	private LocalDate date;
	private String source;
	private String destination;

	public Railway() {
		super();
	}

	public Railway(String railwayName, Category category, LocalDate date, String source, String destination) {
		super();
		this.railwayName = railwayName;
		this.category = category;
		this.date = date;
		this.source = source;
		this.destination = destination;
	}
	

	public String getRailwayName() {
		return railwayName;
	}

	public void setRailwayName(String railwayName) {
		this.railwayName = railwayName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Railway [railway_name=" + railwayName + ", category=" + category + ", date=" + date + ", source="
				+ source + ", destination=" + destination + "]";
	}
	
	

}
