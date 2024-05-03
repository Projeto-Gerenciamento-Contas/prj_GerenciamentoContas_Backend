package br.com.api.gerenciamento.Controle;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class EnderecoControle {
    @GetMapping("/usuario/enderecos")
    public String endereco(){
        return("bem vindo ao controle de enderecos");
    }

    
}
