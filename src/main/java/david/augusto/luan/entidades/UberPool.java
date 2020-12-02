package david.augusto.luan.entidades;

import lombok.Getter;

public class UberPool extends UberX {

	@Getter
	private int numPessoas;

	public UberPool(double km, int numPessoas) {
		super(km);
		this.numPessoas = numPessoas;
		// TODO Auto-generated constructor stub
	}

	public UberPool() {
		super();
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return super.getValor() / getNumPessoas();
	}

}
