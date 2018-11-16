package com.pos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Buyer")
@Data
@NoArgsConstructor
public class Buyer implements Serializable {
    @JsonIgnore
    public static final long serialVersionUID = -12455545218L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Integer mobileNumber;

    @OneToMany(mappedBy = "buyer")
    private List<Invoice> invoices;

}
