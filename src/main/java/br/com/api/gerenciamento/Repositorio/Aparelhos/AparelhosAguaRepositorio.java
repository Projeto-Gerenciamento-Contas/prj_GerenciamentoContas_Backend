package br.com.api.gerenciamento.Repositorio.Aparelhos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.gerenciamento.Modelo.Aparelhos.AparelhosAguaModelo;

@Repository
public interface AparelhosAguaRepositorio extends CrudRepository<AparelhosAguaModelo, Long> {
    AparelhosAguaModelo findBycodAparelhoAgua(int codAparelhoAgua);
}
