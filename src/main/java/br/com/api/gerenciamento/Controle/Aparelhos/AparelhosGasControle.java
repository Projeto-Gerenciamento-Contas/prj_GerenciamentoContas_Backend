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
import br.com.api.gerenciamento.Modelo.Aparelhos.AparelhosGasModelo;
import br.com.api.gerenciamento.Repositorio.Aparelhos.AparelhosGasRepositorio;
@CrossOrigin(origins = "*")
@RequestMapping("/enderecos/aparelhos/gas")
@RestController
public class AparelhosGasControle {
    @Autowired
    private AparelhosGasRepositorio AGR;
    
    @GetMapping("/")
    public String teste() {
        return "bem vindo ao controle de aparelhos de gas";
    }
    @GetMapping("/listar")
    public @ResponseBody Iterable<AparelhosGasModelo> listar() {
        return AGR.findAll();
    }
    @GetMapping("/listarCodAparelho/{codAparelhoGas}")
public @ResponseBody AparelhosGasModelo filtrarCodAparelhoGas(@PathVariable Integer codAparelhoGas){
    return AGR.findBycodAparelhoGas(codAparelhoGas);
    
}
@PostMapping("/cadastrar")
public  AparelhosGasModelo cadastrar(@RequestBody  AparelhosGasModelo apm){
    return AGR.save(apm);

}
@PutMapping("/alterar")
public  AparelhosGasModelo Alterar(@RequestBody  AparelhosGasModelo apm){
    return AGR.save(apm);

}
@DeleteMapping("/remover/{codAparelhoGas}")
public @ResponseBody void remover(@PathVariable Integer codAparelhoGas){
    AparelhosGasModelo aem = filtrarCodAparelhoGas(codAparelhoGas);
    this.AGR.delete(aem);
}



    
}
