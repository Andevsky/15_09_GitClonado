package br.sceweb.teste;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC02ConsultarEmpresa {

		static Empresa empresaEsperada;
		static Empresa empresaObtida;
		static EmpresaDAO empresaDAO;
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		empresaEsperada.setNomeDaEmpresa("empresa x");
		empresaEsperada.setCnpj("89424232000180");
		empresaEsperada.setNomeFantasia("empresa x");
		empresaEsperada.setEndereco("rua taquari");
		empresaEsperada.setTelefone("2222");
		empresaEsperada = new Empresa();
		empresaObtida = new Empresa();
		empresaDAO = new EmpresaDAO();
		empresaDAO.adiciona(empresaEsperada);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01ConsultarEmpresaComSucesso() {
		empresaObtida=empresaDAO.consultaEmpresa("89424232000180");
		assertTrue(empresaEsperada.equals(empresaObtida));
	}

}
