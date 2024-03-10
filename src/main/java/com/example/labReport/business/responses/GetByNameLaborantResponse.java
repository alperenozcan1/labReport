package com.example.labReport.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetByNameLaborantResponse {
	private String id;
	private String name;
}
