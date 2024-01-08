package br.com.borges.service;

import br.com.borges.dao.ClienteDao;
import br.com.borges.dao.IClienteDao;

public class ClienteService {
	
	private IClienteDao clienteDao;
	
	public ClienteService(IClienteDao clienteDao) {
		//clienteDao = new ClienteDao();
		this.clienteDao =  clienteDao;
	}

	 public String salvar() {
		 clienteDao.salvar();
		 return "sucesso";
	 }
}
