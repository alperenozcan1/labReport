package com.example.labReport.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.labReport.business.abstracts.LaborantService;
import com.example.labReport.business.requests.CreateLaborantRequest;
import com.example.labReport.business.responses.GetAllLaborantsResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/laborants")
@AllArgsConstructor
public class LaborantsController {

	private LaborantService laborantService;
	@GetMapping("/getall")
	public List<GetAllLaborantsResponse> getall(){
		return laborantService.getAll();
	}
	@PostMapping("/add")
	public void add(CreateLaborantRequest createLaborantRequest) {
		this.laborantService.add(createLaborantRequest);
	}
}
