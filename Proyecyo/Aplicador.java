import java.util.ArrayList;
public class Aplicador{
	private String nombre;
	private int contacto;
	private String informacion;


	public Aplicador(){
		nombre="";
		contacto=0;
		informacion="";

	}

	public String getnombre(){
		return nombre;
	}
	public int getcontacto(){
		return contacto;

	}
	public String getinformacion(){
		return informacion;

	}
	public void setnombre(String nombre){
		this.nombre=nombre;
	}
	public void setcontacto(int contacto){
		this.contacto=contacto;
	}
	public void setinformacion(String informacion){
		this.informacion=informacion;
	}

}