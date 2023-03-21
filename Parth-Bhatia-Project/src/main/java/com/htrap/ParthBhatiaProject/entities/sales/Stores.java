package com.htrap.ParthBhatiaProject.entities.sales;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(schema = "sales",name = "stores")
public class Stores {
    @Id
            @Column(name = "store_id")
    Integer store_id;
    @Column(name = "store_name")
    String storeName;
    @Column(name = "phone")
    String phone;
    @Column(name = "email")
    String email;
    @Column(name = "street")
    String street;
    @Column(name = "city")
    String city;
    @Column(name = "state")
    String state;
    @Column(name = "zip_code")
    String zipCode;
}
