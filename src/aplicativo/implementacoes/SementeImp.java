package aplicativo.implementacoes;

import java.util.ArrayList;
import java.util.Calendar;

import aplicativo.funcionalidades.interfaces.Plantada;
import aplicativo.funcionalidades.interfaces.Semente;

public class SementeImp extends PlantaImp implements Semente {
	private int qnt;
	private boolean isPlantada = false;
	private String obs;
	private ArrayList<Integer> qntPlantada;
	private ArrayList<Calendar> dataPlantio;
	
	public SementeImp(){
		super();
		this.obs = null;
		this.qnt = 0;
	}
	
	public SementeImp(String localizador, int qnt, String obs){
		super();
		super.setLocalizador(localizador);
		this.qnt = qnt;
		this.obs = obs;
	}
	
	public void setQuantidade(int qnt) {
		Math.abs(qnt);
		this.qnt = qnt;
	}

	public int getQuantidade() {
		return qnt;
	}

	public boolean isPlantada() {
		return isPlantada;
	}

	public Plantada setIsPlantada(boolean isPlantada,
									int qntPlantada,
									Calendar dataPlantio,
									String localizador,
									String tipoDeJarro,
									String nomeEspecie,
									String nome,
									boolean isProduto) {
		
		this.isPlantada = isPlantada;
		this.dataPlantio.add(dataPlantio);
		this.qntPlantada.add(qntPlantada);
		Plantada plantada = new PlantadaImp(dataPlantio,
				localizador,
				tipoDeJarro,
				nomeEspecie,
				nome,
				isProduto);
		
		Math.abs(qntPlantada);
		this.qnt -= qntPlantada;
		return plantada;
	}
	
	public ArrayList<String> mostraTodosAtributos(){
		ArrayList<String> atts = new ArrayList<String>();
		
		atts.add("Semente " + this.obs);
		atts.add(super.getLocalizador());
		atts.add(super.getNomeEspecie());
		atts.add(super.getTipoDeJarro());
		atts.add(Integer.toString(this.qnt));
		atts.add(String.valueOf(super.isProduto()));
		
		return atts;
	}
	
	public ArrayList<Integer> getQntPlantada() {
		return qntPlantada;
	}

	public ArrayList<Calendar> getDataPlantios() {
		return dataPlantio;
	}
}
