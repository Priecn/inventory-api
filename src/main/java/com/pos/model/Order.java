package com.pos.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ORDER")
@Data
@NoArgsConstructor
public class Order implements Serializable{

	@JsonIgnore
    public static final long serialVersionUID = -1293585453315L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
    @OneToMany(mappedBy = "order")
    private List<OrderEntry> singleProduct;
    
    @ManyToOne
    @JoinColumn(name = "SUPPLIER_ID")
    private Supplier supplier;
    
    private Boolean isPaid;
    
    private Float totalAmount;
}
