package br.com.api.gerenciamento.Controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.api.gerenciamento.Modelo.*;
import br.com.api.gerenciamento.Repositorio.UsuarioRepositorio;
import br.com.api.gerenciamento.Service.UsuarioServico;



@RestController
@CrossOrigin(origins = "*")
public class UsuarioControle {

	@Autowired
	private UsuarioRepositorio acoes;

	@Autowired 
	private UsuarioServico us;

	@GetMapping("/")
	public @ResponseBody String inicio() {
		return ("bem vindo a API de gerenciamento de contas");
	}

	@GetMapping("/listar")
	public @ResponseBody Iterable<UsuarioModelo> listar() {
		return acoes.findAll();
	}

	@PostMapping("/cadastrar")
	public @ResponseBody ResponseEntity<?> cadastrar(@RequestBody UsuarioModelo um) {
		return us.cadastrar(um);

	}

	@GetMapping("/usuarios/{codigo}")
    public @ResponseBody UsuarioModelo filtrar(@PathVariable Integer codigo) {
    	return acoes.findByCodigo(codigo);
    }
	@PutMapping("/alterar")
	public @ResponseBody UsuarioModelo alterar(@RequestBody UsuarioModelo um) {
		return acoes.save(um);

	}
	@DeleteMapping("/usuarios/{codigo}")
	public @ResponseBody void remover(@PathVariable Integer codigo){
		UsuarioModelo um = filtrar(codigo);
		this.acoes.delete(um);
	}
	}
	
	
	
	