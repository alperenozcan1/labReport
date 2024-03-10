package com.example.labReport.business.abstracts;

import java.util.List;

import com.example.labReport.business.requests.CreateReportRequest;
import com.example.labReport.business.requests.UpdateReportRequest;
import com.example.labReport.business.responses.GetAllReportsResponse;
import com.example.labReport.business.responses.GetByDateReportResponse;
import com.example.labReport.business.responses.GetByIdentityReportResponse;
import com.example.labReport.business.responses.GetByNameReportResponse;

public interface ReportService {
	public List<GetAllReportsResponse> getAll();
	public List<GetByNameReportResponse> getByName(String name);
	public List<GetByIdentityReportResponse> getByNatIdentity(String natIdentity);
	public List<GetByDateReportResponse> getByDateDesc();
	void add(CreateReportRequest createReportRequest);
	void update(UpdateReportRequest updateReportRequest);
	void delete(int id);
}
