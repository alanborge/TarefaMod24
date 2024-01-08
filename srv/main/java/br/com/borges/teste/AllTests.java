package br.com.borges.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.borges.dao.IContratoDao;

@RunWith(Suite.class)
@Suite.SuiteClasses({ClienteServiceTest.class, ContratoServiceTest.class })
public class AllTests {

}
