package br.com.api.gerenciamento.Modelo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class UsuarioModelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long codigo;
	private String nome;
	private String email;
	private Date dataNasc;
	private String senha;
	private String msmSenha;

	public String hideSenha() {
		getSenha();
		int h = getSenha().length();
		String hSenha = "";
		for(int i=0; i<h;i++) {
			hSenha+="*";
		}
		return hSenha;
		
	}


}