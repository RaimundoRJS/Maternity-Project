package controller;

import java.util.ArrayList;
import java.util.Collection;

import model.*;
import controller.*;

public class MainController{
	public static Collection<Pessoa> pessoas = new ArrayList<Pessoa>();
	private static Collection<Medicamento> medicamentos = new ArrayList<Medicamento>();
	
		public boolean verify = true;
		protected static int altoIncremente = 0;
		public boolean Choices(int i) {
			switch(i) {
			case 1:
				incluirMedicamento();
				break;
			case 2:
				incluirMaes();
				break;
			case 3:
				incluirMedico();
				break;
			case 4:
				incluirBebe();
				break;
			case 5:
				listarMedicamentosCadastrados();
				break;
			case 6:
				listarPessoasCadastrados();
				break;
			case 9:
				verify = false;
			default:
				System.out.println("Digite uma opção válida!");
				break;
			}
			return verify;
		}
		
		public void incluirMedicamento() {
			IncluirMedicamento cadMedicamentos = new IncluirMedicamento();
			altoIncremente = cadMedicamentos.CadastrarMedicamento(medicamentos,altoIncremente);
		}
		
		public void incluirMaes() {
			IncluirMaes newMae = new IncluirMaes();
			altoIncremente = newMae.cadastrarMaes(pessoas, altoIncremente);
		}
		
		public void incluirMedico() {
			IncluirMedico newMedico = new IncluirMedico();
			altoIncremente = newMedico.CadastrarMedico(pessoas, altoIncremente);
		}
		
		public void incluirBebe() {
			IncluirBebes newBebe = new IncluirBebes();
			altoIncremente = newBebe.CadastrarBebes(pessoas, altoIncremente);
		}
		
		public void listarMedicamentosCadastrados() {
			ListarMedicamentosCadastrados listaDeMedicamentos = new ListarMedicamentosCadastrados();
			listaDeMedicamentos.ListaDeMedicamentos(medicamentos);
		}
		
		public void listarPessoasCadastrados() {
			ListarPessoasCadatradas listaDePessoas = new ListarPessoasCadatradas();
			listaDePessoas.ListaDePessoas(pessoas);
		}
	

}
