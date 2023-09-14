import java.util.Random;

public class Evento extends Carta {
	efecto efect;
	public void aplicarEvento(Tablero tablero, Mazo Carrera, int posicion) {
		switch (efect) {
		case RAV:
			Carrera.putBack(tablero.Semestre.get(posicion-1));
			tablero.Semestre.remove(posicion-1);
			break;
			
		case Buff:
			switch (posicion) {
				case 1:
					for(int i=0; i<tablero.Semestre.size(); i++) {
						if(tablero.Semestre.get(posicion).area==Area.Matematica) {
							tablero.Semestre.get(posicion).Buff=125/100;
						}
					}
					break;
				case 2:
					for(int i=0; i<tablero.Semestre.size(); i++) {
						if(tablero.Semestre.get(posicion).area==Area.Humanista) {
							tablero.Semestre.get(posicion).Buff=125/100;
						}
					}
					break;
				case 3:
					for(int i=0; i<tablero.Semestre.size(); i++) {
						if(tablero.Semestre.get(posicion).area==Area.Informatica) {
							tablero.Semestre.get(posicion).Buff=125/100;
						}
					}
					break;
			}
			break;
			
			
		case CambioCoordinacion:
			Random r= new Random();
			int temp=r.nextInt(100);
			if(temp>=50) {
				tablero.Semestre.get(posicion).creditos+=3;
			}
			else {
				tablero.Semestre.get(posicion).creditos-=3;
			}
			
			break;
			
			
		default:
			System.out.println("Problema al aplicar el evento\n");
		}
	}
	public void initEvento(efecto efectacion, String name, String lore) {
		efect=efectacion;
		Nombre=name;
		Lore=lore;
	}
	public void mostrarCarta() {
		System.out.println("Evento:");
		System.out.println("  	Nombre: " + Nombre);
		System.out.println("  	Lore: " + Lore);
		System.out.println("  	Efecto: " + efect);
		System.out.println("");
	}

}
