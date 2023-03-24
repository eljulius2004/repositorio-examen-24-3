package evaluacion_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
		assertEquals(resEsp, res, 0);
	}

	@ParameterizedTest
	@CsvSource({"2","9"})
	@Test
	void testPosicionTabla() {
		int resEsp = 1;
		int n = 1;
		assertEquals(resEsp,tabla.posicionTabla(n));
	}
	
}
