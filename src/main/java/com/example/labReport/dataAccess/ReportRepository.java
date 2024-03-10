package com.example.labReport.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.labReport.entities.Report;

public interface ReportRepository extends JpaRepository<Report, Integer>{
	List<Report> findByName(String name);
	List<Report> findByNatIdentity(String natIdentity);
	List<Report> findAllByOrderByDateDesc();
}
