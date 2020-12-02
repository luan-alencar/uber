package david.augusto.luan.entidades;

import lombok.Getter;

public class UberPool extends Corrida {

	@Getter
	private int numPessoas;

	public UberPool(double km, double precoBase, double precoKm, int numPessoas) {
		super(km, precoBase, precoKm);
		this.numPessoas = numPessoas;
		// TODO Auto-generated constructor stub
	}

	public UberPool() {
		super();
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return super.getValor();
	}

}
