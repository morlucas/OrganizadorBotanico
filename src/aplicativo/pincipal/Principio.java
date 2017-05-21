package aplicativo.pincipal;

import java.util.ArrayList;
import java.util.Calendar;

import aplicativo.funcionalidades.interfaces.Planta;
import aplicativo.funcionalidades.interfaces.Semente;
import aplicativo.implementacoes.PlantaImp;
import aplicativo.implementacoes.SementeImp;

public class Principio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Planta> plantas = new ArrayList<Planta>();
		ArrayList<Semente> sementes = new ArrayList<Semente>();
		
		
		plantas.add(new PlantaImp(Calendar.getInstance(), "B4", "Barro", "Não-conhecido", "Ipe Roxo", false));
	
		plantas.add(new PlantaImp(Calendar.getInstance(), "B5", "Barro", "Não-conhecido", "Ipe Aamarelo", false));
	
		plantas.add(new PlantaImp(Calendar.getInstance(), "B6", "Barro", "Não-conhecido", "Suculenta", false));
		
		plantas.add(new PlantaImp(Calendar.getInstance(), "B7", "Barro", "Não-conhecido", "Muda desconhcida", false));
		
		plantas.add(new PlantaImp(Calendar.getInstance(), "B8", "Barro", "Não-conhecido", "Bonsai Jabuticaba", false));
		
		Semente semente = new SementeImp("A0",50,"arvore desconhecida");
		sementes.add(semente);
		
		semente = new SementeImp("A1",3,"arvore desconhecida");
		sementes.add(semente);
		
		semente = new SementeImp("A2",1,"arvore desconhecida");
		sementes.add(semente);
		
		
		for(int i = 0; i<plantas.size(); i++){
			Planta planta = plantas.get(i);
			ArrayList<String> atts = planta.mostraTodosAtributos();
			for(int j = 0;j<atts.size();j++)System.out.println(atts.get(j));
			System.out.println();
		}
		
		for(int i = 0; i<sementes.size(); i++){
			semente = sementes.get(i);
			ArrayList<String> atts = semente.mostraTodosAtributos();
			for(int j = 0;j<atts.size();j++)System.out.println(atts.get(j));
			System.out.println();
		}
	}

}
