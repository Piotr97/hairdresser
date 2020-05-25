package com.hairdresser.mapper;

import com.hairdresser.Model.dao.Personel;
import com.hairdresser.Model.dto.PersonelDto;

public interface PersonelMapper {

    Personel PersonelDtoToPersonel(PersonelDto personelDto);

    PersonelDto PersonelToPersonelDto(Personel personel);

}
