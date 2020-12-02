package david.augusto.luan;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;

import david.augusto.luan.entidades.UberSistema;
import david.augusto.luan.entidades.UberX;

public class CorridaTest {

	@Autowired
	private UberSistema uberSistema;
	

	@BeforeEach
	void setUp() {
		uberSistema.adicionarCorrida(new UberX(5));
	}
	
}
