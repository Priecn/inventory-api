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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ORDER_ENTRY")
@Data
@NoArgsConstructor
public class OrderEntry implements Serializable{

	@JsonIgnore
    public static final long serialVersionUID = -1293585453315L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
    @OneToOne
    private Product product;
    
    @OneToMany
    private List<Batch> batches;
    
    private Integer quantity;
    
    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Order order;
}
