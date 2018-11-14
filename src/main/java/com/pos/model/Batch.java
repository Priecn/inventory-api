package com.pos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "BATCH")
@Data
@NoArgsConstructor
public class Batch implements Serializable {
    @JsonIgnore
    public static final long serialVersionUID = -29875453315L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String batchNumber;

    @Column(name = "EXPIRY_DATE")
    @DateTimeFormat(pattern = "dd/MM/YYYY")
    private LocalDate expiryDate;

    @Column(name = "MANUFACTURED_DATE")
    @DateTimeFormat(pattern = "dd/MM/YYYY")
    private LocalDate manufacturedDate;

    @Column(name = "UNIT_PRICE")
    private Float unitPrice;

    private Integer availableQuantity;

    @ManyToOne
    @JoinColumn(name = "LOCATION_ID")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    @JsonIgnore
    private Product product;
}
