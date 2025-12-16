package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Medico extends Pessoa {
	public String crm;
	public String endereco;
	public String phone;
	private Collection<Bebe> bebes = new ArrayList<Bebe>();
	
	
	// Constructor

	
	public Medico(String cpf, String nome, Date dNascimento, int iDpessoa, String crm, String endereco, String phone) {
		super(cpf, nome, dNascimento, iDpessoa);
		this.crm = crm;
		this.endereco = endereco;
		this.phone = phone;
	}
	
	public Medico(String cpf, String nome, Date dNascimento, int iDpessoa, String crm, String endereco, String phone,
			Collection<Bebe> bebes) {
		super(cpf, nome, dNascimento, iDpessoa);
		this.crm = crm;
		this.endereco = endereco;
		this.phone = phone;
		this.bebes = bebes;
	}

	// Getters and Setters
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Collection<Bebe> getBebes() {
		return bebes;
	}
	public void setBebes(Collection<Bebe> bebes) {
		this.bebes = bebes;
	}
	




	
}
