package com.devsuperior.dscommerce.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity 
@Table(name="tb_atividade")
public class Atividade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String nome;
	private String descricao;
	private Double preco;
	
	
	// colecao de atividades, relacionamento muito par muitos.
	// criar tabela de associacao, que tera chave composta 
	// com os dois IDs, das tabelas associadas de modo que a
	// combinação destes numca se repitam.
	@ManyToMany
	@JoinTable(name = "tb_atividade_participante",
	joinColumns = @JoinColumn(name="atividade_id"),
	inverseJoinColumns = @JoinColumn(name="participante_id"))
	private Set<Participante> participantes = new HashSet<> ();
			
	
	// relacionamento muito para muitos com tabela categoria.
	// um categoria, pode ter N atividades, motivo de gerar um lista de 
	// atividades por categoria
	@OneToMany (mappedBy= "atividade")
	 private List<Bloco> blocos = new ArrayList<>();
	   
		
	
	
		
	public Atividade() {
	}
	
 	
 

	
	public Atividade(Integer id, String nome, String descricao, Double preco, Set<Participante> participantes,
			List<Bloco> blocos, Categoria categoria) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.participantes = participantes;
		this.blocos = blocos;
		this.categoria = categoria;
	}





	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Set<Participante> getParticipantes() {
		return participantes;
	}

	 
	 

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	// relacionamento muito para um.
	// posso ter varias atividades para uma mesca categoria.
	 @ManyToOne
	 @JoinColumn(name = "categoria_id")
	 private Categoria categoria;

	 
	 	
	
	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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
		Atividade other = (Atividade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

	
	
	
	 	
 
	
	
	
	
	
}
