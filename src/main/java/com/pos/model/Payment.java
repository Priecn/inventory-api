package com.pos.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PAYMENT")
@Data
@NoArgsConstructor
public class Payment implements Serializable {
	
	@JsonIgnore
    public static final long serialVersionUID = -1293585453315L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime paymentDateTime;
    
    @ManyToOne
    @JoinColumn(name = "INVOICE_ID")
    private Invoice invoice;
    
    private Float amountPaid;
    
    private Float remainingAmount;
}
