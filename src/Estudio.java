import java.util.Random;
enum Rareza{
	Comunes,
	Raras,
	Epicas
}
public class Estudio extends Carta{
	public int horas;
	public int bonusMin;
	public int bonusMax;
	int nota;
	Area area;
	Rareza rara;
	public int calcularBonus() {
		Random r= new Random();
		if(nota!=0) {
			return nota;
		}
		else {
			int xd=r.nextInt(bonusMax-bonusMin+1)+bonusMin;
			nota=xd;
			return xd;
		}
	}
	
	/*** NombreDeLaFuncion: iniciarEstudio
	 * Inicia una carta estudio asignandole las variables entregadas cuando se llama a la funcion
	 * @param rar Rareza : rareza de l carta Estudio.
	 * @param ar Area : El Area para la carta Estudio.
	 * @param name String : Nombre para la Carta Estudio.
	 * @param lore String: Historia de la Carta .
	 * @return void:nada
	 * */
	public void iniciarEstudio(Rareza rar, Area ar, String name, String lore) {
		area=ar;
		rara=rar;
		Lore=lore;
		Nombre=name;
		switch(rar) {
		case Comunes:
			horas=2;
			bonusMin=18;
			bonusMax=26;
			break;
		case Raras:
			horas=3;
			bonusMin=28;
			bonusMax=40;
			break;
		case Epicas:
			horas=4;
			bonusMin=20;
			bonusMax=90;
			break;
			default:
				System.out.println("Rareza de una carta mal especificada");
		}
		
	}

	/*** NombreDeLaFuncion: getHoras
	 * conseguir la variable horas de esta carta.
	 * @return int : horas
	 * */
	public int getHoras() {
		return horas;
	}
	
	public void mostrarCarta() {
		System.out.println("Estudio:");
		System.out.println("  	Nombre: " + Nombre);
		System.out.println("  	Lore: " + Lore);
		System.out.println("  	Area: " + area);
		System.out.println("  	Rareza: " + rara);
		System.out.println("");
	}
}
