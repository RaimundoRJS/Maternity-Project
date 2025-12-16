package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Medicacao {
	public int quantidade;
	public Medicamento medicamento;
	public Date data;
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Medicamento getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getFormataData() {
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		return data.format(getData());
	}
	
	public String getHora() {
		SimpleDateFormat data = new SimpleDateFormat("HH:mm:ss");
		return data.format(getData());
	}

	
	
}
