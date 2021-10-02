import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Listaempresas{
	ArrayList<Empresa>  empresas = new ArrayList();


	public void meter(){
		String nombre="";
		int contacto=0;
		String informacion="";

		Scanner sc= new Scanner(System.in);
		System.out.println("\n");
		System.out.println("Ingrese el nombre de la empresa \n ");
		nombre= sc.nextLine();
		System.out.println("Ingrese el numero de contacto ");
		contacto= sc.nextInt();
		System.out.println("Ingrese una descripcion del puesto de empleo");
		informacion=sc.nextLine();
		sc.nextLine();

		Empresa emp= new Empresa();

		emp.setnombre(nombre);
		emp.setcontacto(contacto);
		emp.setinformacion(informacion);

		empresas.add(emp);
	}
}