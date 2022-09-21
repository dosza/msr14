package com.algarworks.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.algarworks.streams.model.Produto;
import com.algarworks.streams.model.Produto.Status;

public class ExemploFilterForEach {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Água 2L", Status.ATIVO, new BigDecimal(9.9)));
		produtos.add(new Produto("Picanha 1kg", Status.ATIVO, new BigDecimal(109.5)));
		produtos.add(new Produto("Carvão", Status.INATIVO, new BigDecimal(34.2)));
		produtos.add(new Produto("Cerveja", Status.INATIVO, new BigDecimal(8.4)));
		produtos.add(new Produto("Cupim 2kg", Status.ATIVO, new BigDecimal(92)));
		
		/*for (Produto produto : produtos ) {
			if ( produto.getNome().startsWith("C")) {
				produto.inativar();
			}
		}*/
		
		produtos.stream()
			.filter(p -> p.getNome().startsWith("C"))
			.forEach(Produto::inativar);
		
	}
}
