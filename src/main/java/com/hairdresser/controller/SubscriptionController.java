package com.hairdresser.controller;

import com.hairdresser.Model.dao.Order;
import com.hairdresser.Model.dto.OrderDto;
import com.hairdresser.Service.HairdresserService;
import com.hairdresser.mapper.SubscriptionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/metamorfozy")
public class SubscriptionController {

    private final SubscriptionMapper subscriptionMapper;
    private final HairdresserService hairdresserService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/reservation")
    public OrderDto save(@RequestBody OrderDto orderDto){
        Order save = hairdresserService.save(subscriptionMapper.subscriptionDtoToSubscription(orderDto));
        return subscriptionMapper.subscriptionToSubscriptionDto(save);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/reservation/all")
    public List<Order> allReservation(){
        return hairdresserService.findAll();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/phone")
    public void findByPhoneNumber(@RequestParam String phoneNumber){
         hairdresserService.findByPhoneNumber(phoneNumber);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        hairdresserService.deleteById(id);
    }

}
