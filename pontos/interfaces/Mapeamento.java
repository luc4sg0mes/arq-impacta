package pontos.interfaces;

import java.util.Map;

public class Mapeamento {

	private Map<Character, Integer[]> mapa;

	public Map<Character, Integer[]> getMapa() {
		return mapa;
	}

	public Mapeamento(Map<Character, Integer[]> mapa) {
		super();
		this.mapa = mapa;
	}


	
}
