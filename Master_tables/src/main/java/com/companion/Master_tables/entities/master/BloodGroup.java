package com.companion.Master_tables.entities.master;

import com.companion.Master_tables.entities.BloodGroupName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(schema = "master", name = "blood_group")
public class BloodGroup {
    @Id
    @Column(name = "blood_group_id")
    Integer bloodGroupId;
    @Column(name = "blood_group_name")
    @Enumerated(value = EnumType.STRING)
    BloodGroupName bloodGroupName;
    @Column(name = "blood_group_key", unique = true)
    String bloodGroupKey;
    @Column(name = "is_active")
    Boolean isActive;
}