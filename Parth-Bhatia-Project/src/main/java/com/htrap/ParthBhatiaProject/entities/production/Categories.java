package com.htrap.ParthBhatiaProject.entities.production;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(schema = "production", name = "categories")
public class Categories {
    @Id
    @Column(name = "category_id")
    Integer categoryId;

    @Column(name = "category_name")
    String categoryName;
}
