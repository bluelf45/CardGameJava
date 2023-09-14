enum Area {
	Humanista,
	Informatica,
	Matematica
}
enum efecto{
	RAV,
	Buff,
	CambioCoordinacion
}
public abstract class Carta {
	protected String Nombre;
	protected String Lore;
	public abstract void mostrarCarta();
}
