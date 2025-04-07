package com.devsuperior.dscommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// se deixar o comando abaixo apenas, ao ir no endereço:http://localhost:8080/login?error, entra na tela de login padrao do security do spring boot 
//@SpringBootApplication

// se deixar como abaixo entre parentes, desativa o login padrao e senha.
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })


//@ComponentScan({"com.devsuperior"})


public class DscommerceApplication  implements CommandLineRunner {
	
	
	
	public static void main(String[] args){
    	SpringApplication.run(DscommerceApplication.class, args); 
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println("------------------------------------");
		System.out.println("Projeto DSCommerce - ICSMV001.");
		System.out.println("------------------------------------");	
		System.out.println("Desafio Modelo de dominio e ORM");
		System.out.println("------------------------------------");	
		
		
		
		// ** fim bloco - DESAFIO Componentes e injecao de dependencias (icsmv001 - izael.)		
			
	}
		
}


