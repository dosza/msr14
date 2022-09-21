package com.algarworks.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exemplo1 {
	public static void main ( String []args ) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Jose");
		nomes.add("Maria");
		nomes.add("João");
		System.out.println(nomes);
		
		/*for (int i = 0 ; i <  nomes.size();i++) {
			System.out.println("Nome: " + nomes.get(i));
		}
		*/
		/*for (String nome: nomes ) {
			System.out.println("Nome: "+ nome);
		}
		*/
		
		/*nomes.forEach(new Consumer<String>() {
			@Override
			public void accept(String arg0) {
				// TODO Auto-generated method stub
				System.out.println(arg0);
				
			}
		});
		
		//usando lambda expression
		
		nomes.forEach(nome ->System.out.println(nome));
		*/
		//method reference
		
		nomes.forEach(System.out::println);
		
	}
}
