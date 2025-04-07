package com.devsuperior.dscommerce.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity 
@Table(name="tb_bloco")
public class Bloco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	
	
	private Date inicio;
	private Date fim;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getFim() {
		return fim;
	}
	public void setFim(Date fim) {
		this.fim = fim;
	}
	
	
	
	@ManyToOne
	@JoinColumn ( name = "Atividade_id")
	private Atividade  atividade;
	
	
	
	
	
	public Bloco() {
		
	}
	
	public Bloco(Integer id, Date inicio, Date fim) {
		super();
		this.id = id;
		this.inicio = inicio;
		this.fim = fim;
	}
	
	
	
	
   
	}
