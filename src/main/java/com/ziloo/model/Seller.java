package com.ziloo.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Seller extends AbstractModel {
    @Column
    private String shopOwnerName;

    @Column
    private String shopOwnerLastName;

    @Column
    private String username;

    @Column
    private String instagramUsername;

    @Column
    private String email;

    @Column
    private String password;

    @Column(length = 65535, columnDefinition = "Text")
    private String profileImageAddress;

    @Column
    private String phoneNumber;

    @Column
    private String address;

    @Column
    private String city;

    @Column
    private String province;

    @Column(length = 65535, columnDefinition = "Text")
    private String bio;
}
