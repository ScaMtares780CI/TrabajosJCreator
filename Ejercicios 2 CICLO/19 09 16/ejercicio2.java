
/*
 *1.Ingresar las notas de N alumnos y reportar:
 *A.Todas las notas
 *B.Las notas aprobatorias.Indicar cuantos son
 *C.Las notas desaprobatorias.Indicar la suma de estas edades.
 *D.La nota promedio
 *E.Las notas mayores o iguales al promedio.Indicar cuantas son.
 *F.La nota mayor.
 **/

import java.io.*;
public class ejercicio2	{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[]args)throws IOException	{
		int nota[] = new int[20];
		int N,i,cm = 0,s = 0,sum = 0,pro,c = 0,mayor;
		
		//Leer N
		do{
			System.out.print("Ingrese cantidad de datos N=");
			N = Integer.parseInt(br.readLine());
		}while(N<=0 || N>100);
		
		//Ingresar datos
		for(i = 0; i < N; i++){
			do{
				System.out.print("Ingrese nota["+ i +"]:");
				nota[i] = Integer.parseInt(br.readLine());
			}while(nota[i] < 0 || nota[i] >20);
		}
		
		//Reportar datos
		System.out.println("\n*Reporte de todas las notas*");
		for(i = 0; i < N; i++){
			System.out.println("Nota["+i+"]: "+nota[i]);
		}
		
		//Reportar notas aprobatorias
		System.out.println("\n*Reporte de notas aprobatorias*");
		for(i = 0; i < N; i++){
			if(nota[i] >= 11 && nota[i]<=20){
				System.out.print("\nNota["+i+"]: "+nota[i]);
				cm++;
			}
		}
		System.out.println("\nLos notas aprobatorias son "+cm);
		
		//Reportar menores
		System.out.println("\n*Reporte de notas desaprobatoriass*");
		for(i = 0; i < N; i++){
			if(nota[i]>=0 && nota[i] < 11){
				System.out.print("Nota["+i+"]: "+nota[i]);
				s += nota[i];
			}
		}
		System.out.println("\nLa suma de las notas desaprobatorias son "+s);
		
		//Nota promedio
		System.out.println("\n*Reporte de nota promedio*");
		for(i = 0; i < N; i++){
			sum += nota[i];
		}
		pro = sum/N;
		System.out.println("La nota promedio es "+pro);
		
		
		//Notas mayores o iguales al promedio
		System.out.println("\n*Reporte de notas mayores o iguales al promedio*");
		for(i = 0; i < N; i++){
			if(nota[i] >= pro){
				System.out.print("\nNota["+i+"]: "+nota[i]);
				c++;
			}
		}
		System.out.println("\nLas notas mayores o iguales al promedio son "+c);
		
		//Nota mayor
		System.out.println("\n*Reporte de nota mayor*");
		mayor = nota[0];
		for(i = 0; i < N; i++){
			if(nota[i] > mayor){
				mayor = nota[i];
			}
		}
		System.out.println("\nLa nota mayor es "+mayor);
		
		
		
	}	
		

}