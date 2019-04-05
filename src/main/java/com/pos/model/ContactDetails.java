package com.pos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CONTACT_DETAILS")
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ContactDetails implements Serializable {
	
	@JsonIgnore
    public static final long serialVersionUID = -145413245218L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	
	private Integer[] mobileNumbers;

	private Integer maxCreditDays;
	
	private String[] drugLicenseNumbar;
	
	@Column(name = "TIN_NUMBER")
	private String TINNumber;
	
	private Float discount;
	
	@Column(name = "GSTIN_NUMBER")
	private String gstinNumber;
	
	private String panNumber;
	
	private String fssaiLicenseNumber;
	
	private boolean status;

	private String email;

	@OneToOne
	private Address address;

}
