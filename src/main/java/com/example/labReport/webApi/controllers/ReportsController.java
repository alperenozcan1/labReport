package com.example.labReport.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.labReport.business.abstracts.ReportService;
import com.example.labReport.business.requests.CreateReportRequest;
import com.example.labReport.business.requests.UpdateReportRequest;
import com.example.labReport.business.responses.GetAllReportsResponse;
import com.example.labReport.business.responses.GetByDateReportResponse;
import com.example.labReport.business.responses.GetByIdentityReportResponse;
import com.example.labReport.business.responses.GetByNameReportResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/reports")
@AllArgsConstructor
public class ReportsController {
	private ReportService reportService;
	
	@GetMapping("/getall")
	public List<GetAllReportsResponse> getall(){
		return reportService.getAll();
	}
	@GetMapping("/getbyname")
	public List<GetByNameReportResponse> getByName(@RequestParam("name") String name){
		return reportService.getByName(name);
	}
	@GetMapping("/getbyidentity")
	public List<GetByIdentityReportResponse> getByNatIdentity(@RequestParam("natIdentity") String natIdentity){
		return reportService.getByNatIdentity(natIdentity);
	}
	@GetMapping("/getbydate")
	public List<GetByDateReportResponse> getByDateDesc(){
		return reportService.getByDateDesc();
	}
	
	@PostMapping("/add")
	public void add(CreateReportRequest createReportRequest) {
		this.reportService.add(createReportRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateReportRequest updateReportRequest) {
		this.reportService.update(updateReportRequest);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.reportService.delete(id);
	}
	
	
	
}
