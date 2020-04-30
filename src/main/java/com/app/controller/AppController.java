package com.app.controller;

import com.app.projection.CompanyWithMaxWorkerSalary;
import com.app.repository.CompanyRepository;
import com.app.repository.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AppController {

    private final CompanyRepository companyRepository;

    @GetMapping("/test")
    public List<CompanyWithMaxWorkerSalary> test() {
        return companyRepository.groupByCompanyWithMaxWorkerSalary();
    }
}
