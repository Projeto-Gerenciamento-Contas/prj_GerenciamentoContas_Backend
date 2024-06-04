package br.com.api.gerenciamento.Repositorio
;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.gerenciamento.Modelo.ComprasModelo;



@Repository
public interface ComprasRepositorio extends CrudRepository<ComprasModelo, Long> {
    ComprasModelo findByCodCompras(Long codCompras);
}
