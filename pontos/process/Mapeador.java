package pontos.process;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import pontos.interfaces.Mapeamento;

public class Mapeador {

	public Mapeamento gerarMapeamento(){
		Character[] letras = {'A', 'B', 'C', 'D', 'E'};
		ArrayList<Integer> numeros = new ArrayList<>();
		Map<Character, Integer[]>mapa = new HashMap<>();
		for(int i=0; i<10; i++){
			numeros.add(i);
		}
		Random random = new Random();
		for(Character letra: letras){
			Integer[] nums = new Integer[2];
			for(int i=0; i<nums.length; i++){
					nums[i] = numeros.remove(random.nextInt(numeros.size()));
			}
			mapa .put(letra, nums);
		}
		Mapeamento mapeamento = new Mapeamento(mapa);
		return mapeamento;
	
	}
	private Character obterLetra(Mapeamento mapeamento, int	numero){
		for(Character letra: mapeamento.getMapa().keySet()){
			Integer[] nums = mapeamento.getMapa().get(letra);
			for(Integer num: nums){
				if(num == numero){
					return letra;
				}
			}
		}
		return null;
	}
	public boolean validar(Mapeamento mapeamento, String letras, String senha){
		String senhaCodificada = "";
		for(int i=0; i<senha.length(); i++){
			Integer numero = Integer.parseInt(""+senha.charAt(i));
			senhaCodificada += obterLetra(mapeamento, numero);
		}
		if(senhaCodificada.equals(letras)){
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
}
