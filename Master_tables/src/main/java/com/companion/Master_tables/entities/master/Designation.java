package com.companion.Master_tables.entities.master;

import com.companion.Master_tables.entities.DesignationName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(schema = "master", name = "Designation")
public class Designation {
    @Id
    @Column(name = "designation_id")
    Integer designationId;

    @Column(name = "designation_name")
    @Enumerated(value = EnumType.STRING)
    DesignationName designationName;
    @Column(name = "is_active")
    Boolean isActive;
}