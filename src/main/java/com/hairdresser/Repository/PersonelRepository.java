package com.hairdresser.Repository;

import com.hairdresser.Model.dao.Personel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonelRepository extends JpaRepository<Personel, Long> {
    Optional<Personel> findByEmployeeName(String employeeName);
}
