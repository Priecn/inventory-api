package com.pos.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Location")
@Data
@NoArgsConstructor
public class Location implements Serializable {
    @JsonIgnore
    public static final long serialVersionUID = -234458245245L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Character rackNumber;
    private Character boxNumber;

    @OneToMany(mappedBy = "location")
    @JsonIgnore
    private List<Batch> batch;
}
