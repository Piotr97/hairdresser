package com.hairdresser.controller;

import com.hairdresser.Model.dao.Personel;
import com.hairdresser.Model.dto.PersonelDto;
import com.hairdresser.Service.PersonelService;
import com.hairdresser.mapper.PersonelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/personel")
@RequiredArgsConstructor
public class PersonelController {

    private final PersonelService personelService;
    private final PersonelMapper personelMapper;


    @PostMapping("/add")
    public PersonelDto savePersonel(@RequestBody PersonelDto personelDto) {
        Personel save = personelService.save(personelMapper.PersonelDtoToPersonel(personelDto));
        return personelMapper.PersonelToPersonelDto(save);
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/{id}")
    public PersonelDto findPersonelById(@PathVariable Long id) {
        Personel byId = personelService.findById(id);
        return personelMapper.PersonelToPersonelDto(byId);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public void deletePersonelById(@PathVariable Long id) {
        personelService.deleteById(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping
    public Page<PersonelDto> getPage(@RequestParam int page, @RequestParam int size) {
        Page<Personel> personels = personelService.getPage(PageRequest.of(page, size));
        return personels.map(personelMapper::PersonelToPersonelDto);
    }
}
