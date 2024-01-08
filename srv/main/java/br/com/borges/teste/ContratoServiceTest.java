package br.com.borges.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.borges.dao.ContratoDao;
import br.com.borges.dao.IContratoDao;
import br.com.borges.mock.ContratoDaoMock;
import br.com.borges.service.ContratoService;
import br.com.borges.service.IContratoService;

public class ContratoServiceTest {
	
	@Test
	public void salvarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Salvo com Exito", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoComBancoDeDadosTest() {
		IContratoDao dao = new ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test
	public void buscarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.buscar();
		Assert.assertEquals("Encontrado com Sucesso", retorno);
	}
	
	@Test
	public void excluirTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.excluir();
		Assert.assertEquals("Excluido com sucesso", retorno);
	}
	
	@Test
	public void atualizarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.atualizar();
		Assert.assertEquals("Atualizado com sucesso", retorno);
	}
}
