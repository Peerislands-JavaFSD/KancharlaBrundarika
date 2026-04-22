package com.revature.jpaspringecomm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.jpaspringecomm.models.OrderDetail;
import com.revature.jpaspringecomm.models.OrderDetailId;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId> {
}