package com.cb.farmerapp.districts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "districts", indexes = {@Index(name = "id", columnList = "id", unique = true)})
@Getter
@Setter
@ToString
@Access(AccessType.FIELD)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class District {

    @Id
    private Long id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "total_wards", nullable = false)
    private int totalWards;

    @Column(name = "province", nullable = false)
    private Province province;
}
