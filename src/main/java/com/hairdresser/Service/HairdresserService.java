package com.hairdresser.Service;

import com.hairdresser.Model.dao.Order;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface HairdresserService {


    @CachePut(cacheNames = "orders", key = "#result.id")
    Order save(Order order);

    @Cacheable(cacheNames = "orders", key = "#id")
    Order findByPhoneNumber(String phone);

    @Cacheable(cacheNames = "orders", key = "#id")
    List<Order> findAll();

    @CacheEvict(cacheNames = "orders", key = "#id")
    void deleteById(Long id);

    Page<Order> getPage(Pageable pageable);
}
