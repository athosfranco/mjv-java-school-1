package com.mjv.projetofinal.model.locacao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	
	@Column (name="data_retirada")
	private LocalDateTime dataRetirada;
	
	@Column (name="data_devolucao")
	private LocalDateTime dataDevolucao;
	
	@JoinColumn(name="cliente_id")
	private Integer clienteId;
	
	@Column (name="valor_final")
	private Double valorFinal;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "pedido_id")
	private List<LocacaoItem> itens;
}
