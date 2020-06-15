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

import com.gerador.dto.TImportDTO;
import com.gerador.entidades.TImport;
import com.gerador.repositorys.ITImport;
import com.gerador.rests.inter.IRecurso;
import com.gerador.servicos.Servico;
import com.gerador.servicos.ServicoTeste;


@RestController
@RequestMapping("/timport")
public class TImportController  implements IRecurso<TImport>  {
	
	@Autowired
    private Servico<TImport, Long> servico;
	
	@Autowired
    private ServicoTeste<TImport,TImportDTO, Long> servicoTeste;
	
	@Autowired
    private ITImport rep;
	
	@RequestMapping(method = RequestMethod.GET)
	public String recurso() {
        return "recurso ativo";
    }
	
	@GetMapping("/lista")
	public List<TImport> lista() {
        return servico.lista(rep);
    }
	
	@GetMapping("/buscarPorId")
	public TImport buscarPorId(Long id) {
        return servico.buscarPorId(id, rep);
    }
	
	@GetMapping("/pesquisar")
	public List<TImport> pesquisar(TImport entidade) {
        return servico.pesquisar(rep, entidade.getDescricao());
    }
	
	@PostMapping("/salvar")
	public TImport salvar(@RequestBody TImport entidade) {
       return servico.salvar(entidade, rep);
       
    }
	@PutMapping("/atualizar")
	public TImport atualizar(TImport entidade) {
       return servico.salvar(entidade, rep);
       
    }
	
	@PostMapping("/salvarTeste")
	public TImportDTO salvarTeste(@RequestBody TImportDTO entidade) throws InstantiationException, IllegalAccessException {
       return servicoTeste.salvar(entidade, rep, TImport.class);
       
    }
	
	
	

}
