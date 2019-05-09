package com.stefanini.cielo.financial.account.v1.report.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stefanini.cielo.controller.AbstractController;
import com.stefanini.cielo.financial.account.v1.report.service.ReportService;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("financial/account/v1")
@Scope("request")
public class ReportController extends AbstractController<ReportService> {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/report", produces = { "application/json; charset=utf-8" }, method = RequestMethod.GET)
	@ResponseBody
	@Override
	public String execute() {
		logger.debug("Olá");
		
		service.execute();
		
		String retorno = "{\"totalControleLancamento\":{\"quantidadeLancamentos\":608,\"quantidadeRemessas\":39,\"valorLancamentos\":473320.37},\"listaControleLancamento\":[{\"lancamentoContaCorrenteCliente\":{\"numeroRemessaBanco\":64320236054,\"nomeSituacaoRemessa\":\"Pago\",\"dadosDomicilioBancario\":{\"codigoBanco\":123,\"numeroAgencia\":1,\"numeroContaCorrente\":\"00000000065470\"},\"nomeTipoOperacao\":\"regular\"},\"dataEfetivaLancamento\":\"03/06/2016\",\"dataLancamentoContaCorrenteCliente\":\"03/06/2016\",\"numeroEvento\":42236790,\"descricaoGrupoPagamento\":\"LA-56\",\"codigoIdentificadorUnico\":\"1\",\"nomeBanco\":\"BANCO ABCD S.A.             \",\"quantidadeLancamentoRemessa\":22,\"numeroRaizCNPJ\":\"12996721\",\"numeroSufixoCNPJ\":\"1597\",\"valorLancamentoRemessa\":11499.1,\"dateLancamentoContaCorrenteCliente\":1464922800000,\"dateEfetivaLancamento\":1464922800000},{\"lancamentoContaCorrenteCliente\":{\"numeroRemessaBanco\":64320626054,\"dadosAnaliticoLancamentoFinanceiroCliente\":[],\"nomeSituacaoRemessa\":\"Pago\",\"dadosDomicilioBancario\":{\"codigoBanco\":123,\"numeroAgencia\":1,\"numeroContaCorrente\":\"00000000065470\"},\"nomeTipoOperacao\":\"regular\"},\"dataEfetivaLancamento\":\"02/06/2016\",\"dataLancamentoContaCorrenteCliente\":\"02/06/2016\",\"numeroEvento\":42592397,\"descricaoGrupoPagamento\":\"LA-56\",\"codigoIdentificadorUnico\":\"25\",\"nomeBanco\":\"BANCO ABCD S.A.             \",\"quantidadeLancamentoRemessa\":2,\"numeroRaizCNPJ\":\"12996721\",\"numeroSufixoCNPJ\":\"1597\",\"valorLancamentoRemessa\":1960,\"dateLancamentoContaCorrenteCliente\":1464836400000,\"dateEfetivaLancamento\":1464836400000}],\"indice\":1,\"tamanhoPagina\":25,\"totalElements\":39}";
		return retorno;
	}
	
}