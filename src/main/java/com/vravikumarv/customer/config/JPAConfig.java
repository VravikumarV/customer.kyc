package com.vravikumarv.customer.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.vravikumarv.customer.kyc.repository")
public class JPAConfig {
}
