import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Listaaplicador{
	ArrayList<Aplicador>  aplicador = new ArrayList();


	public void meter(){
		String nombre="";
		int contacto=0;
		String informacion="";

		Scanner sc= new Scanner(System.in);
		System.out.println("\n");
		System.out.println("Ingrese tu nombre \n ");
		nombre= sc.nextLine();
		System.out.println("Ingrese tu numero de contacto ");
		contacto= sc.nextInt();
		System.out.println("Ingrese una descripcion");
		informacion=sc.nextLine();
		sc.nextLine();

		Aplicador apl= new Aplicador();

		apl.setnombre(nombre);
		apl.setcontacto(contacto);
		apl.setinformacion(informacion);

		aplicador.add(apl);
	}
}