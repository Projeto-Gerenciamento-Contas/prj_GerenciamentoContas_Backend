package br.com.api.gerenciamento.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.gerenciamento.Modelo.RespostaModelo;
import br.com.api.gerenciamento.Modelo.UsuarioModelo;
import br.com.api.gerenciamento.Repositorio.UsuarioRepositorio;

@Service
public class UsuarioServico {

    @Autowired
    private UsuarioRepositorio ur;

    // listar todos os usuarios
    public Iterable<UsuarioModelo> listar() {
        return ur.findAll();
    }

    @Autowired
    private RespostaModelo rm;

    // metodo para cadastrar usuario
    public ResponseEntity<?> cadastrar(UsuarioModelo um) {
        if (um.getNome().equals("")) {
            rm.setMensagem("O nome completo é obrigatorio");
            return new ResponseEntity<>(rm, HttpStatus.BAD_REQUEST);
        } else if (um.getDataNasc() == null) {
            rm.setMensagem("A data de nascimento é obrigatoria");
            return new ResponseEntity<>(rm, HttpStatus.BAD_REQUEST);
        } else if (um.getEmail().equals("")) {
            rm.setMensagem("O email é obrigatorio");
            return new ResponseEntity<>(rm, HttpStatus.BAD_REQUEST);
        } else if (um.getSenha().equals("")) {
            rm.setMensagem("A senha é obrigatoria");
            return new ResponseEntity<>(rm, HttpStatus.BAD_REQUEST);
        } else if (um.getMsmSenha().equals("")) {
            rm.setMensagem("A confirmação de senha é obrigatoria");
            return new ResponseEntity<>(rm, HttpStatus.BAD_REQUEST);
        } 
        else {
            return new ResponseEntity<UsuarioModelo>(ur.save(um), HttpStatus.CREATED);
        }

    }
    // caso as senhas não correspondem
    
    // esconde a senha durante a listagem
    /*public String hideSenha() {
		um.getSenha();
		int h = getSenha().length();
		String hSenha = "";
		for(int i=0; i<h;i++) {
			hSenha+="*";
		}
		return hSenha;
		
	}*/

}
