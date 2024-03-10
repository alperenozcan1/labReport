package com.example.labReport.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.labReport.entities.Laborant;

public interface LaborantRepository extends JpaRepository<Laborant, Integer>{

}
