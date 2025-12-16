package model;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


public class Maess extends Pessoa{
	public String sobrenome;
	public String endereco;
	public String phone;
	private Collection<Bebe> bebes = new ArrayList<Bebe>();
	
	
	//Constructor
	public Maess(String cpf, String nome, Date dNascimento, int iDpessoa, String sobrenome, String endereco,
			String phone, Collection<Bebe> bebes) {
		super(cpf, nome, dNascimento, iDpessoa);
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.phone = phone;
		this.bebes = bebes;
	}
	public Maess(String cpf, String nome, Date dNascimento, int iDpessoa, String sobrenome, String endereco,
			String phone) {
		super(cpf, nome, dNascimento, iDpessoa);
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.phone = phone;
	}
	// Getters and Setters
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
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
