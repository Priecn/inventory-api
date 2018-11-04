package com.pos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "PRODUCT")
@Data
@NoArgsConstructor
public class Product implements Serializable {

    @JsonIgnore
    public static final long serialVersionUID = -234325245245L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String manufacturer;

    @Enumerated(value = EnumType.STRING)
    private ScheduledCategory category;

    @Column(name = "HNS_CODE")
    private String hsnCode;
    private String batch;

    @Column(name = "EXPIRY_DATE")
    @DateTimeFormat(pattern = "MM/YYYY")
    private LocalDate expiryDate;

    @Column(name = "COST_PRICE")
    private Float costPrice;

    @Column(name = "NUMBER_OF_BOXES")
    private Integer numberOfBoxes;

    @Column(name = "SELLING_PRICE")
    private Float sellingPrice;
}
