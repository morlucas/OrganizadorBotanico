package aplicativo.implementacoes;

import java.util.Calendar;

import aplicativo.funcionalidades.interfaces.Planta;
import aplicativo.funcionalidades.interfaces.Plantada;

public class PlantadaImp extends PlantaImp implements Plantada {
	private boolean isGerminada = false;
	private Calendar dataGerminacao;
	
	public PlantadaImp(Calendar dataPlantio,
						String localizador,
						String tipoDeJarro,
						String nomeEspecie,
						String nome,
						boolean isProduto){
		
		super(dataPlantio,
				localizador,
				tipoDeJarro,
				nomeEspecie,
				nome,
				isProduto);
		this.setDataGerminacao(null);
	}
	
	public boolean isGerminada() {
		return isGerminada;
	}
	public void setGerminada(boolean isGerminada, Calendar data) {
		this.isGerminada = isGerminada;
		this.setDataGerminacao(data);
	}

	public Planta setPlanta() {
		Planta planta = new PlantaImp(super.getDataPlantio(),super.getLocalizador(),super.getTipoDeJarro()
				,super.getNomeEspecie(),super.getNome(), super.isProduto());
		return planta;
	}

	public Calendar getDataGerminacao() {
		return dataGerminacao;
	}

	public void setDataGerminacao(Calendar dataGerminacao) {
		this.dataGerminacao = dataGerminacao;
	}
	
	
}
