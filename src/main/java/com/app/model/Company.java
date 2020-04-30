package com.app.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
