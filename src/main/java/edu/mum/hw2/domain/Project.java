package edu.mum.hw2.domain;

import java.util.Date;

import javax.persistence.*;
@Entity
public class Project {
	@Id
	@GeneratedValue
	private int proj_id;
	private String name;
	private Date startDate;
	private Date endDate;
	private String description;
	private String status;
	
	public Project() {
		
	}

	private int getProj_id() {
		return proj_id;
	}

	private void setProj_id(int proj_id) {
		this.proj_id = proj_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
