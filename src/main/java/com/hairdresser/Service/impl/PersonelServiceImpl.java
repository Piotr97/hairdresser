package com.hairdresser.Service.impl;

import com.hairdresser.Model.dao.Personel;
import com.hairdresser.Repository.PersonelRepository;
import com.hairdresser.Repository.RoleRepository;
import com.hairdresser.Service.PersonelService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import javax.persistence.EntityNotFoundException;
import java.util.Collections;

@Service
@RequiredArgsConstructor
public class PersonelServiceImpl implements PersonelService {


    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final PersonelRepository personelRepository;

    @Override
    public Personel save(Personel personel) {
        personel.setPassword(passwordEncoder.encode(personel.getPassword()));
        roleRepository.findByName("ROLE_USER")
                .ifPresent(role -> personel.setRolees(Collections.singleton(role)));
        return personelRepository.save(personel);
    }

    @Override
    public Personel findById(Long id) {
        return personelRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Employee with id " + id + " not exist"));
    }

    @Override
    public void deleteById(Long id) {
        personelRepository.deleteById(id);
    }

    @Override
    public Page<Personel> getPage(Pageable pageable) {
        return personelRepository.findAll(pageable);
    }
}
