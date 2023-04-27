package Clase;

public class Profesor extends Colegio {//heredamos de la super clase los metodos y atributos de colegio
public Profesor(String nombreProfesor, int edad, String clase) {
	super(nombreProfesor,edad,clase);
}

public void Enseña() {
	super.Enseña(); //Aqui llamamos al metodo
}
public void DatosProfe() {
 super.DatosProfe();
}
}
