package com.hairdresser.Repository;

import com.hairdresser.Model.dao.Rolee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Rolee, Long> {
    Optional<Rolee> findByName(String name);
}
