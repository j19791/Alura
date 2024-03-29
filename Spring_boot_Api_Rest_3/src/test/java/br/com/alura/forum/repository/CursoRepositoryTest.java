package br.com.alura.forum.repository;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.alura.forum.modelo.Curso;

@RunWith(SpringRunner.class)
@DataJpaTest //classe que testa especificamente repository
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)//nao substituir minhas configs
@ActiveProfiles("test") //utilizar o profile ativo de test-nao usar o default
class CursoRepositoryTest {

	@Autowired //injeção de dependencias pelo Spring
	private CursoRepository repository;
	
	@Autowired
	private TestEntityManager em;
	
	@Test
	public void deveriaCarregarUmCursoAoBuscarPeloSeuNome() {
		String nomeCurso = "HTML 5";
		
		Curso html5 = new Curso();
		html5.setNome(nomeCurso);
		html5.setCategoria("Programacao");
		em.persist(html5);
		
		Curso curso = repository.findByNome(nomeCurso);
		Assert.assertNotNull(curso);
		Assert.assertEquals(nomeCurso, curso.getNome());
	}

	@Test
	public void naoDeveriaCarregarUmCursoNaoCadastradoAoBuscarPeloSeuNome() {
		String nomeCurso = "JPA";
		Curso curso = repository.findByNome(nomeCurso);
		Assert.assertNull(curso);
		
	}
	
}
