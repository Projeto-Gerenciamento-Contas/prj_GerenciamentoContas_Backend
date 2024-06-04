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

import br.com.api.gerenciamento.Modelo.Aparelhos.AparelhosEletricosModelo;
import br.com.api.gerenciamento.Repositorio.Aparelhos.AparelhosEletricosRepositorio;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/enderecos/aparelhos/eletricos")
public class AparelhosEletricosControle {
    @Autowired
    private AparelhosEletricosRepositorio AER;
    @GetMapping("/")
    public String teste(){
        return "bem vindo ao controle de aparelhos eletricos";
}
@GetMapping("/listar")
public @ResponseBody Iterable<AparelhosEletricosModelo> listar(){
    return AER.findAll();
}
@GetMapping("/listarCodAparelho/{codAparelho}")
public @ResponseBody AparelhosEletricosModelo filtrarCodAparelho(@PathVariable Integer codAparelho){
    return AER.findBycodAparelho(codAparelho);
    
}
@PostMapping("/cadastrar")
public AparelhosEletricosModelo cadastrar(@RequestBody AparelhosEletricosModelo apm){
    return AER.save(apm);

}
@PutMapping("/alterar")
public AparelhosEletricosModelo Alterar(@RequestBody AparelhosEletricosModelo apm){
    return AER.save(apm);

}
@DeleteMapping("/remover/{codAparelho}")
public @ResponseBody void remover(@PathVariable Integer codAparelho){
    AparelhosEletricosModelo aem = filtrarCodAparelho(codAparelho);
    this.AER.delete(aem);
}

}
