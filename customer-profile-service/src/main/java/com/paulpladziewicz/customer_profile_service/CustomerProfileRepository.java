package com.paulpladziewicz.customer_profile_service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerProfileRepository extends JpaRepository<Long, CustomerProfile> {
}
