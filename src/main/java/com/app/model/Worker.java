package com.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "workers")
public class Worker {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private BigDecimal salary;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "company_id")
    private Company company;
}
