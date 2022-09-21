package com.algarworks.listas;

import java.util.ArrayList;
import java.util.List;
public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Cliente> clientes = new ArrayList<>();
		clientes.add( new Cliente(1L, "José"));
		clientes.add(new Cliente(2L, "Maria"));
		clientes.add(new Cliente(3L, "João"));
		
		clientes.forEach(cliente -> System.out.printf("ID: %d , Nome: %s%n", 
				cliente.getId(), 
				cliente.getNome()));

	}

}
