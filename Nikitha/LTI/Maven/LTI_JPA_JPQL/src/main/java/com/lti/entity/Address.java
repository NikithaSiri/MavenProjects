package com.lti.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
		@Table(name="Address_OTO")
		public class Address{

			@Id
			@Column(name="Address_id")
			private Long addressId;
			
			@Column(name="Address_Street")
			private String street;

			@Column(name="Address_city")
			private String city;
			
			@Column(name="Address_State")
			private String state;
			
			@Column(name="Address_Zipcode")
			private String zipCode;
			
			
			public Address() {
				super();
			}

			public Address(Long addressId, String street, String city, String state, String zipCode) {
				super();
				this.addressId = addressId;
				this.street = street;
				this.city = city;
				this.state = state;
				this.zipCode = zipCode;
			}

			public Long getAddressId() {
				return addressId;
			}

			public void setAddressId(Long addressId) {
				this.addressId = addressId;
			}

			public String getStreet() {
				return street;
			}

			public void setStreet(String street) {
				this.street = street;
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

			public String getZipCode() {
				return zipCode;
			}

			public void setZipCode(String zipCode) {
				this.zipCode = zipCode;
			}

			@Override
			public String toString() {
				return "Address \n[addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state
						+ ", zipCode=" + zipCode + "]";
			}
	}

