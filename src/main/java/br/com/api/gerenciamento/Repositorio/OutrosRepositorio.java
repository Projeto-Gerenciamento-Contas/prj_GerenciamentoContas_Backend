package br.com.api.gerenciamento.Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.gerenciamento.Modelo.OutrosModelo;



@Repository
public interface OutrosRepositorio extends CrudRepository<OutrosModelo, Long> {
    OutrosModelo findByCodOutros(Long codOutros);
}
