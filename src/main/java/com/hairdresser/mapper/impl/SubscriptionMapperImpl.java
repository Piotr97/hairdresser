package com.hairdresser.mapper.impl;

import com.hairdresser.Model.dao.Order;
import com.hairdresser.Model.dto.OrderDto;
import com.hairdresser.mapper.SubscriptionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SubscriptionMapperImpl implements SubscriptionMapper {
    @Override
    public Order subscriptionDtoToSubscription(OrderDto orderDto) {
        return Order.builder()
                .id(orderDto.getId())
                .name(orderDto.getName())
                .lastName(orderDto.getLastName())
                .phone(orderDto.getPhone())
                .barberName(orderDto.getBarberName())
                .build();
    }

    @Override
    public OrderDto subscriptionToSubscriptionDto(Order order) {
        return OrderDto.builder()
                .id(order.getId())
                .name(order.getName())
                .lastName(order.getLastName())
                .phone(order.getPhone())
                .barberName(order.getBarberName())
                .build();
    }
}
