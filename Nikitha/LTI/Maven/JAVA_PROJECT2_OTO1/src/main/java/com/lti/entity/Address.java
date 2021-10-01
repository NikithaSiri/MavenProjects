package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADD_OTO")
public class Address {

	@Id
	@Column(name="ADD_ID")
	private int addId;
	
	@Column(name="ADD_CITY")
	private String city;
	
	@Column(name="ADD_STATE")
	private String state;
	
	@Column(name="ADD_COUNTRY")
	private String country;
	
	
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="EMP_ID")
	
	/*public Address() {
	super();
	}
	
	public Address(int addId, String city, String state, String country) {
		super();
		this.addId = addId;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	*/
	@Override
	public String toString() {
		return "Address \n[addId=" + addId + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
}
