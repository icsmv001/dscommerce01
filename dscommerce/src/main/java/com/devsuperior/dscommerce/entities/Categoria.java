package com.devsuperior.dscommerce.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity 
@Table(name="tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String descricao;
		
	public Categoria() {
	}
	
	public Categoria(Integer id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	
   // relacionamento muito para muitos com tabela categoria.
   // um categoria, pode ter N atividades, motivo de gerar um lista de 
   // atividades por categoria
   @OneToMany (mappedBy= "categoria")
   private List<Atividade> atividades = new ArrayList<>();
   
	
	
	public List<Atividade> getAtividades() {
	return atividades;
}


	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

	
	
	
	 	
 
	
	
	
	
	
}
