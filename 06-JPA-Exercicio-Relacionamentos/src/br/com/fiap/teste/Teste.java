package br.com.fiap.teste;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;

import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.dao.impl.UsuarioDAOImpl;
import br.com.fiap.entity.CasoTeste;
import br.com.fiap.entity.ItemTeste;
import br.com.fiap.entity.Sistema;
import br.com.fiap.entity.Usuario;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

class Teste {

	@Test
	void test() {
		EntityManager em = EntityManagerFactorySingleton
				.getInstance().createEntityManager();

		UsuarioDAO dao = new UsuarioDAOImpl(em);
		
		Usuario usuario = new Usuario();
		usuario.setNome("Barcelos");
		
		ItemTeste item = new ItemTeste();
		item.setDescricao("Teste de stress");
		
		CasoTeste caso = new CasoTeste();
		caso.setNome("Caso de cadastro de usuario");
		
		Sistema sistema = new Sistema();
		sistema.setNome("Sistema Teste");
		
		List<ItemTeste> itens = new ArrayList<>();
		itens.add(item);
		usuario.setItens(itens);
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(usuario);
		item.setUsuarios(usuarios);
		
		item.setCaso(caso);
		
		caso.setSistema(sistema);
		
		try {
			dao.create(usuario);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			fail("Falha no teste");
		}
		
	}

}








