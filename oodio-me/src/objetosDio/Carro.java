package objetosDio;

public class Carro extends Veiculo{

	String cor;
	String modelo;
	int capTanque;

	public Carro() {

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapTanque() {
		return capTanque;
	}

	public void setCapTanque(int capTanque) {
		this.capTanque = capTanque;
	}

	double valorTotalTanque(double valordocombust√≠vel) {
		return valordocombust√≠vel * capTanque;
	}
}
