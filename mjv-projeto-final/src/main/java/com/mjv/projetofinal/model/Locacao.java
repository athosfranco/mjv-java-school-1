package com.mjv.projetofinal.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="locacao")
public class Locacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToMany
	@JoinColumn(name="locacao_item_id")
	private List<LocacaoItem> itens;
	
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	@Column (name="valor_final",columnDefinition="decimal(6,2) default 0")
	private Integer valorFinal;
	
	@Column (name="data_retirada")
	private LocalDateTime dataRetirada;
	
	@Column (name="data_devolucao")
	private LocalDateTime dataDevolucao;
	

}
