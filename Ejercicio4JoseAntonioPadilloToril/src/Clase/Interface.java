package Clase;

import java.util.Scanner;

interface Patio {//Crearemos los metodos que tendra nuestra interface 
	void JugarPartido();

	void Numerojugador();

	void Porteria();

	void Canasta();

	void Redes();
}

class Campo implements Patio {//Crearemos la clase con la implementacion de los metodos que se implementan con implents y el nombre de la interface
	public void JugarPartido() {//Luego es cuestion de definir los metodos que luego seran llamados desde la principal
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
}
