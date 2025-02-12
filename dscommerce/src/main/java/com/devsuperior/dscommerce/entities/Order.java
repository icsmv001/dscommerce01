package com.devsuperior.dscommerce.entities;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity 
@Table(name="tb_order")

public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	
	 //configurar para que seja salvo no banco de dados no padrao UTC-GMT usar notação abaixo
	@Column (columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	 private Instant  moment;
	
	 private OrderStatus status;
	 
	 @ManyToOne
	 @JoinColumn(name ="client_id")
	 private User client;

	 public Order() {
		 
	 }
		
	 
	 public Order(Integer id, Instant moment, OrderStatus status, User client) {
		this.id = id;
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	
	 
	 
	 
	 
	 
	}
