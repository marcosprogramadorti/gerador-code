package com.gerador.rests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gerador.entidades.Propriedade;
import com.gerador.repositorys.IPropriedade;
import com.gerador.rests.inter.IRecurso;
import com.gerador.servicos.Servico;

@RestController
@RequestMapping("/propriedade")
public class PropriedadeController implements IRecurso<Propriedade> {

	@Autowired
	private Servico<Propriedade, Long> servico;

	@Autowired
	private IPropriedade rep;

	@RequestMapping(method = RequestMethod.GET)
	public String recurso() {
		return "recurso ativo";
	}

	@GetMapping("/lista")
	public List<Propriedade> lista() {
		return servico.lista(rep);
	}

	@GetMapping("/buscarPorId")
	public Propriedade buscarPorId(Long id) {
		return servico.buscarPorId(id, rep);
	}

	@GetMapping("/pesquisar")
	public List<Propriedade> pesquisar(@RequestBody Propriedade entidade) {
		return servico.pesquisar(rep, entidade.getChave());
	}

	@PostMapping("/salvar")
	public Propriedade salvar(@RequestBody Propriedade entidade) {
		return servico.salvar(entidade, rep);

	}

	@PutMapping("/atualizar")
	public Propriedade atualizar(Propriedade entidade) {
		return servico.salvar(entidade, rep);

	}

}
