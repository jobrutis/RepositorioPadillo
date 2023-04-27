package Clase;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Stack<String> gerarquia = new Stack<>();
		gerarquia.add("Directora");
		gerarquia.add("Subdirectora");
		gerarquia.add("Profesor");
		gerarquia.add("Alumno");
		Profesor Miprofe = new Profesor("Adolfo", 25, "1ºDAM");
		Directora Midirectora = new Directora("Despacho direccion",37,"Rosa");
		Subdire Misub = new Subdire(36, "Soraya", "Despacho direccion");
		Alumno Mialumno = new Alumno(23, "Padillo", "1ºDAM", 10, "Adolfo");
		Miprofe.DatosProfe();
		Miprofe.Enseña();
		System.out.println();
		Midirectora.DatosDirectora();
		Midirectora.Dirije();
		System.out.println();
		Misub.DatosSubdire();
		Misub.Dirije();
		System.out.println();
		Mialumno.DatosAlumno();
		Mialumno.Aprende();
		System.out.println();
		System.out.println("Usamos la pila para ordenar los datos de entrada");
		System.out.println("En este caso el primer dato que se introduce es directora y en pantalla sera el primero que se vea");
		System.out.println("En la gerarquia de los colegios es: " + gerarquia);
		System.out.println("==========================================================================");
		System.out.println("En nuestro patio hay muchos deportes en los que se hacen varias cosas");
		Patio Campo = new Campo();
		Campo.JugarPartido();
		Campo.Numerojugador();
		Campo.Porteria();
		Patio Campo1= new Campo1();
		System.out.println("");
		Campo1.Canasta();
		Campo1.JugarPartido();
		Campo1.Numerojugador();
		Patio Campo2= new Campo2();
		System.out.println();
		Campo2.JugarPartido();
		Campo2.Numerojugador();
		Campo2.Redes();
		
		
		
	}

}
