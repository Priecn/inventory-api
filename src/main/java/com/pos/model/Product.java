package com.pos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

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

    @Enumerated(EnumType.STRING)
    private GST gst;

    @OneToMany(mappedBy = "product")
    private List<Batch> batches;

    @ManyToMany
    @JoinTable(
            name = "PRODUCT_SUPPLIER",
            joinColumns = {@JoinColumn(name = "PRODUCT_ID")},
            inverseJoinColumns = {@JoinColumn(name = "SUPPLIER_ID")}
    )
    private List<Supplier> suppliers;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<InvoiceEntry> invoiceEntries;
}
