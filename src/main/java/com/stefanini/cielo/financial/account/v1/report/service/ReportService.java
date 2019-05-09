package com.stefanini.cielo.financial.account.v1.report.service;

import org.springframework.stereotype.Service;

import com.stefanini.cielo.annotations.CieloPermission;
import com.stefanini.cielo.enums.EnumModule;
import com.stefanini.cielo.enums.EnumPermission;
import com.stefanini.cielo.enums.EnumSystem;
import com.stefanini.cielo.service.AbstractService;

@Service
@CieloPermission(system = EnumSystem.FINANCIAL, module = EnumModule.ACCOUNT, permission = EnumPermission.REPORT)
public class ReportService extends AbstractService {
	

	@Override
	public void specificExecute() {
		
	}

	

}