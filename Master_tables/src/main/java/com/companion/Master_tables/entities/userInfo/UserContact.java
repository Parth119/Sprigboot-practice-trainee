package com.companion.Master_tables.entities.userInfo;

import com.companion.Master_tables.entities.master.ContactType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(schema = "userInfo",name = "user_contact")
public class UserContact {
    @Id
    Integer contactId;
    @ManyToOne
            @JoinColumn(name = "user_id")
    Users userId;
    @ManyToOne
            @JoinColumn(name = "contact_type")
    ContactType contactType;
    @Column(name = "contact")
    String contact;
    @Column(name = "is_primary")
    Boolean isPrimary;
    @Column(name = "is_active")
    Boolean isActive;
}