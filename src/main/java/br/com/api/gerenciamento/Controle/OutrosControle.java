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

import br.com.api.gerenciamento.Modelo.OutrosModelo;
import br.com.api.gerenciamento.Repositorio.OutrosRepositorio;




@RestController
@CrossOrigin(origins  = "*")
@RequestMapping("/enderecos/Outros")
public class OutrosControle {
    @Autowired
    private OutrosRepositorio AAR;
   

    @GetMapping("/")
    public String teste() {
        return "bem vindo ao controle de lista de Outros";
    }
    @GetMapping("/listar")
    public @ResponseBody Iterable<OutrosModelo> listar() {
        return AAR.findAll();
    }
    @GetMapping("/listarCodAparelho/{codCompras}")
public @ResponseBody OutrosModelo filtrarCodAparelho(@PathVariable Long codCompras){
    return AAR.findByCodOutros(codCompras);
    
}
@PostMapping("/cadastrar")
public  OutrosModelo cadastrar(@RequestBody  OutrosModelo apm){
    return AAR.save(apm);

}
@PutMapping("/alterar")
public  OutrosModelo Alterar(@RequestBody  OutrosModelo apm){
    return AAR.save(apm);

}
@DeleteMapping("/remover/{codOutros}")
public @ResponseBody void remover(@PathVariable Long codOutros){
    OutrosModelo aem = filtrarCodAparelho(codOutros);
    this.AAR.delete(aem);
}



}
