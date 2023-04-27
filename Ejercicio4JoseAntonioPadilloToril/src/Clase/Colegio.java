package Clase;

public class Colegio {// Adolfo yo estuve el primer dia en el que hubo musicote chunga chunga
	public String nombreAlumno;
	public String nombreProfesor;
	public String nombreDirectora;
	public String nombreSubdire;
	public String clase;
	private String suProfe;
	public int edad;
	private int nota;

	public Colegio(String nombreProfesor, int edad, String clase) {
		this.nombreProfesor = nombreProfesor;
		this.clase = clase;
		this.edad = edad;
	}

	public Colegio(String clase, String nombreDirectora, int edad) {
		this.clase = clase;
		this.edad = edad;
		this.nombreDirectora = nombreDirectora;
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

	public void Enseña() {
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

	public void DatosProfe() {
		System.out.println("El nombre del profesor es " + this.nombreProfesor + " Con " + this.edad
				+ " años que imparte clase en " + this.clase);
	}

	public void DatosDirectora() {
		System.out.println("Esta persona es la directora que ejerce en el " + this.clase + ", con solo " + this.edad
				+ " años y su nombre es " + this.nombreDirectora);
	}

	public void DatosSubdire() {
		System.out.println("El nombre dela subdirectora es " + this.nombreSubdire + " Con " + this.edad
				+ " años que  dirije en " + this.clase);
	}

	public void DatosAlumno() {
		System.out
				.println("El nombre del alumno es " + this.nombreAlumno + " Con " + this.edad + " años que da clase en "
						+ this.clase + ", Donde " + this.suProfe + " le puso un " + this.nota + " por ser el favorito");
	}
}
