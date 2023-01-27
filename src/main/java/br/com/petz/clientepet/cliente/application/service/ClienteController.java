package br.com.petz.clientepet.cliente.application.service;

import org.springframework.web.bind.annotation.RestController;

import br.com.petz.clientepet.cliente.application.api.ClienteAPI;
import br.com.petz.clientepet.cliente.application.api.ClienteReponse;
import br.com.petz.clientepet.cliente.application.api.ClienteRequest;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ClienteController implements ClienteAPI {

	@Override
	public ClienteReponse postCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteController - postCliente");
		log.info("[fonaliza] ClienteController - postCliente");
		return null;
	}

}
