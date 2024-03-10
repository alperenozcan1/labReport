package com.example.labReport.business.requests;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateReportRequest {
	private int id;
	private String name;
	private String natIdentity;
	private String diagnosis;
	private String details;
    private LocalDate date;
    private String url;
}
