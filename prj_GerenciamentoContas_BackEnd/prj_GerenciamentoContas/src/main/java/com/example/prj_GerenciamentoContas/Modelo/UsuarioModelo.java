package com.example.prj_GerenciamentoContas.Modelo;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="Usuario")
@Getter
@Setter
public class UsuarioModelo {
	//dados
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@Autowired
	private int cpf;
	private long nome;
	private String email;
	private String senha;
	
	

}
