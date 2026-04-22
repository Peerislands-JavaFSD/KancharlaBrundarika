package com.revature.jpaspringecomm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.jpaspringecomm.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}