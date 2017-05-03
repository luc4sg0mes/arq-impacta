package pontos.interfaces;

public class Participante {
	
	private int Identificador;
	private String senha;
	private int pontos;
	
	public Participante(){
		
	}

	public int getIdentificador() {
		return Identificador;
	}

	public String getSenha() {
		return senha;
	}

	public int getPontos() {
		return pontos;
	}

	public Participante(int identificador, String senha, int pontos) {
		super();
		Identificador = identificador;
		this.senha = senha;
		this.pontos = pontos;
	}
}
