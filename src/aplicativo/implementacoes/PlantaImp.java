package aplicativo.implementacoes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import aplicativo.funcionalidades.interfaces.Planta;

public class PlantaImp implements Planta {
	private Calendar dataPlantio;
	private String localizador;
	private String tipoDeJarro;
	private String nomeEspecie;
	private String nome;
	private boolean isProduto; //Se esta planta é produto ou não
	
	public PlantaImp(	Calendar dataPlantio,
						String localizador,
						String tipoDeJarro,
						String nomeEspecie,
						String nome,
						boolean isProduto) {
		super();
		this.dataPlantio = dataPlantio;
		this.localizador = localizador;
		this.tipoDeJarro = tipoDeJarro;
		this.nomeEspecie = nomeEspecie;
		this.nome = nome;
		this.isProduto = isProduto;
	}
	
	public PlantaImp(){
		this.dataPlantio = Calendar.getInstance();
		this.localizador = null;
		this.tipoDeJarro = null;
		this.nomeEspecie = null;
		this.nome = null;
		
	}
	
	public void setDataPlantio(Calendar dataPlantio) {
		this.dataPlantio = dataPlantio;
	}

	public Calendar getDataPlantio() {
		return this.dataPlantio;
	}

	public long getTempoDesdeoPlantio() {
		long tempoDesdePlantio = 0;
		try{
			Calendar agora = Calendar.getInstance();
			tempoDesdePlantio = agora.getTimeInMillis() - dataPlantio.getTimeInMillis();
		}catch (Exception e){
			System.err.println("Erro");
		}
			return tempoDesdePlantio;
	}

	public String getLocalizador() {
		return this.localizador;
	}

	public void setLocalizador(String localizador) {
		this.localizador = localizador;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return this.nome;
	}

	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}

	public String getNomeEspecie() {
		return this.nomeEspecie;
	}

	public String getTipoDeJarro() {
		return this.tipoDeJarro;
	}

	public void setTipoDeJarro(String tipoDeJarro) {
		this.tipoDeJarro = tipoDeJarro;
	}

	public boolean isProduto() {
		return this.isProduto;
	}

	public void setIsProduto(boolean isProduto) {
		this.isProduto = isProduto;
	}
	
	public ArrayList<String> mostraTodosAtributos(){
		ArrayList<String> atts = new ArrayList<String>();
		try{
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
			atts.add(formato.format(dataPlantio.getTime()));
		}catch(Exception e){
			e.getStackTrace();
		}
		atts.add(localizador);
		atts.add(nome);
		atts.add(nomeEspecie);
		atts.add(tipoDeJarro);
		atts.add(String.valueOf(isProduto));
		return atts;
	}

	
}
