package com.pos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "SUPPLIER")
@Data
@NoArgsConstructor
public class Supplier implements Serializable {

    @JsonIgnore
    public static final long serialVersionUID = -235784631545L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private String address;
    private Integer mobileNumber;

    @ManyToMany(mappedBy = "suppliers")
    @JsonIgnore
    private List<Product> product;
}
