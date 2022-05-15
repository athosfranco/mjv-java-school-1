package com.mjv.projetofinal.model.locacao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

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
	
	@JoinColumn(name="cliente_id")
	private Integer clienteId;
	
	@Column (name="valor_final")
	private Double valorFinal;
	
	@Column (name="data_retirada")
	private LocalDateTime dataRetirada;
	
	@Column (name="data_devolucao")
	private LocalDateTime dataDevolucao;

	@OneToMany(cascade = CascadeType.ALL)
	private List<LocacaoItem> itens;


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
		Locacao other = (Locacao) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
