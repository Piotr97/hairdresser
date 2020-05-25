package com.hairdresser.Repository;

import com.hairdresser.Model.dao.ServiceHairdresser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface RepositoryHairdresser extends JpaRepository<ServiceHairdresser,Long> {
    ServiceHairdresser findByTime(LocalDateTime time);
}
