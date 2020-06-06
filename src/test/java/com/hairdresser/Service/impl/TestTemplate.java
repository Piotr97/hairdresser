package com.hairdresser.Service.impl;

import com.hairdresser.Model.dao.Order;
import com.hairdresser.Model.dao.Personel;
import com.hairdresser.Model.dao.Rolee;
import com.hairdresser.Model.dao.ServiceHairdresser;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class TestTemplate {
    public Set<Rolee> ofRoless(Rolee... rolee) {
        return new HashSet<>(Arrays.asList(rolee));
    }
    public Set<ServiceHairdresser> ofServices(ServiceHairdresser... serviceHairdressers) {
        return new HashSet<>(Arrays.asList(serviceHairdressers));
    }
    public Set<Order> ofOrder(Order... orders) {
        return new HashSet<>(Arrays.asList(orders));
    }

    public Order getExampleOrder() {
        return Order.builder()
                .id(2L)
                .name("Pawel")
                .lastName("pawl")
                .barberName("Krystyna")
                .phone("555555444")
                .createData(LocalDateTime.now())
                .visitData(LocalDateTime.now().plusHours(5))
                .serviceHairdressers(ofServices(getExampleServiceHairdresser()))
                .build();
    }

    public ServiceHairdresser getExampleServiceHairdresser(){
        return ServiceHairdresser.builder()
                .id(1L)
                .name("Ilona")
                .price(new BigDecimal(25))
                .description("-")
                .timeInMinutes(30)
                .build();
    }

    public Personel getExamplePersonel(){
        return Personel.builder()
                .id(1L)
                .employeeName("Ilona")
                .password("pass")
                .workStart(LocalTime.now())
                .workEnd(LocalTime.now().plusHours(8))
                .orders(ofOrder(getExampleOrder()))
                .rolees(ofRoless(new Rolee(1L,"ADMIN")))
                .build();
    }
}