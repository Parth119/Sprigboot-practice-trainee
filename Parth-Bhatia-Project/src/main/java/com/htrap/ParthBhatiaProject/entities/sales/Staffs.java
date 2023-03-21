package com.htrap.ParthBhatiaProject.entities.sales;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(schema = "sales", name = "staffs")
public class Staffs {
    @Id
    @Column(name = "staff_id")
    Integer staffId;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;
    @Column(name = "email")
    String email;
    @Column(name = "phone")
    String phone;
    @Column(name = "active")
    Integer active;

    @ManyToOne
    @JoinColumn(name = "store_id")
    Stores storeId;
    @ManyToOne
    @JoinColumn(name = "manager_id")
    Staffs managerId;
}