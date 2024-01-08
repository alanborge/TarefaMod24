package br.com.borges.service;

import br.com.borges.dao.ContratoDao;
import br.com.borges.dao.IContratoDao;

public class ContratoService implements IContratoService {
	
	private IContratoDao contratoDao;

	public ContratoService(IContratoDao dao) {
		this.contratoDao = dao;
	}

	@Override
	public String salvar() {
		contratoDao.salvar();
		return "Salvo com Exito";
	}

	@Override
	public String buscar() {
		contratoDao.buscar();
		return "Encontrado com Sucesso";
	}

	@Override
	public String excluir() {
		contratoDao.excluir();
		return "Excluido com sucesso";
	}

	@Override
	public String atualizar() {
		contratoDao.atualizar();
		return "Atualizado com sucesso";
	}

}
