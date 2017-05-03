package pontos;

import pontos.business.*;
import pontos.desktop.PontosDesktop;
import pontos.interfaces.IPontosBusiness;
import pontos.interfaces.IPontosProcess;
import pontos.process.PontosProcessFacade;

public class PontosContainer {

		public static void main(String[] args){
			IPontosBusiness negocios = new ParticipanteArq("pontos.txt");
			IPontosProcess processo = new PontosProcessFacade(negocios);
			PontosDesktop desktop = new PontosDesktop(processo);
			desktop.consultarPontos();
		}
}
