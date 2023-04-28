package Clase;
import java.util.Scanner;
interface Tenis {
	void JugarPartido();

	void Numerojugador();

	void Porteria();

	void Canasta();

	void Redes();
}
class Padel implements Tenis {
	public void JugarPartido() {
		System.out.println("En la pista de padel hay un partido");
	}

	public void Numerojugador() {
		System.out.println("En el campo hay 2 jugadores por equipo");
	}

	public void Porteria() {
		System.out.println("");
	}

	public void Canasta() {
		System.out.println("");
	}

	public void Redes() {
		System.out.println("¿Cuantas redes hay?");
		Scanner ss = new Scanner(System.in);
		int numeroPa = ss.nextInt();
		if (numeroPa == 1) {
			System.out.println("Muy bien era mu facil");
		} else {
			System.out.println("Era 1 pero lo importante es intentarlo");
		}
	}
}