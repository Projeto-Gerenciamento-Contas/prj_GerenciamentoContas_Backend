package br.com.api.gerenciamento.Repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.gerenciamento.Modelo.EnderecoModelo;

@Repository
public interface EnderecoRepositorio extends CrudRepository<EnderecoModelo, Long>{
    //pesquisar por cpf
	EnderecoModelo findByCep(int cpf);
	EnderecoModelo findByCodigoEndereco(int codigoEndereco);
    
}
