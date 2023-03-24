package evaluacion_2;

/**
 * @author Julio
 * @version 24/3/2023A
 * @since 24/03/2023
 * @see <a href="https://documentoEj.com>Link</a>
 * 
 */
public class TablaEnteros {

	private int[] tabla;

	TablaEnteros(int[] tabla) {
		if (tabla == null || tabla.length == 0)
			throw new IllegalArgumentException("No hay elementos");
		this.tabla = tabla;
	}

	/**
	 * @author Julio
	 * @since 24/3/2023
	 * @return suma- varaible int que contiene la suma de todos los valores del
	 *         array
	 */
	// devuelve la suma de los elementos de la tabla
	public int sumaTabla() {
		int suma = 0;
		for (int i = 0; i < tabla.length; i++)
			suma += tabla[i];
		return suma;
	}
/**
 * @author Julio
 * @since 24/03/2023
 * @return max- Devuelve el valor máximo de la tabla
 */
	// devuelve el mayor elemento de la tabla
	public int mayorTabla() {
		int max = -999;
		for (int i = 0; i < tabla.length; i++)
			if (tabla[i] > max)
				max = tabla[i];
		return max;
	}
/**
 * @author Julio
 * @param n- int que contiene un aposicion de la tabla
 * @return i- la posicion de la tabla
 */
	// devuelve la posición de un elemento cuyo valor se pasa
	public int posicionTabla(int n) {
		for (int i = 0; i < tabla.length; i++)
			if (tabla[i] == n)
				return i;
		throw new java.util.NoSuchElementException("No existe: " + n);
	}
}//
