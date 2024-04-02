package br.com.api.gerenciamento.Controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.api.gerenciamento.Modelo.*;
import br.com.api.gerenciamento.Repositorio.GerenciamentoRepositorio;



@RestController
@CrossOrigin(origins = "*")
public class GerenciamentoControle {

	@Autowired
	private GerenciamentoRepositorio acoes;

	@GetMapping("/ola")
	public String rota() {
		return "Olá mundo";
	}

	@GetMapping("/")
	public @ResponseBody String inicio() {
		return ("bem vindo a API de gerenciamento de contas");
	}

	@GetMapping("/listar")
	public @ResponseBody Iterable<UsuarioModelo> listar() {
		return acoes.findAll();
	}

	@PostMapping("/usuarios")
	public @ResponseBody UsuarioModelo cadastrar(@RequestBody UsuarioModelo produto) {
		return acoes.save(produto);

	}

	@GetMapping("/usuarios/{codigo}")
    public @ResponseBody UsuarioModelo filtrar(@PathVariable Integer codigo) {
    	return acoes.findByCodigo(codigo);
    }
	@PutMapping("/usuarios")
	public @ResponseBody UsuarioModelo alterar(@RequestBody UsuarioModelo produto) {
		return acoes.save(produto);

	}
	@RequestMapping(value="/usuarios/{codigo}", method=RequestMethod.DELETE)
	public @ResponseBody void remover(@PathVariable Integer codigo){
		UsuarioModelo produto = filtrar(codigo);
		this.acoes.delete(produto);
	}
	}
	
	
	
	