package david.augusto.luan.entidades;

public class UberBlack extends UberX {

	public UberBlack(double km) {
		super(km);
	}

	public UberBlack() {
		super();
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return 1.1 * super.getValor();
	}

}
