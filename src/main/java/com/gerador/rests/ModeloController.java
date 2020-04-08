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

import com.gerador.entidades.Modelo;
import com.gerador.repositorys.IModelo;
import com.gerador.rests.inter.IRecurso;
import com.gerador.servicos.Servico;

@RestController
@RequestMapping("/modelo")
public class ModeloController implements IRecurso<Modelo> {

	@Autowired
	private Servico<Modelo, Long> servico;

	@Autowired
	private IModelo rep;

	@RequestMapping(method = RequestMethod.GET)
	public String recurso() {
		return "recurso ativo";
	}

	@GetMapping("/lista")
	public List<Modelo> lista() {
		return servico.lista(rep);
	}

	@GetMapping("/buscarPorId")
	public Modelo buscarPorId(Long id) {
		return servico.buscarPorId(id, rep);
	}

	@GetMapping("/pesquisar")
	public List<Modelo> pesquisar(@RequestBody Modelo entidade) {
		return servico.pesquisar(rep, entidade.getNome());
	}

	@PostMapping("/salvar")
	public Modelo salvar(@RequestBody Modelo entidade) {
		return servico.salvar(entidade, rep);

	}

	@PutMapping("/atualizar")
	public Modelo atualizar(Modelo entidade) {
		return servico.salvar(entidade, rep);

	}

}
