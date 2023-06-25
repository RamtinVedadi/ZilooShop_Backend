package com.ziloo.model;

import lombok.*;
import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class User extends AbstractModel {
    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private String username;
    @Column
    private String email;
    @Column
    private String password;
    @Column(length = 65535, columnDefinition = "Text")
    private String profileImageAddress;
    @Column
    private String phoneNumber;

}
