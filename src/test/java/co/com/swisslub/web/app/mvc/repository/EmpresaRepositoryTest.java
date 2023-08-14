package co.com.swisslub.web.app.mvc.repository;


import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.swisslub.web.app.mvc.model.Empresa;

class EmpresaRepositoryTest {
@Autowired
private EmpresaRepository repository;
	@Test
	void testListarEmpresas() {
		Optional<List<Empresa>> optionalLista=Optional.of(repository.findAll());
		List<Empresa>lista=optionalLista.get(); 
		for (Empresa empresa : lista) {
			System.out.println(empresa);
		}
		
	}

}
