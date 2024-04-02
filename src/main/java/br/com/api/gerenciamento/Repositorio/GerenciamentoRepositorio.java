package br.com.api.gerenciamento.Repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import br.com.api.gerenciamento.Modelo.UsuarioModelo;

@Repository
public interface GerenciamentoRepositorio extends CrudRepository<UsuarioModelo, Long> {
	//listar todos os produtos
	List<UsuarioModelo> findAll();
	
	//pesquisar por codigo
	UsuarioModelo findByCodigo(int codigo);
	
	//remover produto
	
	void delete(UsuarioModelo produto);
	
	//Cadastrar/alterar produto
	<ProdMod extends UsuarioModelo> ProdMod save(ProdMod produto);     
	
}