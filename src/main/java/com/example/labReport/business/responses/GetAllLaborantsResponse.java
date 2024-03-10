package com.example.labReport.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllLaborantsResponse {
	private String id;
	private String name;
	private String hospitalIdentity;
}
