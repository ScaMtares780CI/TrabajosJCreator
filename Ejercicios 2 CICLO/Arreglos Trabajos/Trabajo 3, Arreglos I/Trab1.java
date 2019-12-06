import java.io.*;
public class Trab1
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
 {int num[]= new int[30] ;
  int N,sum=0,prom,dif=0,i;
	
	do{
		System.out.print("Ingrese cantidad de datos: ");
		N=Integer.parseInt(br.readLine());
	}while(N<=0||N>30);
	
	for(i=0;i<N;i++)
	{
		do{
			System.out.print("Ingrese dato ["+i+"]: ");
			num[i]=Integer.parseInt(br.readLine());
		}while(num[i]<=0);
	}
	
	System.out.println("\n***Reporte de todos los datos***");
	for(i=0;i<N;i++)
	{
		System.out.println("Numero ["+i+"]: "+num[i]);
	}
	
	System.out.println("\n***Reporte del promedio de los datos***");
	for(i=0;i<N;i++)
	{
		sum=sum+num[i];
	}
	prom=sum/N;
	System.out.print("Promedio es: "+prom);
	
	System.out.println("\n***Reporte de la diferencia***");
	System.out.print("La diferencia de cada entero con respecto al promedio es: ");
	for(i=0;i<N;i++)
	{
			dif=num[i]-prom;
			System.out.print("\n\tDiferencia de ["+i+"] es:"+dif);
	}
 }
}
