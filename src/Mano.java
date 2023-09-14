import java.util.ArrayList;

public class Mano {
	ArrayList<Carta> ArregloMano = new ArrayList<Carta>();
	int size=0;
	public void mostrarMano() {
		for(int i=0; i<ArregloMano.size(); i++) {
			System.out.println("Carta Nr."+(i+1));
			ArregloMano.get(i).mostrarCarta();
		}
	}
	public void anadirCarta(Carta carta) {
		size++;
		ArregloMano.add(carta);
	}
	public Carta seleccionarCarta(int pos) {
		Carta cart= ArregloMano.get(pos);
		ArregloMano.remove(pos);
		size--;
		return cart;
	}
	/*** getSize: 
	 * devuelve el tamagno de la mano
	 * @return int: tamagno de la mano
	 * */
	public int getSize() {
		return size;
	}
	public void clearMano() {
		for(int i=0; i<ArregloMano.size(); i++) {
			seleccionarCarta(i);
		}
	}
}