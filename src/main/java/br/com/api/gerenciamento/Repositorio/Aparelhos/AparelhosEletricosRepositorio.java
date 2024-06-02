package br.com.api.gerenciamento.Repositorio.Aparelhos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.gerenciamento.Modelo.Aparelhos.AparelhosEletricosModelo;

@Repository
public interface AparelhosEletricosRepositorio extends CrudRepository<AparelhosEletricosModelo,Long>{
    AparelhosEletricosModelo findBycodAparelho(int codAparelho);
}
