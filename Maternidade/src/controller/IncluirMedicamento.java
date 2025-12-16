package controller;

import java.util.Collection;
import java.util.Scanner;

import model.*;

public class IncluirMedicamento {
	public static Scanner opa = new Scanner(System.in);
	public int CadastrarMedicamento(Collection<Medicamento> medicamentos, int altoIncremente) {
		int iDmedicamento = altoIncremente + 1;
		System.out.println("Digite a Descrição: ");
		String descricao = opa.nextLine();
		System.out.println("Digite a Quantidade de Estoque: ");
		int qtEstoque = opa.nextInt();
		System.out.println("Digite a unidade de Medida: ");
		String unidadeMedida = opa.nextLine();
		Medicamento medicamento = new Medicamento(descricao, qtEstoque, unidadeMedida, iDmedicamento);
		medicamentos.add(medicamento);
		System.out.println("Medicamento Cadastrado Com Sucesso!");
		return iDmedicamento;
	}

}
