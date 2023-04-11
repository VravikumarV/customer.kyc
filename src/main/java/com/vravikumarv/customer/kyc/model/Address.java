package com.vravikumarv.customer.kyc.model;

import lombok.Data;

@Data
public class Address {

    private Long id;
    private String addressType;
    private String address1;
    private String address2;
    private String landmark;
    private String city;
    private String state;
    private String country;
    private String zipcode;
    private String googleCrdnts;

}
