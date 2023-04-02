package com.companion.Master_tables.entities.controlCenter;

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
@Table(schema = "controlCenter", name = "user_category")
public class UserCategory {
    @Id
    @Column(name = "user_category_id")
    Integer userCategoryId;
    @Column(name = "user_category_name")
    String userCategoryName;
    @Column(name = "user_category_key", unique = true)
    String userCategoryKey;
    @Column(name = "user_category_description")
    String userCategoryDescription;
    @Column(name = "is_admin_default")
    Boolean isAdminDefault;
    @Column(name = "is_active")
    Boolean isActive;
}