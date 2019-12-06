import java.io.*;
public class Trab3
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
 {int not[]= new int[60] ;
  int N,i,sum=0,prom,men,may;
	
	do{
		System.out.print("Ingrese cantidad de datos: ");
		N=Integer.parseInt(br.readLine());
	}while(N<=0||N>60);
	
	for(i=0;i<N;i++)
	{
			do{
				System.out.print("Ingrese nota ["+i+"]: ");
				not[i]=Integer.parseInt(br.readLine());
			}while(not[i]<0||not[i]>20);
	}
	
	System.out.println("\n***Reporte de la nota promedio***");
	for(i=0;i<N;i++)
	{
		sum=sum+not[i];
	}
	prom=sum/N;
	System.out.println("El promedio es: "+prom);
	
	men=not[0];
	System.out.println("\n***Reporte de la nota menor***");
	for(i=0;i<N;i++)
	{
		if(not[i]<men){
			men=not[i];
		}
	}
	System.out.println("La nota menor es: "+men);
	
	may=not[0];
	System.out.println("\n***Reporte de la nota mayor***");
	for(i=0;i<N;i++)
	{
		if(not[i]>may){
			may=not[i];
		}
	}
	System.out.println("La nota mayor es: "+may);
 }
}
