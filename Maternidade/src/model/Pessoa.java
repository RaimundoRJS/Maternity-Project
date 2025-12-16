package model;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public abstract class Pessoa {
	private String cpf;
	private String nome;
	protected Date dNascimento;
	private int iDpessoa;
	
	
	

	// Getters and Setters
	
	
	
	public Pessoa(String cpf, String nome, Date dNascimento, int iDpessoa) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.dNascimento = dNascimento;
		this.iDpessoa = iDpessoa;
	}


	public Date getdNascimento() {
		return dNascimento;
	}


	public void setdNascimento(Date dNascimento) {
		this.dNascimento = dNascimento;
	}


	public int getiDpessoa() {
		return iDpessoa;
	}


	public void setiDpessoa(int iDpessoa) {
		this.iDpessoa = iDpessoa;
	}


	public String getCpf() {
		return cpf;
	}
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Date getDNascimento() {
		return dNascimento;
	}

	public void setDNascimento(Date dataNascimento) {
		this.dNascimento = dataNascimento;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (!(obj instanceof Pessoa)) {
	        return false;
	    }

	    Pessoa pessoa = (Pessoa) obj;
	    return Objects.equals(this.getiDpessoa(), pessoa.getiDpessoa());
	}

	
	// Métodos
	public String getFormataData() {
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		return data.format(getDNascimento());
	}

}
