package com.hairdresser.Service;

import com.hairdresser.Model.dao.Personel;
import com.hairdresser.Model.dao.Rolee;
import com.hairdresser.Repository.PersonelRepository;
import com.hairdresser.Repository.RoleRepository;
import com.hairdresser.Service.impl.PersonelServiceImpl;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalTime;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

class PersonelServiceTest {


    private PersonelService personelService;
    /*@Mock*/
    private PersonelRepository personelRepository;
    private PasswordEncoder passwordEncoder;
    private RoleRepository roleRepository;


    @BeforeEach
    private void beforeEach() {
        personelRepository = Mockito.mock(PersonelRepository.class);
        passwordEncoder = Mockito.mock(PasswordEncoder.class);
        roleRepository = Mockito.mock(RoleRepository.class);

        personelService = new PersonelServiceImpl(roleRepository, passwordEncoder, personelRepository);

    }

    @Test
    public void save_should_pass_personel_to_repository() {
    /*    //given
        Personel personel = new Personel(1L, "Ania", "ania", LocalTime.now(), LocalTime.of(21, 0, 0), Collections.singleton(new Rolee(1L, "ROLE_USER")));
        when(passwordEncoder.encode(anyString())).thenReturn("#ania");
        when(personelRepository.save(personel)).thenReturn(personel);
        //when
        Personel result = personelService.save(personel);
        //then
        assertSame(personel, result);
        verify(personelRepository).save(personel);*/
    }
}

//przetestowac:
// metoda save ustawia na przekazanym personelu odpowiednia role
// metoda save na przekazanym obielcie zakodowane haslo

//metoda findbyphone
//upewniamy się ze metoda ta rzuca odpowiedni wyjatek zawierajaca odpowiedni numer w komunikacie jesli otrzyma od rep pusty optional

//findall
//upwniamy sie ze zwraca taka sama liste jak przekazana mockowi i zlecona

//deletebyid
//upewniamy sie ze wywoluje na mocku deletebyid z przekazanym id.

//selentis