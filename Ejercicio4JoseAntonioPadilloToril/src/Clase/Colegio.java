package Clase;

//Adolfo comente la superclase y la subclase directora como son muchas y son las misma te comento solo esa subclase
//Lo mismo para las interfaces
//Esta es la super clase en la que habra metodos y atributos donde las clases heredaran dichos atributos y metodos
public class Colegio {// Adolfo yo estuve el primer dia en el que hubo musicote chunga chunga
	public String nombreAlumno;
	public String nombreProfesor;
	public String nombreDirectora;
	public String nombreSubdire;// En los atributos encapsularemos
	public String clase;
	private String suProfe;
	public int edad;
	private int nota;
	protected int aulas;

	public Colegio(String nombreProfesor, int edad, String clase) {// Aqui vamos asociar los tributos a las subclases
		this.nombreProfesor = nombreProfesor;// con el this llamaremos a los atributos a si no tendremos que hacerlos de
												// nuevo
		this.clase = clase;
		this.edad = edad;
	}

	public Colegio(String nombreDirectora, String clase, int edad, int aulas) {
		this.nombreDirectora = nombreDirectora;
		this.clase = clase;
		this.edad = edad;
		this.aulas = aulas;
	}

	public Colegio(int edad, String nombreSubdire, String clase) {
		this.nombreSubdire = nombreSubdire;
		this.clase = clase;
		this.edad = edad;
	}

	public Colegio(int edad, String nombreAlumno, String clase, int nota, String suProfe) {
		this.nombreAlumno = nombreAlumno;
		this.clase = clase;
		this.edad = edad;
		this.nota = nota;
		this.suProfe = suProfe;
	}

	public void Enseña() {// Crearemos los metodos que tendran las subclases
		System.out.println("Este docente enseña");
	}

	public void Aprente() {
		System.out.println("Este alumno aprende ");
	}

	public void Dirije() {
		System.out.println("Estas personas dirijen ");
	}

	public void Mostrar() {
		System.out.println("Pertenece al colegio Salesianos");
	}

	public void DatosProfe() {// Constructor que llamara la subclase
		System.out.println("El nombre del profesor es " + this.nombreProfesor + " Con " + this.edad
				+ " años que imparte clase en " + this.clase);
	}

	public void DatosDirectora() {
		System.out.println(
				"Esta persona es " + this.nombreDirectora + " con " + this.edad + " años esta persona se encarga del "
						+ this.clase + " Y Esta es la persona que se encagan de  " + this.aulas + " aulas");
	}

	public void DatosSubdire() {
		System.out.println("El nombre de la subdirectora es " + this.nombreSubdire + " Con " + this.edad
				+ " años que  dirije en " + this.clase);
	}

	public void DatosAlumno() {
		System.out
				.println("El nombre del alumno es " + this.nombreAlumno + " Con " + this.edad + " años que da clase en "
						+ this.clase + ", Donde " + this.suProfe + " le puso un " + this.nota + " por ser el favorito");
	}
}
