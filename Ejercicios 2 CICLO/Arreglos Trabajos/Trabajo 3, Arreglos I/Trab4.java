import java.io.*;
public class Trab4
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
 {String nom[]= new String[150] ;
  int N,i;
	
	do{
		System.out.print("Ingrese cantidad de datos: ");
		N=Integer.parseInt(br.readLine());
	}while(N<=0||N>150);
	
	for(i=0;i<N;i++)
	{
			System.out.print("Ingrese nombre ["+i+"]: ");
			nom[i]=br.readLine();
	}
	
	System.out.println("\nReporte de todos los datos");
	for(i=0;i<N;i++)
	{
		System.out.println("Nombre ["+i+"]: "+nom[i]);
	}
	
	System.out.println("\nReporte de todos los datos inversamente");
	for(i=N-1;i>=0;i=i-1)
	{
		System.out.println("Nombre ["+i+"]: "+nom[i]);
	}
	
 }
}
