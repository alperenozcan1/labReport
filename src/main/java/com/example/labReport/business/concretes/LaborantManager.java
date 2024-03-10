package com.example.labReport.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.labReport.business.abstracts.LaborantService;
import com.example.labReport.business.requests.CreateLaborantRequest;
import com.example.labReport.business.responses.GetAllLaborantsResponse;
import com.example.labReport.dataAccess.LaborantRepository;
import com.example.labReport.entities.Laborant;


import lombok.AllArgsConstructor;
import com.example.labReport.core.utilities.mappers.ModelMapperService;
@Service
@AllArgsConstructor
public class LaborantManager implements LaborantService{
	private LaborantRepository laborantRepository;
	private ModelMapperService modelMapperService;
	
	@Override
	public List<GetAllLaborantsResponse> getAll() {
		List<Laborant> laborants = laborantRepository.findAll();

		List<GetAllLaborantsResponse> laborantsResponse = laborants.stream()
				.map(laborant -> this.modelMapperService.forResponse().map(laborant, GetAllLaborantsResponse.class))
				.collect(Collectors.toList());

		return laborantsResponse;
	}

	@Override
	public void add(CreateLaborantRequest createLaborantRequest) {
		Laborant laborant = this.modelMapperService.forRequest().map(createLaborantRequest, Laborant.class);
		this.laborantRepository.save(laborant);
	}

}
