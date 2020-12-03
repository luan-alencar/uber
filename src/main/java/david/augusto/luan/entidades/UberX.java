package david.augusto.luan.entidades;

public class UberX extends Corrida {

	public UberX(double km) {
		super(km, 4, 1.2);
	}

	public UberX() {
		super();
	}

	@Override
	public double getValor() {
		return super.getPrecoBase() + super.getKm() * super.getPrecoKm();
	}

}
