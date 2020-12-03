package david.augusto.luan.entidades;

public class UberVip extends UberX {

	public UberVip(double km) {
		super(km);
	}

	public UberVip() {
		super();
	}

	@Override
	public double getValor() {
		return this.getPrecoBase() + this.getKm();
	}

}
