package com.hairdresser.mapper;

import com.hairdresser.Model.dao.Order;
import com.hairdresser.Model.dto.OrderDto;

public interface SubscriptionMapper {

    OrderDto subscriptionToSubscriptionDto(Order order);

    Order subscriptionDtoToSubscription(OrderDto orderDto);

}
