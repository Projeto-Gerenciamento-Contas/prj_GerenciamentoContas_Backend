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

import br.com.api.gerenciamento.Modelo.ComprasModelo;
import br.com.api.gerenciamento.Repositorio.ComprasRepositorio;




@RestController
@CrossOrigin(origins  = "*")
@RequestMapping("/enderecos/Compras")
public class ComprasControle {
    @Autowired
    private ComprasRepositorio AAR;
   

    @GetMapping("/")
    public String teste() {
        return "bem vindo ao controle de lista de compras";
    }
    @GetMapping("/listar")
    public @ResponseBody Iterable<ComprasModelo> listar() {
        return AAR.findAll();
    }
    @GetMapping("/listarCodAparelho/{codCompras}")
public @ResponseBody ComprasModelo filtrarCodAparelho(@PathVariable Long codCompras){
    return AAR.findByCodCompras(codCompras);
    
}
@PostMapping("/cadastrar")
public  ComprasModelo cadastrar(@RequestBody  ComprasModelo apm){
    return AAR.save(apm);

}
@PutMapping("/alterar")
public  ComprasModelo Alterar(@RequestBody  ComprasModelo apm){
    return AAR.save(apm);

}
@DeleteMapping("/remover/{codCompras}")
public @ResponseBody void remover(@PathVariable Long codCompras){
    ComprasModelo aem = filtrarCodAparelho(codCompras);
    this.AAR.delete(aem);
}



}
