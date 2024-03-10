package com.example.labReport.business.abstracts;

import java.util.List;

import com.example.labReport.business.requests.CreateLaborantRequest;
import com.example.labReport.business.responses.GetAllLaborantsResponse;

public interface LaborantService {

	List<GetAllLaborantsResponse> getAll();
	public void add(CreateLaborantRequest createLaborantRequest);
}
