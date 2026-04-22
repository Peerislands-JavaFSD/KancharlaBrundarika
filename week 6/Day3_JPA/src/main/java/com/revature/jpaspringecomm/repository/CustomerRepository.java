package com.revature.jpaspringecomm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.jpaspringecomm.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}