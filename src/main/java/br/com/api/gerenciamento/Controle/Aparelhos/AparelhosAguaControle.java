package br.com.api.gerenciamento.Controle.Aparelhos;



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

import br.com.api.gerenciamento.Modelo.Aparelhos.AparelhosAguaModelo;
import br.com.api.gerenciamento.Repositorio.Aparelhos.AparelhosAguaRepositorio;




@RestController
@CrossOrigin(origins  = "*")
@RequestMapping("/enderecos/aparelhos/agua")
public class AparelhosAguaControle {
    @Autowired
    private AparelhosAguaRepositorio AAR;
   

    @GetMapping("/")
    public String teste() {
        return "bem vindo ao controle de aparelhos de agua";
    }
    @GetMapping("/listar")
    public @ResponseBody Iterable<AparelhosAguaModelo> listar() {
        return AAR.findAll();
    }
    @GetMapping("/listarCodAparelho/{codAparelhoAgua}")
public @ResponseBody AparelhosAguaModelo filtrarCodAparelho(@PathVariable Integer codAparelhoAgua){
    return AAR.findBycodAparelhoAgua(codAparelhoAgua);
    
}
@PostMapping("/cadastrar")
public  AparelhosAguaModelo cadastrar(@RequestBody  AparelhosAguaModelo apm){
    return AAR.save(apm);

}
@PutMapping("/alterar")
public  AparelhosAguaModelo Alterar(@RequestBody  AparelhosAguaModelo apm){
    return AAR.save(apm);

}
@DeleteMapping("/remover/{codAparelhoAgua}")
public @ResponseBody void remover(@PathVariable Integer codAparelhoAgua){
    AparelhosAguaModelo aem = filtrarCodAparelho(codAparelhoAgua);
    this.AAR.delete(aem);
}



}
