package com.hairdresser.Service;

import com.hairdresser.Model.dao.Personel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PersonelService {

    Personel save(Personel personel);

    Personel findById(Long id);

    void deleteById(Long id);

    Page<Personel> getPage(Pageable pageable);
}
