package controller;

import model.*;

import java.util.Collection;

import controller.*;

public class ListarMedicamentosCadastrados {
	public void ListaDeMedicamentos(Collection<Medicamento> medicamentos) {
		if(medicamentos.isEmpty()) {
			System.out.println("Nenhum Medicamento Cadastrado!");
		}else {
			System.out.println("== Listando Medicamntos ==");
			for (Medicamento medicamento : medicamentos) {
				System.out.println(medicamento);
			}
		}

	}

}
