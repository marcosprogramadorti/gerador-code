
package com.gerador.servicos;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ServicoTeste<T, E, ID> {

	@Autowired
	private ModelMapper modelMapper;
	
	

	@SuppressWarnings("unchecked")
	public E salvar(E e, JpaRepository<T, ID> rep, Class<T> cl) throws InstantiationException, IllegalAccessException {

		//T inst = cl.newInstance();
		//if (inst instanceof T) {
		
		return (E) modelMapper.map(rep.save(modelMapper.map(e, cl )), e.getClass());
		// }

		// return null;

	}

}
