package pontos.interfaces;

public interface IPontosProcess {

	Mapeamento getMapeamento();
	int getPontos(int identificador, String letras, Mapeamento mapeamento);
	
}
