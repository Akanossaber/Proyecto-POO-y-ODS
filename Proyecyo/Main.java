import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		Listaempresas empresas= new Listaempresas();
		Listaaplicador aplicador= new Listaaplicador();
		System.out.println("**---Bienvenido a la aplicacion de busqueda de empleos---**");
		int opcion=0;
		do{
			opcion=OpcionesInicio();
			if(opcion==1){
				int opciones=0;
				do{
					opciones=OpcionesEmpresa();
					if(opciones==1){
						System.out.print("	Muchas Gracias por habilitad una nueva plaza de empleo \n");
						empresas.meter();
					}

				}while(opciones!=0);
				




			}
			if(opcion==2){
				System.out.print("	Bienvenido a la busqueda de tu nuevo empleo \n");
				int opciones=0;
				do{
					opciones=OpcionesAplicante();
					if(opciones==1){
						aplicador.meter();

					}

				}while(opciones!=0);



			}





		}while(opcion!=0);






	}


	public static int OpcionesInicio(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Defina su estado \n");
		System.out.print("(1) Gerente o dueno de empresa\n");
		System.out.print("(2) Aspriante a empleado\n");
		System.out.print("(0) Salir de la aplicacion\n");
		return sc.nextInt();


	}
		public static int OpcionesAplicante(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Que es lo que desea hacer?\n");
		System.out.print("(1) Subir informacion para encontrar empleo\n");
		System.out.print("(2) Ver propuestas de trabajo \n");
		System.out.print("(3) Ver tips y recomendaciones para entrevistas ");
		System.out.print("(0) Salir de la aplicacion\n");
		return sc.nextInt();


	}
	public static int OpcionesEmpresa(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Que es lo que desea hacer?\n");
		System.out.print("(1) Habilitar una plaza de empleo\n");
		System.out.print("(2) Ver candidatos \n");
		System.out.print("(3) Eliminar una plaza\n");
		System.out.print("(0) Salir de la aplicacion\n");
		return sc.nextInt();


	}

}