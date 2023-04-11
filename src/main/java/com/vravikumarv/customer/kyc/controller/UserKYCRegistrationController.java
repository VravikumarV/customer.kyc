package com.vravikumarv.customer.kyc.controller;

import com.vravikumarv.customer.kyc.model.UserKYCModel;
import com.vravikumarv.customer.kyc.service.UserKYCService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class UserKYCRegistrationController {

    @Autowired
    UserKYCService userKYCService;

    @GetMapping("/userKYC")
    public List<UserKYCModel> getAllUserKYC() {
        return userKYCService.getUserKYC();
    }

    @GetMapping("/userKYC/{id}")
    public UserKYCModel getUserKYC(@PathVariable Long id) {
        return userKYCService.getUserKYCById(id);
    }

    @PostMapping("/userKYC")
    public UserKYCModel putUserKYC(@RequestBody UserKYCModel userKYCModel) {
        return userKYCService.putUserKYC(userKYCModel);
    }

    @PutMapping("/userKYC/{id}")
    public UserKYCModel putUserKYC(@PathVariable Long id, @RequestBody UserKYCModel userKYCModel) {
        return userKYCService.putUserKYC(userKYCModel);
    }

    @DeleteMapping("/userKYC/{id}")
    public void putUserKYC(@PathVariable Long id) {
        userKYCService.deleteUserKYC(id);
    }

}
