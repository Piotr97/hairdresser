package com.hairdresser.Repository;

import com.hairdresser.Model.dao.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order,Long> {
    Optional<Order> findByPhone(String phone);
}
