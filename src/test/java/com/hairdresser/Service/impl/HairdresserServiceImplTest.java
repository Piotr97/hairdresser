package com.hairdresser.Service.impl;

import com.hairdresser.Model.dao.Order;
import com.hairdresser.Model.dao.ServiceHairdresser;
import com.hairdresser.Repository.OrderRepository;
import com.hairdresser.Repository.RepositoryHairdresser;
import com.hairdresser.Service.HairdresserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;


class HairdresserServiceImplTest {

    private HairdresserService hairdresserService;

    private OrderRepository orderRepository;
    private RepositoryHairdresser repositoryHairdresser;

    @BeforeEach
    private void beforeEach() {
        orderRepository = Mockito.mock(OrderRepository.class);
        repositoryHairdresser = Mockito.mock(RepositoryHairdresser.class);

        hairdresserService = new HairdresserServiceImpl(orderRepository,repositoryHairdresser);
    }

    @Test
    public void save_should_check_if(){
        //given
      /*  Order order =
                new Order(1L,"Ania","Bania","566666666","Beata", LocalDateTime.of(2020,5,15,13,20),
                LocalDateTime.now(),Collections.singleton
                        (new ServiceHairdresser(1L,"modeling","Ania", BigDecimal.valueOf(23.99),LocalDateTime.now())));
        Mockito.when(repositoryHairdresser.findByTime(order.getVisitData()));
        Mockito.when(hairdresserService.save(order)).thenReturn(order);
        //when
        Order result = hairdresserService.save(order);
        //them
        assertSame(order,result);
        Mockito.verify(hairdresserService.save(order));*/

    }
}