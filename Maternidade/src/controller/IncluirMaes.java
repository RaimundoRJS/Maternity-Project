package controller;

import model.*;
import view.*;
import controller.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class IncluirMaes extends MainController {
	public static Scanner opa = new Scanner(System.in);
	public int cadastrarMaes(Collection<Pessoa> pessoas, int altoIncremente){
		
		int iDpessoa = altoIncremente + 1;
		
		System.out.println("Por favor, digite seu CPF");
		String cpf = opa.next();
		
		System.out.println("Por favor, digite seu Primeiro nome");
		String nome = opa.next();
		
		System.out.println("Por favor, digite seu sobrenome");
		String sobrenome = opa.next();
		
		System.out.println("Por favor, digite sua data de nascimento");
		Date dNascimento = entradaData(opa.nextLine());
		
		System.out.println("Por favor, digite seu Endereço");
		String endereco = opa.next();
		
		System.out.println("Por favor, digite seu telefone");
		String phone = opa.next();
		
		Maess mae = new Maess(cpf, nome, dNascimento, iDpessoa, sobrenome, endereco, phone);
		pessoas.add(mae);
		
		System.out.println("Mãe cadastrada com sucesso!!!");
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

}



