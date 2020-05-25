package com.hairdresser.Service.impl;

import com.hairdresser.Model.dao.Order;
import com.hairdresser.Model.dao.ServiceHairdresser;
import com.hairdresser.Repository.OrderRepository;
import com.hairdresser.Repository.RepositoryHairdresser;
import com.hairdresser.Service.HairdresserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Service
@RequiredArgsConstructor
public class HairdresserServiceImpl implements HairdresserService {

    //todo sprawdzic czy ktos nie jest juz zapisany, zapis na konkretna godzine, czas trwania uslugi -
    //verfiyFreeOrder rzucimy wyjatek jezeli nie ma, nowe repo

    private final OrderRepository orderRepository;
    private final RepositoryHairdresser repositoryHairdresser;


 /*   //testowa metoda
    public boolean verifyFreeOrder() {
    }
*/

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order findByPhoneNumber(String phone) {
        return orderRepository.findByPhone(phone)
                .orElseThrow(() -> new EntityNotFoundException("User with phone number " + phone + " not exist"));
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    //pokemontcg.io
    @Override
    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Page<Order> getPage(Pageable pageable) {
        return orderRepository.findAll(pageable);
    }
}
