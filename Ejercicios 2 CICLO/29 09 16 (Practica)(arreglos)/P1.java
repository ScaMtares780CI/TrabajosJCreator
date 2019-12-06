/*Ingresar N numeros enteros positivos en 2 arreglos A y B (como maximo 90 para cada uno) multiplica el elemento uno
 *del arreglo A con el eolemento uno del arreglo B y asi suycesivamente hasta N, almacenar elk resultafo en unarrglo C
 *e imprimir el arreglo A, el arreglo B y el arreglo resultante C.*/ 
import java.io.*;
public class P1
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
	{int arrA[]=new int[90];
	int arrB[]=new int[90];
	int arrC[]=new int[90];
	int N;
	N=LeerN();
	Ingresar(arrA,arrB,N);
	Reportar(arrA,arrB,arrC,N);
	}
	
	static int LeerN()throws IOException
	{int N;
		do{
			System.out.print("Ingrese cantidad de datos: ");
			N=Integer.parseInt(br.readLine());
		}while(N<=0);
	return N;
	}
	
	static void Ingresar(int arrA[],int arrB[],int N)throws IOException
	{int i;
		System.out.println("*Ingrese elementos del arreglo A*");
		for(i=0;i<N;i++){
			do{
				System.out.print("Ingrese el elemento["+i+"]: ");
				arrA[i]=Integer.parseInt(br.readLine());
			}while(arrA[i]<=0);
		}
		System.out.println("*Ingrese elementos del arreglo B*");
		for(i=0;i<N;i++){
			do{
				System.out.print("Ingrese el elemento["+i+"]: ");
				arrB[i]=Integer.parseInt(br.readLine());
			}while(arrB[i]<=0);
		}
	return;
	}
	
	static void Reportar(int arrA[],int arrB[],int arrC[],int N)throws IOException
	{int i;
		for(i=0;i<N;i++){
			arrC[i]=arrA[i]*arrB[i];
			System.out.println("\nLa multiplicacion del arreglo["+i+"] con los elementos "+arrA[i]+" y "+arrB[i]+" es: "+arrC[i]);
		}
	return;
	}
}