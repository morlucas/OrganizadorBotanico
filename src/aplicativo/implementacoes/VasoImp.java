package aplicativo.implementacoes;

import java.util.ArrayList;
import java.util.List;

import aplicativo.funcionalidades.interfaces.Planta;
import aplicativo.funcionalidades.interfaces.Vaso;

public class VasoImp implements Vaso {
	List<Planta> plantas = new ArrayList<>();
	private String localizador;
	private String obs;
	
	public void adicionar(Planta planta) {
		plantas.add(planta);
	}

	public void remover(Planta planta) {
		int index = plantas.indexOf(planta);
		if(index < 0) throw new IndexOutOfBoundsException("Planta não existe.");
		plantas.remove(index);
	}

	public void setLocalizador(String novoLocalizador) {
		this.localizador = novoLocalizador;		
	}

	public String getLocalizador() {
		return this.localizador;
	}

	public void setObs(String obs) {
		this.obs = obs;		
	}

	public String getObs() {
		return this.obs;
	}
	
}
