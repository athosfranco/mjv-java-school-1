package com.mjv.projetofinal.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="cliente")
public class Cliente {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String cpf;  
	private String nome;
	private String telefone;
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
}
