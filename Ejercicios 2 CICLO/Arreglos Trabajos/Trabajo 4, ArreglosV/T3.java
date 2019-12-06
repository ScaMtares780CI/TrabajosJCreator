import java.io.*;
public class T3
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
 {int arrA[]=new int[50];
  int arrB[]=new int[50];
  int arrC[]=new int[50];
  int N;
  
  	N=leerN();
  	ingresar(arrA,arrB,N);
  	reportarTodo(arrA,arrB,arrC,N);
  }
  
	static int leerN()throws IOException
  	{int N;
		do{
			System.out.print("Ingrese cantidad de datos: ");
			N=Integer.parseInt(br.readLine());
		}while(N<=0||N>50);
	return N;
	}
	
	static void ingresar(int arrA[],int arrB[],int N)throws IOException
	{int i;
		System.out.println("***INGRESO DE DATOS***");
 		for(i=0;i<N;i++){
 			do{
	 			System.out.print("Arreglo A ["+i+"]: ");
	 			arrA[i]=Integer.parseInt(br.readLine());
 			}while(arrA[i]<=0);
 			do{
	 			System.out.print("Arreglo B ["+i+"]: ");
	 			arrB[i]=Integer.parseInt(br.readLine());
 			}while(arrB[i]<=0);
 		}
	return ;
	}
	
	static void reportarTodo(int arrA[],int arrB[],int arrC[],int N)throws IOException
	{int i;
		System.out.println("***REPORTE ***");
		for(i=0;i<N;i++){
			arrC[i]=arrA[i]+arrB[i];
			System.out.println("La suma del arreglo A ("+arrA[i]+") y el arreglo B("+arrB[i]+")es: "+arrC[i]);
			}
		
	return ;
	}
}
