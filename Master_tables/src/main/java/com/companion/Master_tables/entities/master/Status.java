package com.companion.Master_tables.entities.master;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(schema = "master", name = "status")
public class Status {
    @Id
    @Column(name = "status_id")
    Integer statusId;
    @Column(name = "status_name")
    String statusName;
    @Column(name = "status_key")
    String statusKey;
    @Column(name = "is_active")
    Boolean isActive;
}
