package br.com.api.gerenciamento.Controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.gerenciamento.Modelo.EnderecoModelo;
import br.com.api.gerenciamento.Repositorio.EnderecoRepositorio;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuario/enderecos")
public class EnderecoControle {

    @Autowired
    public EnderecoRepositorio ER;

    @GetMapping("/")
    public String endereco() {
        return ("bem vindo ao controle de enderecos");
    }

    @GetMapping("/listar")
    public @ResponseBody Iterable<EnderecoModelo> listar() {
        return ER.findAll();
    }

    @GetMapping("/listarCep/{cep}")
    public @ResponseBody EnderecoModelo filtrarCep(@PathVariable Integer cep) {
        return ER.findByCep(cep);

    }

    @GetMapping("/listarCodigo/{codigoEndereco}")
    public @ResponseBody EnderecoModelo filtrarCodigo(@PathVariable Integer codigoEndereco) {
        return ER.findByCodigoEndereco(codigoEndereco);

    }

    @PutMapping("/alterar")
    public @ResponseBody EnderecoModelo alterar(@RequestBody EnderecoModelo em) {
        return ER.save(em);

    }

    
      @DeleteMapping("/{codigo}")
      public @ResponseBody void remover(@PathVariable Integer codigo){
      EnderecoModelo em = filtrarCodigo(codigo);
      this.ER.delete(em);
      }
     
    @PostMapping("/cadastrar")
    public EnderecoModelo cadastrar(@RequestBody EnderecoModelo em) {
        return ER.save(em);
    }

}
