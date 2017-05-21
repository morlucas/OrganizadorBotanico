package aplicativo.funcionalidades.interfaces;

import java.util.Calendar;

//para sementes que foram plantadas

public interface Plantada extends Planta {
	
	public boolean isGerminada();
	
	public void setGerminada(boolean isGerminada, Calendar data);
	
	public Planta setPlanta();
	
}
