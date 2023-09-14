import java.util.ArrayList;

public class Ramo extends Carta {
	int creditos;
	ArrayList<Estudio> Estudios = new ArrayList<Estudio>();
	Area area;
	public int Buff=1;
	private int Nota=0;

	public void initRamo(Area ar, String name, String lore) {
		Lore=lore;
		Nombre=name;
		area=ar;
		switch (ar) {
			case Informatica:
				creditos=5;
				break;
			case Matematica:
				creditos=7;
				break;
			case Humanista:
				creditos=2;
				break;
		}
	}

	public int calcularNota() {
		int NF=0, bonus=0;
		for(int i=0; i<Estudios.size(); i++) {
			bonus=((Estudios.get(i)).calcularBonus());
			if(area==(Estudios.get(i)).area) {
				bonus=bonus*125/100*Buff;
			}
			NF+=bonus;
		}
		Nota=NF-(2*creditos);
		if(Nota>=100) {
			Nota=100;
			return 100;
		}
		if(Nota<=0) {
			Nota=0;
			return 0;
			}
		return Nota;
	}

	public void anadirEstudio(Estudio estudio) {
		Estudios.add(estudio);
		calcularNota();
	}

	public int getNota() {
		return Nota;
	}

	public void mostrarCarta() {
		System.out.println("  Nombre: "+Nombre);
		System.out.println("  Lore: "+Lore);
		System.out.println("  Area: "+area);
		System.out.println("  Nota =  "+Nota);
		System.out.println("\n");
		if(Estudios.size()!=0) {
			System.out.println("Estudios en "+Nombre+ ":");
			for(int j=0; j<Estudios.size(); j++) {
				Estudios.get(j).mostrarCarta();
			}
		}
		
	}

}