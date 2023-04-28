package Clase;

import java.util.Scanner;
interface Balon {
	void JugarPartido();

	void Numerojugador();

	void Porteria();

	void Canasta();

	void Redes();
}


class Baloncesto implements Balon{
		
		public void JugarPartido() {
			System.out.println("En la cancha hay un partido");
		}

		public void Numerojugador() {
			System.out.println("En el campo hay 6 jugadores por equipo");
		}

		public void Porteria() {
			System.out.println("");

		}

		public void Canasta() {
			System.out.println("¿Cuantas canastas hay?");
			Scanner sc = new Scanner(System.in);
			int numeroC = sc.nextInt();
			if (numeroC == 2) {
				System.out.println("Muy bien era mu facil");
			} else {
				System.out.println("Era 2 pero lo importante es intentarlo");
			}
		}

		public void Redes() {
			System.out.println("Hay redes pero me referia a las de padel");
		}
	}



