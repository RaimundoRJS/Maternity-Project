package controller;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

import model.*;
import view.*;

public class IncluirMedico {
	public static Scanner opa = new Scanner(System.in);
	public int CadastrarMedico(Collection<Pessoa> pessoas, int altoIncremente) {
		
		int iDpessoa = altoIncremente + 1;
		
		System.out.println("Digite o Cpf: ");
		String cpf = opa.nextLine();
		obterPessoa(pessoas, cpf);
		if (obterPessoa(pessoas, cpf) == true ) {
			System.out.println("Pessoa Já Cadastrada!");
			return iDpessoa;
		}
		System.out.println("Digite o Nome: ");
		String nome = opa.nextLine();
		System.out.println("Digite a Data de Nascimento (dd/MM/yyyy): ");
		Date dataNascimento = entradaData(opa.nextLine());
		System.out.println("Digite o Crm do Medico: ");
		String crm = opa.nextLine();
		if (ObterMedico(pessoas, crm) == true ) {
			System.out.println("Medico Já Cadastrado!");
			return iDpessoa;
		}
		System.out.println("Digite o Endereco: ");
		String endereco = opa.nextLine();
		System.out.println("Digite o Telefone Celular: ");
		String phone = opa.nextLine();
		Medico medico = new Medico(cpf, nome, dataNascimento, iDpessoa, crm, endereco, phone );
		pessoas.add(medico);
		System.out.println("Medico Cadastrado Com Sucesso!");
		return iDpessoa;
	}
	public static Date entradaData(String dataTexto) {
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return data.parse(dataTexto);
		} catch (Exception e) {
			System.out.println("Dados Invalidos!");
			return null;
		}
	}
	
	public static boolean ObterMedico(Collection<Pessoa> pessoas,String crm) {
		boolean igual = false;
		for(Pessoa pessoa : pessoas) {
			if (((Medico) pessoa).getCrm().equals(crm)){
				igual = true;
			}
		}
		return igual;
	}
	
	public static boolean obterPessoa(Collection<Pessoa> pessoas,String cpf) {
		boolean igual = false;
		for(Pessoa pessoa : pessoas) {
			if (cpf.equals(pessoa.getCpf())){
				igual = true;
			}
		}
		return igual;
	}
	
}
