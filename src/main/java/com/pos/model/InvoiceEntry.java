package com.pos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "INVOICE_ENTRY")
@Data
@NoArgsConstructor
public class InvoiceEntry implements Serializable {
    @JsonIgnore
    public static final long serialVersionUID = -12455453315L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "BATCH_ID")
    private Batch batch;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "INVOICE_ID")
    @JsonIgnore
    private Invoice invoice;
}
