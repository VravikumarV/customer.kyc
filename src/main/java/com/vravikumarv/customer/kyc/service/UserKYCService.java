package com.vravikumarv.customer.kyc.service;


import com.vravikumarv.customer.kyc.model.UserKYCModel;
import com.vravikumarv.customer.kyc.repository.UserKYCRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserKYCService {

    @Autowired
    UserKYCRepository userKYCRepository;

    public List<UserKYCModel> getUserKYC() {
        return userKYCRepository.findAll();
    }

    public UserKYCModel putUserKYC(UserKYCModel userKYCModel) {
        return userKYCRepository.save(userKYCModel);
    }

    public void deleteUserKYC(Long id) {
        userKYCRepository.deleteById(id);
    }

    public UserKYCModel getUserKYCById(Long id) {
        return userKYCRepository.findById(id).orElseThrow();
    }

}
