package com.vravikumarv.customer.exceptions;


import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class UserKYCNotFound extends RuntimeException {
}
