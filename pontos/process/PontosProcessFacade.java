package pontos.process;

import pontos.interfaces.*;

public class PontosProcessFacade implements IPontosProcess {

	private IPontosBusiness negocios;
	private Mapeador mapeador;
	public PontosProcessFacade(IPontosBusiness negocios){
		this.negocios = negocios;
		mapeador = new Mapeador();
	}
	
	public Mapeamento getMapeamento(){
		return mapeador.gerarMapeamento();
	}
	
	public int getPontos(int identificador, String letras, Mapeamento mapeamento){
		int pontos = -1;
		Participante p = negocios.find(identificador);
		String senha = p.getSenha();
		boolean autorizado = mapeador.validar(mapeamento, letras, senha);
		if(autorizado){
			pontos = p.getPontos();
		}
		return pontos;
	}
}
