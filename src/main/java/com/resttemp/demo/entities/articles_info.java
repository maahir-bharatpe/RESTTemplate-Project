package com.resttemp.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class articles_info {
    @JsonIgnore()
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="u_id")
    private Long idd;
    
	public String id;
	public String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "desc [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public articles_info(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public articles_info() {
		super();
	}
	
}
