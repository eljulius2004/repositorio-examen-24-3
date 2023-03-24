package evaluacion_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TablaEnterosTest {
	private TablaEnteros tabla;
	int[] tablaAux;

	@BeforeEach

	void crearArrayTabla() {

		for (int i = 0; i < tablaAux.length; i++) {
			tablaAux[i] = i + 1;
		}
		tabla = new TablaEnteros(tablaAux);
	}

	@Test
	void testSumaTabla() {
		int resEsp = 6;
		int res;
		res = tabla.sumaTabla();
		assertEquals(6, res, 0);
	}

}
