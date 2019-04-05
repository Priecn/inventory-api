package com.pos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ADDRESS")
@Data
@NoArgsConstructor
public class Address implements Serializable {
	
	@JsonIgnore
    public static final long serialVersionUID = -1293585453315L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    @Column(name = "ADDRESS_LINE_1")
    private String addressLine1;

    @Column(name = "ADDRESS_LINE_2")
    private String addressLine2;

    @Column(name = "STATE", nullable = false)
    private String state;

    @Column(name = "CITY", nullable = false)
    private String city;

    @Column(name = "PINCODE", nullable = false)
    private Integer pincode;
}
