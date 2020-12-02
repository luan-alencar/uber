package david.augusto.luan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import david.augusto.luan.entidades.UberBlack;
import david.augusto.luan.entidades.UberPool;
import david.augusto.luan.entidades.UberSistema;
import david.augusto.luan.entidades.UberX;

public class CorridaTest {

	@Autowired
	private UberSistema uberSistema;
	
	@BeforeEach
	void setUp() {
		uberSistema.adicionarCorrida(new UberX(5));
		uberSistema.adicionarCorrida(new UberBlack(10));
		uberSistema.adicionarCorrida(new UberPool(20, 3));
		uberSistema.adicionarCorrida(new UberPool(20, 3));
	}
//	@Autowired
//	private UberX uberX;

	@Test
	void adicionarCorridaTest() {
		assertEquals(uberSistema.getCorridas(), 4);
	}
	
}
