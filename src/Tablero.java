import java.util.ArrayList;

public class Tablero {
	ArrayList<Ramo> Semestre = new ArrayList<Ramo>();
	public int horasDisponibles=12;
	public void jugarEstudio(Estudio estudio, int pos) {
		Semestre.get(pos).anadirEstudio(estudio);
		horasDisponibles-=estudio.horas;
	}
	public void mostrarTablero() {
		System.out.println("-=-=-=-HORAS DISPONIBLES = "+horasDisponibles+"-=-=-=-");
		System.out.println("Ramos en Mesa: \n");
		for (int i=0; i< Semestre.size(); i++) {
			Semestre.get(i).mostrarCarta();
		}
	}
	/*** NombreDeLaFuncion:*
	 *   Limpia el tablero, quitando las cartas de este
	 *   @return Void:nada
	 *   */
	public void clearTablero() {
		Semestre.clear();
		horasDisponibles=12;
	}
	
}
