package com.hairdresser.Model.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Personel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeName;
    private String password;
    private LocalTime workStart;
    private LocalTime workEnd;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Rolee> rolees;

    @OneToMany(mappedBy = "personel")
    private Set<Order> orders;
}
