package com.app.projection;

import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;

public interface CompanyWithMaxWorkerSalary {
    String getCompanyName();
    BigDecimal getSalary();
    @Value("#{target.companyName + ' - ' + target.salary}")
    String getAll();
}
