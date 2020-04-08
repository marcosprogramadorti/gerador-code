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

import com.gerador.entidades.Arquivo;
import com.gerador.repositorys.IArquivo;
import com.gerador.rests.inter.IRecurso;
import com.gerador.servicos.Servico;

@RestController
@RequestMapping("/arquivo")
public class ArquivoController implements IRecurso<Arquivo> {

	@Autowired
	private Servico<Arquivo, Long> servico;

	@Autowired
	private IArquivo rep;

	@RequestMapping(method = RequestMethod.GET)
	public String recurso() {
		return "recurso ativo";
	}

	@GetMapping("/lista")
	public List<Arquivo> lista() {
		return servico.lista(rep);
	}

	@GetMapping("/buscarPorId")
	public Arquivo buscarPorId(Long id) {
		return servico.buscarPorId(id, rep);
	}

	@GetMapping("/pesquisar")
	public List<Arquivo> pesquisar(@RequestBody Arquivo entidade) {
		return servico.pesquisar(rep, entidade.getNome());
	}

	@PostMapping("/salvar")
	public Arquivo salvar(@RequestBody Arquivo entidade) {
		return servico.salvar(entidade, rep);

	}

	@PutMapping("/atualizar")
	public Arquivo atualizar(Arquivo entidade) {
		return servico.salvar(entidade, rep);

	}

}
