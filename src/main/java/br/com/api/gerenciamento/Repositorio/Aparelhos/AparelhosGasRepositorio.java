package br.com.api.gerenciamento.Repositorio.Aparelhos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.gerenciamento.Modelo.Aparelhos.AparelhosGasModelo;

@Repository
public interface AparelhosGasRepositorio extends CrudRepository<AparelhosGasModelo, Long>{
      AparelhosGasModelo findBycodAparelhoGas(int codAparelhoGas);
}
