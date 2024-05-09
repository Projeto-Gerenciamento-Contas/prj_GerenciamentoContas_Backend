package br.com.api.gerenciamento.Modelo;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
	@Column(name = "cpf", unique = true)
	private Long codigo;
	private String nome;
	private String email;
	private LocalDate dataNasc;
	private String senha;
	private String msmSenha;

	


}