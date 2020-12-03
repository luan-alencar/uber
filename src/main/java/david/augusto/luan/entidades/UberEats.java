package david.augusto.luan.entidades;

import lombok.Getter;

@Getter
public class UberEats extends Corrida {

	private double valorRefeicao;
	private double frete;

	public UberEats(double valorRefeicao, double frete) {
		this.valorRefeicao = valorRefeicao;
		this.frete = frete;
	}

	public UberEats() {
	}

	@Override
	public double getValor() {
		return (super.getPrecoBase() * this.getValorRefeicao()) + this.getFrete();
	}

}
