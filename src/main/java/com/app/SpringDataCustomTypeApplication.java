package com.app;

import com.app.model.Company;
import com.app.model.Worker;
import com.app.repository.CompanyRepository;
import com.app.repository.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringDataCustomTypeApplication {

    private final WorkerRepository workerRepository;
    private final CompanyRepository companyRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataCustomTypeApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            var company1 = Company
                    .builder()
                    .name("COMP A")
                    .build();

            var company2 = Company
                    .builder()
                    .name("COMP B")
                    .build();

            var worker1 = Worker
                    .builder()
                    .name("W1")
                    .salary(new BigDecimal("100"))
                    .company(company1)
                    .build();

            var worker2 = Worker
                    .builder()
                    .name("W2")
                    .salary(new BigDecimal("200"))
                    .company(company1)
                    .build();

            var worker3 = Worker
                    .builder()
                    .name("W3")
                    .salary(new BigDecimal("300"))
                    .company(company2)
                    .build();

            var worker4 = Worker
                    .builder()
                    .name("W4")
                    .salary(new BigDecimal("400"))
                    .company(company2)
                    .build();

            workerRepository.saveAll(List.of(worker1, worker2, worker3, worker4));

            workerRepository
                    .findAll()
                    .forEach(System.out::println);
        };
    }

}
