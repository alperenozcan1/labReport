package com.example.labReport.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="reports")
public class Report {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="natIdentity")
	private String natIdentity;
	@Column(name="diagnosis")
	private String diagnosis;
	@Column(name="details")
	private String details;
	@Column(name="date")
    private LocalDate date;
	@Column(name="url")
	private String url;
	
	@ManyToOne
	@JoinColumn(name="laborant_id")
	private Laborant laborant;
}
