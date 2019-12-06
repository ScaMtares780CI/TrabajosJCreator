import java.io.*;
public class T5
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
 {int vctrA[]=new int[50];
  int vctrB[]=new int[50];
  int N;
  
  	N=leerN();
  	ingresar(vctrA,vctrB,N);
  	reportarPro(vctrA,vctrB,N);
  }
  
	static int leerN()throws IOException
  	{int N;
		do{
			System.out.print("Ingrese cantidad de datos: ");
			N=Integer.parseInt(br.readLine());
		}while(N<=0||N>50);
	return N;
	}
	
	static void ingresar(int vctrA[],int vctrB[],int N)throws IOException
	{int i;
		System.out.println("***INGRESO DE DATOS***");
		System.out.println("***Primer vector: ***");
 		for(i=0;i<N;i++){
 			do{
	 			System.out.print("Vector A ["+i+"]: ");
	 			vctrA[i]=Integer.parseInt(br.readLine());
 			}while(vctrA[i]<=0);
 		}
 		System.out.println("***Segundo vector: ***");
 		for(i=0;i<N;i++){
 			do{
	 			System.out.print("Vector B ["+i+"]: ");
	 			vctrB[i]=Integer.parseInt(br.readLine());
 			}while(vctrB[i]<=0);
 		}
	return ;
	}
	
	static void reportarPro(int vctrA[],int vctrB[],int N)throws IOException
	{int i,pro,vctrC=0;
		System.out.println("***REPORTE DEL PRODUCTO ESCALAR***");
		for(i=0;i<N;i++){
			pro=vctrA[i]*vctrB[i];
			System.out.println("El producto escalar de("+vctrA[i]+") y ("+vctrB[i]+") es: "+pro);
			vctrC=vctrC+pro;
		}
		System.out.println("EL PRODUCTO ESCALAR ES: "+vctrC);
	return ;
	}
}
