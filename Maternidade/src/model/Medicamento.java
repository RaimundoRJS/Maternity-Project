package model;

public class Medicamento {
	public String prescricao;
	public int qtEstoque;
	public String uniMedida;
	private int iDmedicamento;
	
	
	
	

	public Medicamento(String prescricao, int qtEstoque, String uniMedida, int iDmedicamento) {
		super();
		setPrescricao(prescricao);
		setQtEstoque(qtEstoque);
		setUniMedida(uniMedida);
		setiDmedicamento(iDmedicamento);
	}

	public int getiDmedicamento() {
		return iDmedicamento;
	}

	public void setiDmedicamento(int iDmedicamento) {
		this.iDmedicamento = iDmedicamento;
	}

	public String getPrescricao() {
		return prescricao;
	}

	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}

	public int getQtEstoque() {
		return qtEstoque;
	}
	public void setQtEstoque(int qtEstoque) {
		this.qtEstoque = qtEstoque;
	}
	public String getUniMedida() {
		return uniMedida;
	}
	public void setUniMedida(String uniMedida) {
		this.uniMedida = uniMedida;
	}
	
	
}
