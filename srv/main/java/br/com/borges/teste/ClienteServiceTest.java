package br.com.borges.teste;
import org.junit.Assert;
import org.junit.Test;

import br.com.borges.dao.ClienteDao;
import br.com.borges.dao.ClienteDaoMock;
import br.com.borges.dao.IClienteDao;
import br.com.borges.service.ClienteService;
public class ClienteServiceTest {
	
	@Test
	public void salvarTeste() {
		
		ClienteDaoMock mockDao = new ClienteDaoMock();
		ClienteService service = new ClienteService(mockDao);
		String retorno = service.salvar();
		Assert.assertEquals("sucesso", retorno);
	
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNosalvarTeste() {
		IClienteDao mockDao = new ClienteDao();
		ClienteService service = new ClienteService(mockDao);
		String retorno = service.salvar();
		Assert.assertEquals("sucesso", retorno);
	
	}
}
