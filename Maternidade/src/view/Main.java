package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import model.*;
import controller.*;

public class Main {
	
	public static void main(String[] args) {
		MainController controle = new MainController();
		try (Scanner inicio = new Scanner(System.in)){
			do {
				menu();
				if (inicio.hasNextInt()) {
					int choice = inicio.nextInt();
						if (!controle.Choices(choice))
							break;
				}else {
					System.err.println("Digite uma opção válida");
					inicio.next();
				}
			}while(true);
			
		}catch(Exception e) {
			System.err.println("Error" + e);
		}
		System.out.println("\nSaindo do programa. Obrigado!");
	}
	public static void menu() {
		
		System.out.println("Olá, seja bem vindo! Em que posso ajudar?/n"
				+ "1 - Incluir um Medicamento/n"
				+ "2 - Cadastrar mãe/n"
				+ "3 - Cadastrar médico/n"
				+ "4 - Cadastrar bebê/n"
				+ "5 - Listar meicamentos Cadastrados/n"
				+ "6 - Listar Pessoas/n"
				+ "9 - Sair");
	}

}
