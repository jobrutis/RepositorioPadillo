package Clase;

import java.util.Scanner;

interface Patio {
	void JugarPartido();

	void Numerojugador();

	void Porteria();

	void Canasta();

	void Redes();
}

class Campo implements Patio {
	public void JugarPartido() {
		System.out.println("En el campo de futbol hay un partido");
	}

	public void Numerojugador() {
		System.out.println("En el campo hay 12 jugadores por equipo");
	}

	public void Porteria() {
		System.out.println("¿Cuantas porterias hay?");
		Scanner sr = new Scanner(System.in);
		int numeroP = sr.nextInt();
		if (numeroP == 2) {
			System.out.println("Muy bien era mu facil");
		} else {
			System.out.println("Era 2 pero lo importante es intentarlo");
		}
	}

	public void Canasta() {
		System.out.println("Aqui no hay de eso");
	}

	public void Redes() {
		System.out.println("Hay redes pero me referia a las de padel");
	}

	class Balon implements Patio {
		
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

	class Tenis implements Patio {
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
}
