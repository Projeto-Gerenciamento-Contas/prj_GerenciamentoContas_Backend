package br.com.api.gerenciamento.Service;

import org.springframework.http.ResponseEntity;

import br.com.api.gerenciamento.Modelo.UsuarioModelo;

public interface IUsuarioServico {
    
    
    public default ResponseEntity<?> cadastrar(UsuarioModelo um){//dados não nulos
        return null;
    }
    public default void hideSenha(){}//esconde as senhas cadastradas
    public default String correspondeSenhas(){//ambas as senhas correspondem
        return null;
    }
    public default ResponseEntity<?> jaCadastrado(UsuarioModelo um) {//usuario já cadastrado
        return null;}

}
