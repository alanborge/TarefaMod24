package br.com.borges.dao;

public class ContratoDao implements IContratoDao {
	


	@Override
	public void salvar() {
		throw new UnsupportedOperationException("Não funciona com o banco");		
	}

	@Override
	public void buscar() {
		throw new UnsupportedOperationException("Busca não processada");
		
	}

	@Override
	public void excluir() {
		throw new UnsupportedOperationException("Exclusão não processada");
		
	}

	@Override
	public void atualizar() {
		throw new UnsupportedOperationException("Atualização não concluida");
		
	}

}
