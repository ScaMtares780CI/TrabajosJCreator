import java.io.*;
public class Trab5
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
 {double num[]= new double[50];
  double numcuad[]=new double[50];
  int N,i;
	
	do{
		System.out.print("Ingrese cantidad de datos: ");
		N=Integer.parseInt(br.readLine());
	}while(N<=0||N>30);
	
	for(i=0;i<N;i++)
	{
		System.out.print("Ingrese numero ["+i+"]: ");
		num[i]=Double.parseDouble(br.readLine());
	}
	
	System.out.println("\n***Reporte de todos los datos***");
	for(i=0;i<N;i++)
	{
		numcuad[i]=num[i]*num[i];
		System.out.println("El doble del numero "+num[i]+" es:" +numcuad[i]);
	}
 }
}
