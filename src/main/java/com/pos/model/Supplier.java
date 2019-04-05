package com.pos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "SUPPLIER")
@Getter
@Setter
@NoArgsConstructor
public class Supplier extends ContactDetails implements Serializable {

    @JsonIgnore
    public static final long serialVersionUID = -235784631545L;


    @ManyToMany(mappedBy = "suppliers")
    @JsonIgnore
    private List<Product> product;
    
    @OneToMany(mappedBy = "supplier")
    private List<Order> orders;
}
