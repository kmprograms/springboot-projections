package com.app.repository;

import com.app.model.Company;
import com.app.projection.CompanyWithMaxWorkerSalary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    @Query("select c.name as companyName, max(w.salary) as salary from Worker w join w.company c group by c")
    List<CompanyWithMaxWorkerSalary> groupByCompanyWithMaxWorkerSalary();
}
