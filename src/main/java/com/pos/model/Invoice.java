package com.pos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "INVOICE")
@Data
@NoArgsConstructor
public class Invoice implements Serializable {

    @JsonIgnore
    public static final long serialVersionUID = -12455453315L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime invoiceDateTime;

    @ManyToOne
    @JoinColumn(name = "BUYER_ID")
    @JsonIgnore
    private Buyer buyer;

    @OneToMany(mappedBy = "invoice")
    private List<InvoiceEntry> entries;

    @OneToMany(mappedBy = "invoice")
    private List<Payment> payments;
    
    private Float total;
}
