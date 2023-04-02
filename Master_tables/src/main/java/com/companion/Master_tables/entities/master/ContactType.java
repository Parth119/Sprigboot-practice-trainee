package com.companion.Master_tables.entities.master;

import com.companion.Master_tables.entities.ContactTypeKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(schema = "master", name = "contact_type")
public class ContactType {
    @Id
    @Column(name = "contact_type_id")
    Integer contactTypeId;
    @Column(name = "contact_type_name")
    String contactTypeName;
    @Column(name = "contact_type_key")
    @Enumerated(EnumType.STRING)
    ContactTypeKey contactTypeKey;
    @Column(name = "is_active")
    Boolean isActive;
}