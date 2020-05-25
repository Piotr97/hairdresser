package com.hairdresser.mapper.impl;

import com.hairdresser.Model.dao.Personel;
import com.hairdresser.Model.dto.PersonelDto;
import com.hairdresser.mapper.PersonelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonelMapperImpl implements PersonelMapper {


    @Override
    public Personel PersonelDtoToPersonel(PersonelDto personelDto) {
        return Personel.builder()
                .id(personelDto.getId())
                .employeeName(personelDto.getEmployeeName())
                .password(personelDto.getPassword())
                .build();
    }

    @Override
    public PersonelDto PersonelToPersonelDto(Personel personel) {
        return PersonelDto.builder()
                .employeeName(personel.getEmployeeName())
                .id(personel.getId())
                .password(personel.getPassword())
                .build();
    }
}
