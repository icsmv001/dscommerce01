package com.devsuperior.dscommerce.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


//entidade do sistema dscommerce

@Entity 
@Table(name="tb_participante")

public class Participante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private String email;
	
	
	
	
	// colecao de atividades 
	@ManyToMany(mappedBy = "participantes")
	private Set<Atividade> Atividades = new HashSet<> ();
				
		
	
	
	
	
	
	
	public Participante() {
		
	}
		
		
	public Participante(Integer id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setAtividades(Set<Atividade> atividades) {
		Atividades = atividades;
	}


	 

	 
	
	
	
	
	
	

	
	 
}
