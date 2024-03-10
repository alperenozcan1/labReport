package com.example.labReport.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateLaborantRequest {
	
	private String name;
	private String hospitalIdentity;
}
