package br.com.api.gerenciamento.Controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String endereco(){
        return("bem vindo ao controle de enderecos");
    }
    @GetMapping("/listar")
    public @ResponseBody Iterable<EnderecoModelo> listar(){
        return ER.findAll();
    }

    @GetMapping("/listar/{cep}")
    public @ResponseBody EnderecoModelo filtrar(@PathVariable Integer cep){
        return ER.findByCep(cep);

    }

    @PostMapping("/cadastrar")
    public EnderecoModelo cadastrar(@RequestBody EnderecoModelo em){
        return ER.save(em);
    }

        
    

    
}
