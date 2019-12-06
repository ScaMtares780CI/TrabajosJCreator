escribir un programa que muestre un menu con las sgtes opciones
factiorial
potencia
producto
terminar
de acuerdo a la opcion elegida debe hacer todo lo necesario para realizarlo lo solicitado
el programa se repite mientras noi se desee continar
*/
import java.io.*;
public class ejercicio3
{static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
	{int N1,N2,prod,pot,fac,opc;
		
		do{
			opc=menu();
			switch(opc){
					case 1: 
								N1=leerN("Ingrese un numero: ");
								fac=factorial(N1);
								reportar(fac,"El factorial ");
								break;
					case 2: N1=leerN("Ingrese primer numero: ");
							N2=leerN("Ingrese segundo numero: ");
							pot=potencia(N1,N2);
							reportar(pot,"La potencia ");
							break;
					case 3: N1=leerN("Ingrese primer numero: ");
							N2=leerN("ingrese segundo numero: ");
							prod=producto(N1,N2);
							reportar(prod,"El producto ");
							break;
					case 4: terminar();
			}
		}while(opc!=4);
	}
	
	static int menu() throws IOException
	{int opc;
		do{
			System.out.println("");
			System.out.println("++++++++++++++MENU++++++++++++++");
			System.out.println("1.- Factorial");
			System.out.println("2.- Potencia");
			System.out.println("3.- Producto");
			System.out.println("4.- Terminar");
			System.out.println("Seleccione opcion: ");
			opc=Integer.parseInt(br.readLine());
			System.out.println("");
		}while(opc<1||opc>4);
	return opc;
	}
	
	static int leerN(String mensaje) throws IOException
	{int N;
		System.out.print("\n"+mensaje);
		N=Integer.parseInt(br.readLine());
	return N;
	}
	
	static int factorial(int N) throws IOException
	{int fac=1,c;
		for(c=1;c<=N;c++){
			fac=fac*c;
		}
	return fac;
	}
	
	static int producto(int N1, int N2) throws IOException
	{int prod=0,c;
		for(c=1;c<=N1;c++){
			prod=prod+N2;
		}
	return prod;
	}
	
	static int potencia(int N1, int N2) throws IOException
	{int pot=1,c;
		for(c=1;c<=N2;c++){
			pot=pot*N1;
		}
	return pot;
	}
	
	static void reportar(int x,String mensaje) throws IOException
	{
		System.out.println("\n"+mensaje+"es ="+x);
	return;
	}
	
	static void terminar()
	{
		System.out.print("Fin de programa");
	return;
	}
}