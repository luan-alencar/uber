package david.augusto.luan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import david.augusto.luan.entidades.UberBlack;
import david.augusto.luan.entidades.UberPool;
import david.augusto.luan.entidades.UberSistema;
import david.augusto.luan.entidades.UberVip;
import david.augusto.luan.entidades.UberX;

public class CorridaTest {

	UberSistema uberSistema = new UberSistema();;

//	@Autowired
//	private UberX uberX;

	@Test
	void adicionarCorridaTest() {
		this.uberSistema.adicionarCorrida(new UberX(5));
		this.uberSistema.adicionarCorrida(new UberBlack(10));
		this.uberSistema.adicionarCorrida(new UberPool(20, 3));
		this.uberSistema.adicionarCorrida(new UberPool(20, 3));
		assertEquals(4, uberSistema.getCorridas().size());
	}
	
	@Test
	void getValorTotalTest() {
		this.uberSistema.adicionarCorrida(new UberX(5));
		this.uberSistema.adicionarCorrida(new UberBlack(8));
		this.uberSistema.adicionarCorrida(new UberVip(3.4));
		assertEquals(32.36, uberSistema.getValorCorridas());
	}

}
