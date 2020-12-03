package david.augusto.luan.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Corrida {

	private double km;
	private double precoBase;
	private double precoKm;

	public abstract double getValor();
}
