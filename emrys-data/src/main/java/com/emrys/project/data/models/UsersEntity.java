package com.emrys.project.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name="User")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String userName;
    private String password;
    private boolean active;
    private String roles;



}
