/*
 * Ingresar el nombre y precio de N alumnos y reportar:
 *	A.Los datos de los productos con precio mayor a 100.Indicar cuantos son.
 *	B.Los datos de los p´roductos con precio menor o igual a 100.Indicar cuanto suman estos precios.
 *	C.El precio mayor
 *	D.Los datos de los productos cuyo precio es el mayor.Indicar cuantos son.
*/
import java.io.*;
public class ejercicio4	{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[]args)throws IOException	{
		int precio[] = new int[20];
		String nombre[] = new String[20];
		int N,i,cm = 0,s = 0,mayor;
		String prodPrecioMayor;
		
		//Leer N
		do{
			System.out.print("Ingrese cantidad de datos N=");
			N = Integer.parseInt(br.readLine());
		}while(N<=0 || N>20);
		
		//Ingresar datos nombre y precio de producto
		for(i = 0; i < N; i++){
			System.out.print("Ingrese nombre["+ i +"]:");
			nombre[i] = br.readLine();
			do{
				System.out.print("Ingrese precio["+ i +"]:");
				precio[i] = Integer.parseInt(br.readLine());
			}while(precio[i] <= 0);
		}
		
		//Reportar datos
		System.out.println("\n*Reporte de todos los productos*");
		for(i = 0; i < N; i++){
			System.out.println("Nombre["+i+"]: "+nombre[i]);
			System.out.println("Precio["+i+"]: "+precio[i]);
		}
		
		//Reportar productos con precio mayor a 100
		System.out.println("\n*Reporte de productos con precio mayor a 100*");
		for(i = 0; i < N; i++){
			if(precio[i] > 100){
				System.out.println("Nombre["+i+"]: "+nombre[i]);
				System.out.println("Precio["+i+"]: "+precio[i]);
				cm++;
			}
		}
		System.out.println("\nLa cantidad de productos con precio mayor a 100 son "+cm);
		
		//Reportar productos con precio menor o igual a 100
		System.out.println("\n*Reporte de productos con precio menor o igual a 100*");
		for(i = 0; i < N; i++){
			if(precio[i] <= 100){
				System.out.println("Nombre["+i+"]: "+nombre[i]);
				System.out.println("Precio["+i+"]: "+precio[i]);
				s += precio[i];
			}
		}
		System.out.println("\nLa suma de los precios de los productos con precio menor o igual a 100 es "+s);
		
		//Precio mayor
		System.out.println("\n*Reporte de precio mayor*");
		mayor = precio[0];
		prodPrecioMayor = nombre[0];
		for(i = 0; i < N; i++){
			if(precio[i] > mayor){
				mayor = precio[i];
				prodPrecioMayor = nombre[i];
			}
		}
		System.out.println("\nEl precio mayor es "+mayor + " cuyo producto es " + prodPrecioMayor);
	}	
}