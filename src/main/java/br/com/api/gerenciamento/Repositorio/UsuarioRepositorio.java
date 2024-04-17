package br.com.api.gerenciamento.Repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import br.com.api.gerenciamento.Modelo.UsuarioModelo;

@Repository
public interface UsuarioRepositorio extends CrudRepository<UsuarioModelo, Long> {
	//listar todos os usuarios
	List<UsuarioModelo> findAll();
	
	//pesquisar por codigo
	UsuarioModelo findByCodigo(int codigo);
	
	//remover usuario
	
	void delete(UsuarioModelo usuario);
	
	//Cadastrar/alterar usuario
	<UsMod extends UsuarioModelo> UsMod save(UsMod usuario);     
	
}