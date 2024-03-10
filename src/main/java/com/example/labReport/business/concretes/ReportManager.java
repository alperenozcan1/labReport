package com.example.labReport.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.labReport.business.abstracts.ReportService;
import com.example.labReport.business.requests.CreateReportRequest;
import com.example.labReport.business.requests.UpdateReportRequest;
import com.example.labReport.business.responses.GetAllReportsResponse;
import com.example.labReport.business.responses.GetByDateReportResponse;
import com.example.labReport.business.responses.GetByIdentityReportResponse;
import com.example.labReport.business.responses.GetByNameReportResponse;
import com.example.labReport.core.utilities.mappers.ModelMapperService;
import com.example.labReport.dataAccess.ReportRepository;
import com.example.labReport.entities.Report;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ReportManager implements ReportService{
	private ReportRepository reportRepository;
	private ModelMapperService modelMapperService;
	@Override
	public List<GetAllReportsResponse> getAll() {
		List<Report> reports = reportRepository.findAll();

		List<GetAllReportsResponse> reportsResponse = reports.stream()
				.map(report -> this.modelMapperService.forResponse().map(report, GetAllReportsResponse.class))
				.collect(Collectors.toList());

		return reportsResponse;
	}

	@Override
	public List<GetByNameReportResponse> getByName(String name) {
		List<Report> reports=this.reportRepository.findByName(name);
		List<GetByNameReportResponse> reportsResponse = reports.stream()
				.map(report -> this.modelMapperService.forResponse().map(report, GetByNameReportResponse.class))
				.collect(Collectors.toList());
		
		return reportsResponse;
	}

	@Override
	public List<GetByIdentityReportResponse> getByNatIdentity(String natIdentity) {
		List<Report> reports=this.reportRepository.findByNatIdentity(natIdentity);
		List<GetByIdentityReportResponse> reportsResponse = reports.stream()
				.map(report -> this.modelMapperService.forResponse().map(report, GetByIdentityReportResponse.class))
				.collect(Collectors.toList());
		
		return reportsResponse;
	}

	@Override
	public void add(CreateReportRequest createReportRequest) {
		Report report = this.modelMapperService.forRequest().map(createReportRequest, Report.class);
		this.reportRepository.save(report);
	}

	@Override
	public void update(UpdateReportRequest updateReportRequest) {
		Report report = this.modelMapperService.forRequest().map(updateReportRequest, Report.class);
		this.reportRepository.save(report);
		
	}

	@Override
	public void delete(int id) {
		this.reportRepository.deleteById(id);
		
	}

	@Override
	public List<GetByDateReportResponse> getByDateDesc() {
		List<Report> reports=this.reportRepository.findAllByOrderByDateDesc();
		List<GetByDateReportResponse> reportsResponse = reports.stream()
				.map(report -> this.modelMapperService.forResponse().map(report, GetByDateReportResponse.class))
				.collect(Collectors.toList());
		return reportsResponse;
	}

}
