package com.pos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Buyer")
@Getter
@Setter
@NoArgsConstructor
public class Buyer extends ContactDetails implements Serializable {
    @JsonIgnore
    public static final long serialVersionUID = -12455545218L;

    @OneToMany(mappedBy = "buyer")
    private List<Invoice> invoices;

}
