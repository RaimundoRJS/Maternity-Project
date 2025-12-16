package controller;

import java.util.Collection;

import model.Pessoa;

public class ListarPessoasCadatradas {

	public void ListaDePessoas(Collection<Pessoa> pessoas) {
		if(pessoas.isEmpty()) {
			System.out.println("Nenhuma Pessoa Cadastrada!");
		}else {
			System.out.println("== Listando Pessoas ==");
			for (Pessoa pessoa : pessoas) {
				System.out.println(pessoa);
			}
		}

		
	}

}
