package com.vravikumarv.customer.kyc.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "USER_KYC")
public class UserKYCModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String phone;
    private String nationalIdentification;
    private String nationalIdType;

    //private Address address;

}
