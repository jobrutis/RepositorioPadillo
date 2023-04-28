package Clase;

public class Directora extends Colegio {//Aqui heredamos de la supclase es decir llamamos a los metodos y atributos de la subclase con el extends
public Directora(String nombreDirectora, String clase,int edad,int aulas) {//Para llamar los atributos necesitaremos decir el tipo de dato y el mismo orden que tenemos en la superclase
	super(nombreDirectora,clase,edad,aulas);//super()LLamara a los atributos de la superclase y dentro del ()pondremos los atributos
}
public void Dirije(){
	super.Dirije();//Con el super. llamaremos a los metodos
}
public void DatosDirectora() {
	super.DatosDirectora();
}
}
