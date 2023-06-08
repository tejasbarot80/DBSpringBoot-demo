package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class staff 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
     private int id;
     private String Sname;
     private String Semail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSemail() {
		return Semail;
	}
	public void setSemail(String semail) {
		Semail = semail;
	}
	@Override
	public String toString() {
		return "staff [id=" + id + ", Sname=" + Sname + ", Semail=" + Semail + "]";
	}
     
     
}
