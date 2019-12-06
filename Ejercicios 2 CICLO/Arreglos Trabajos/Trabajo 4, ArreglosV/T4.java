import java.io.*;
public class T4
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
 {int arrX[]=new int[80];
  int arrZ[]=new int[80];
  int N;
  
  	N=leerN();
  	ingresar(arrX,arrZ,N);
  	reportarmsj(arrX,arrZ,N);
  }
  
	static int leerN()throws IOException
  	{int N;
		do{
			System.out.print("Ingrese cantidad de datos: ");
			N=Integer.parseInt(br.readLine());
		}while(N<=0||N>80);
	return N;
	}
	
	static void ingresar(int arrX[],int arrZ[],int N)throws IOException
	{int i;
		System.out.println("***INGRESO DE DATOS***");
 		for(i=0;i<N;i++){
 			do{
	 			System.out.print("Arreglo X ["+i+"]: ");
	 			arrX[i]=Integer.parseInt(br.readLine());
 			}while(arrX[i]<=0);
 			do{
	 			System.out.print("Arreglo Z ["+i+"]: ");
	 			arrZ[i]=Integer.parseInt(br.readLine());
 			}while(arrZ[i]<=0);
 		}
	return ;
	}
	
	static void reportarmsj(int arrX[],int arrZ[],int N)throws IOException
	{int i;
		System.out.println("***REPORTE ***");
		for(i=0;i<N;i++){
			if(arrX[i]==arrZ[i]){
				System.out.println("\nArreglo "+i+": Son iguales");
			}
			else{
				System.out.println("\nArreglo "+i+": Son diferentes");
			}
		}
	return ;
	}
}
