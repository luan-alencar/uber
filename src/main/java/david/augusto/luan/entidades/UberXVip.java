package david.augusto.luan.entidades;

public class UberXVip extends UberX {

	public UberXVip(double km) {
		super(km);
	}

	public UberXVip() {
		super();
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return 0.9 * super.getValor();
	}

}
