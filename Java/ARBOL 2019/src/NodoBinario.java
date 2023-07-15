package ARBOL;

public class NodoBinario {
	int dat;
	NodoBinario Hizq, Hder;
	public NodoBinario(int elem) {
		dat = elem;
		NodoBinario Hizq, Hder = null;
	}

	public void insertaBinario(int elem) {
		if (elem < dat) {
			if (Hizq == null) { // Caso_Base: Se_crea_el_Hizq_con_elemento
				Hizq = new NodoBinario(elem);
				System.out.println("Hizq: " + Hizq.dat);
			} else { // Caso_rescursivo: Hizq_es_un_subarbol._Llamamos_a_la_funcion_insertar_binario
				Hizq.insertaBinario(elem);
			}
		} else {
			if (Hder == null) { // Caso_Base:_Se_crea_elHder_con_elemento.
				Hder = new NodoBinario(elem);
				System.out.println("Hder: " + Hder.dat);
			} else { // Caso_recursivo:_Hder_es_un_subarbol,_llamamos_recursivamente_a_la_funcion_insertar_binario.
				Hder.insertaBinario(elem);
			}
		}
	}
}
