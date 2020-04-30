package com.app.repository;

import com.app.model.Worker;
import com.app.projection.CompanyWithMaxWorkerSalary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
