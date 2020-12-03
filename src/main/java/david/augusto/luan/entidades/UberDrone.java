package david.augusto.luan.entidades;

import lombok.Getter;

@Getter
public class UberDrone extends Corrida {

	private double valorCompra;
	private double frete;

	public UberDrone(double valorCompra, double frete) {
		this.valorCompra = valorCompra;
		this.frete = frete;
	}

	public UberDrone() {

	}

	@Override
	public double getValor() {
		return (super.getPrecoBase() * this.getValorCompra()) + this.getFrete();
	}

}
