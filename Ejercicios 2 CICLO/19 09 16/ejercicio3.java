/*
 *1.Ingresar el nombre y sexo de N alumnos y reportar:
 *A.Los datos de los alumnos hombres.Indicar cuantos son.
 *B.Los datos de los alumnos mujeres.Indicar cuantas son.
 **/

import java.io.*;
public class ejercicio3	{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[]args)throws IOException	{
		String nombre[] = new String[20];
		char sexo[] = new char[20];
		int N,i,cantHombres = 0,cantMujeres = 0;
		
		//Leer N
		do{
			System.out.print("Ingrese cantidad de datos N=");
			N = Integer.parseInt(br.readLine());
		}while(N<=0 || N>20);
		
		//Ingresar datos nombre
		for(i = 0; i < N; i++){
			System.out.print("Ingrese nombre["+ i +"]:");
			nombre[i] = br.readLine();
			do{
				System.out.print("Ingrese sexo["+ i +"]:");
				sexo[i] = br.readLine().toUpperCase().charAt(0);
			}while(sexo[i] != 'F' && sexo[i] != 'M');
		}
		
		//Reportar datos
		System.out.println("\n*Reporte datos*");
		for(i = 0; i < N; i++){
			System.out.println("Nombre["+i+"]: "+nombre[i]);
			System.out.println("Sexo["+i+"]: "+sexo[i]);
		}
		
		//Reportar cantidad alumnos hombres y mujeres
		System.out.println("\n*Reporte de cantidad de alumnos *");
		for(i = 0; i < N; i++){
			if(sexo[i] == 'M'){
				cantHombres++;
			}
			/*
			 else
			 	cantMujeres++
			 */	
		}
		cantMujeres = N - cantHombres;
		System.out.println("\nLos alumnos hombres son "+cantHombres);
		System.out.println("\nLas alumnas mujeres son "+cantMujeres);
		
	}
	
}