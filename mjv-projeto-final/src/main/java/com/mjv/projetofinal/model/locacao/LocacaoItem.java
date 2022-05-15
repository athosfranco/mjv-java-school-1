package com.mjv.projetofinal.model.locacao;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="locacao_item")
public class LocacaoItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (name="qtd_dias_locacao")
	private Integer qtdDiasLocacao;
	 
	private Double subtotal;
	
	@Column (name="equipamento_id")
	private Integer equipamentoId;
	
	@ManyToOne
	@JoinColumn(name="locacao_id")
	private Locacao locacaoId;
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocacaoItem other = (LocacaoItem) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
