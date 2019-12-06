
/*Diseñar un algoritmo(diagramas N-S)utilizando arreglos,e implementar el codigo:
 *1.Ingresar la edad de N alumnos y reportar:
 *A.Todas las edades
 *B.Las edades de los mayores de edad.Indicar cuantos son
 *C.Las edades de los menores de edad.Indicar la suma de estas edades.
 *D.La edad promedio
 *E.Las edades menores o iguales al promedio.Indicar cuantas son.
 *F.La edad menor.
 **/

import java.io.*;
public class ejercicio1	{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[]args)throws IOException	{
		int ed[] = new int[100];
		int N,i,cm = 0,s = 0,sum = 0,pro,c = 0,men;
		
		//Leer N
		do{
			System.out.print("Ingrese cantidad de datos N=");
			N = Integer.parseInt(br.readLine());
		}while(N<=0 || N>100);
		
		//Ingresar datos
		for(i = 0; i < N; i++){
			do{
				System.out.print("Ingrese edad["+ i +"]:");
				ed[i] = Integer.parseInt(br.readLine());
			}while(ed[i] <= 0);
		}
		
		//Reportar datos
		System.out.println("\n*Reporte de todas las edades*");
		for(i = 0; i < N; i++){
			System.out.println("Edad["+i+"]: "+ed[i]);
		}
		
		//Reportar mayores
		System.out.println("\n*Reporte de edades mayores*");
		for(i = 0; i < N; i++){
			if(ed[i] >= 18){
				System.out.print("\nEdad["+i+"]: "+ed[i]);
				cm++;
			}
		}
		System.out.println("\nLos mayores de edad son "+cm);
		
		//Reportar menores
		System.out.println("\n*Reporte de edades menores*");
		for(i = 0; i < N; i++){
			if(ed[i] < 18){
				System.out.print("Edad["+i+"]: "+ed[i]);
				s += ed[i];
			}
		}
		System.out.println("\nLa suma de las edades de los menores de edad es "+s);
		
		
		//Edad promedio
		System.out.println("\n*Reporte de edad promedio*");
		for(i = 0; i < N; i++){
			sum += ed[i];
		}
		pro = sum/N;
		System.out.println("La edad promedio es "+pro);
		
		
		//Edades menores o iguales al promedio
		System.out.println("\n*Reporte de edades menores o iguales al promedio*");
		for(i = 0; i < N; i++){
			if(ed[i] <= pro){
				System.out.print("\nEdad["+i+"]: "+ed[i]);
				c++;
			}
		}
		System.out.println("\nLas edades menores o iguales al promedio son "+c);
		
		//Edad menor
		System.out.println("\n*Reporte de edad menor*");
		men = ed[0];
		for(i = 0; i < N; i++){
			if(ed[i] < men){
				men = ed[i];
			}
		}
		System.out.println("\nLa edad menor es "+men);
		
		
		
	}
	
	
	
}
