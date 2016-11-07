package edu.mum.hw2.domain;

import java.util.*;

import javax.persistence.*;

@Entity
public class Task {
	
		private String name;
		private String duration;
		private String status;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDuration() {
			return duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
}
