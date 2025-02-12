package com.devsuperior.dscommerce.services;

import org.springframework.stereotype.Service;

import com.devsuperior.dscommerce.entities.Order;

@Service
public class ShippingService {
	
	// public double shipment(double amount) {
	// return amount * 0.2 ; 
	// }
	
		public double shipment(double amount) {
	        if (amount < 100.00)
	        {
	        	amount = 20.00;
	        	//System.out.println("executou-condicao 01");
	        }
	        else if (amount >= 100.00 && amount < 200.00)
	        {
	        	amount = 12.00;
	        	//System.out.println("executou-condicao 02");
	        }
	        else {
	        	amount = 0.00;
	        	//System.out.println("executou-condicao 03");
	        }
	        return amount;
	    }

		
		
			
			
	
}
