package com.vravikumarv.customer.kyc.repository;

import com.vravikumarv.customer.kyc.model.UserKYCModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserKYCRepository extends JpaRepository<UserKYCModel, Long> {

}
