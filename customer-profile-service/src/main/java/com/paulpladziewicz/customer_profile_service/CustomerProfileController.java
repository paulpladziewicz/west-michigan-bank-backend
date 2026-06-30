package com.paulpladziewicz.customer_profile_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CustomerProfileController {

    @GetMapping("/customer/profile")
    public ResponseEntity<Map<String, String>> getCustomerProfile() {
        return ResponseEntity.ok(Map.of("message", "Customer Profile"));
    }
}
