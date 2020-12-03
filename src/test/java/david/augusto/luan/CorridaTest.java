package david.augusto.luan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import david.augusto.luan.entidades.UberBlack;
import david.augusto.luan.entidades.UberPool;
import david.augusto.luan.entidades.UberSistema;
import david.augusto.luan.entidades.UberX;

@RunWith(SpringRunner.class)
public class CorridaTest {

	UberSistema uberSistema = new UberSistema();;

	@Before
	void setUp() {
		this.uberSistema.adicionarCorrida(new UberX(5));
		this.uberSistema.adicionarCorrida(new UberBlack(10));
		this.uberSistema.adicionarCorrida(new UberPool(20, 3));
		this.uberSistema.adicionarCorrida(new UberPool(20, 3));
	}
//	@Autowired
//	private UberX uberX;

	@Test
	void adicionarCorridaTest() {
		assertEquals(4, uberSistema.getCorridas().size());
	}

}
