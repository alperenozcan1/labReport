package com.example.labReport.business.responses;


import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetByNameReportResponse {
	private int id;
	private String name;
	private String natIdentity;
	private String diagnosis;
	private String details;
    private LocalDate date;
    private String url;
}
