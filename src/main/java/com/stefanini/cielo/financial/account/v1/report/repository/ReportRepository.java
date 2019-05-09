package com.stefanini.cielo.financial.account.v1.report.repository;

import org.springframework.data.repository.CrudRepository;

import com.stefanini.cielo.financial.account.v1.report.model.ReportModel;

public interface ReportRepository extends CrudRepository<ReportModel, Long> {

}