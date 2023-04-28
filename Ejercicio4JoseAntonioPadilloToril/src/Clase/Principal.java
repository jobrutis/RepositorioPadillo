package Clase;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Stack<String> gerarquia = new Stack<>();//Utilice una pila para crear un orden donde el primer dato si lo borrara seria el primero en borrarse
		gerarquia.add("Directora");//añadimos datos a la pila
		gerarquia.add("Subdirectora");
		gerarquia.add("Profesor");
		gerarquia.add("Alumno");
		Profesor Miprofe = new Profesor("Adolfo", 25, "1ºDAM");//Definimos el objeto con los metodos y atributos de la subclase profesor y definimos los atributos
		Directora Midirectora = new Directora("Rosa","Despacho de direccion",35,150);
		Subdire Misub = new Subdire(36, "Soraya", "Despacho direccion");
		Alumno Mialumno = new Alumno(23, "Padillo", "1ºDAM", 10, "Adolfo");
		Miprofe.DatosProfe();//Con el nombre del objeto ya definido llamaremos los metodos de la subclase
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
		System.out.println("En la gerarquia de los colegios es: " + gerarquia);//Aqui saldra la pila con el orden de introduccion de datos de arriba
		System.out.println("==========================================================================");
		System.out.println("En nuestro patio hay muchos deportes en los que se hacen varias cosas");
		Patio Campo = new Campo();//Aqui nombraremos el objeto que hace referencia a la interface
		Campo.JugarPartido();//Aqui lo llamaremos a los metodos
		Campo.Numerojugador();
		Campo.Porteria();
		Balon Baloncesto= new Baloncesto();
		System.out.println("");
		Baloncesto.JugarPartido();
		Baloncesto.Numerojugador();
		Baloncesto.Canasta();
		Tenis Padel= new Padel();
		System.out.println();
		Padel.JugarPartido();
		Padel.Numerojugador();
		Padel.Redes();
		System.out.println();
		System.out.println("Muchas gracias por pasarte por el colegio Salesianos");
		
		
	}

}
