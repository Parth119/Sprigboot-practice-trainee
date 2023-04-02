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
@Entity
@Data
@Table(schema = "master", name = "org")
public class Org {
    @Id
    @Column(name = "org_id")
    Integer orgId;
    @Column(name = "org_name")
    String orgName;
    @Column(name = "org_short_name")
    String orgShortName;
    @Column(name = "org_key", unique = true)
    String orgKey;
    @Column(name = "org_description")
    String orgDescription;
    @Column(name = "is_active")
    Boolean isActive;
}
