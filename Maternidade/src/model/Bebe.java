package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;




public class Bebe extends Pessoa{
	private Maess mae;
	private Medico medico;
	private Collection<Medicacao> medicacoes = new ArrayList<Medicacao>();
	

	public Bebe(String cpf, String nome, Date dNascimento, int iDpessoa, Maess mae, Medico medico) {
		super(cpf, nome, dNascimento, iDpessoa);
		this.mae = mae;
		this.medico = medico;
	}
	
	
	public Bebe(String cpf, String nome, Date dNascimento, int iDpessoa, Maess mae, Medico medico,
			Collection<Medicacao> medicacoes) {
		super(cpf, nome, dNascimento, iDpessoa);
		this.mae = mae;
		this.medico = medico;
		this.medicacoes = medicacoes;
	}


	public Maess getMae() {
		return mae;
	}
	public void setMae(Maess mae) {
		this.mae = mae;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Collection<Medicacao> getMedicacoes() {
		return medicacoes;
	}
	public void setMedicacoes(Collection<Medicacao> medicacoes) {
		this.medicacoes = medicacoes;
	}
	
	
}
