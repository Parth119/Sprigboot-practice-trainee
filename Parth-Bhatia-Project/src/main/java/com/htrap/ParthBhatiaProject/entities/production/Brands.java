package com.htrap.ParthBhatiaProject.entities.production;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(schema = "production",name = "brands")
public class Brands {
    @Id
    @Column(name = "brand_id")
    Integer brandId;

    @Column(name = "brand_name")
    String brandName;
}
