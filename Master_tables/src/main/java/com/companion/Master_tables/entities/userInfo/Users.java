package com.companion.Master_tables.entities.userInfo;

import com.companion.Master_tables.entities.Gender;
import com.companion.Master_tables.entities.controlCenter.UserCategory;
import com.companion.Master_tables.entities.master.BloodGroup;
import com.companion.Master_tables.entities.master.Designation;
import com.companion.Master_tables.entities.master.Org;
import com.companion.Master_tables.entities.master.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(schema = "userInfo", name = "users")
public class Users {
    @Id
    @Column(name = "user_id")
    Integer userId;
    @ManyToOne
    @JoinColumn(name = "org_id")
    Org orgId;
    @ManyToOne
    @JoinColumn(name = "user_category_id")
    UserCategory userCategoryId;
    @Column(name = "user_login_name", unique = true)
    String userLoginName;
    @Column(name = "user_password")
    String userPassword;
    @Column(name = "user_mpin_password")
    String userMpinPassword;
    @Column(name = "user_display_name")
    String userDisplayName;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "middle_name")
    String middleName;
    @Column(name = "last_name")
    String lastName;
    @Column(name = "birth_date")
    Date birthDate;
    @Column(name = "gender")
    @Enumerated(value = EnumType.STRING)
    Gender gender;
    @ManyToOne
    @JoinColumn(name = "blood_group_id")
    BloodGroup bloodGroupId;
    @ManyToOne
    @JoinColumn(name = "designation_id")
    Designation designationId;
    @ManyToOne
    @JoinColumn(name = "status_id")
    Status statusId;
}
