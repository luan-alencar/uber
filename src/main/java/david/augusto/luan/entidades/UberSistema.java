package david.augusto.luan.entidades;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class UberSistema {

	private List<Corrida> corridas;

	public UberSistema() {
		this.corridas = new ArrayList<Corrida>();
	}

	public void adicionarCorrida(Corrida c) {
		corridas.add(c);
	}

	public double getValorCorridas() {
		double valorTotal = 0;
		for (Corrida c : corridas) {
			valorTotal += c.getValor();
		}
		return valorTotal;
	}
}
