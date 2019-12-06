import java.io.*;
public class Trab2
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
 {int num[]= new int[100] ;
  int N,i,cc=0,cn=0,cp=0,sumn=0,sump=0;
	
	do{
		System.out.print("Ingrese cantidad de datos: ");
		N=Integer.parseInt(br.readLine());
	}while(N<=0||N>100);
	
	for(i=0;i<N;i++)
	{
			System.out.print("Ingrese dato ["+i+"]: ");
			num[i]=Integer.parseInt(br.readLine());
	}
	
	System.out.println("\n***Reporte cantidad de ceros***");
	for(i=0;i<N;i++)
	{
		if(num[i]==0){
			cc=cc+1;
		}
	}
	System.out.println("Hay "+cc+" ceros");
	
	System.out.println("\n***Reporte cantidad de negativos***");
	for(i=0;i<N;i++)
	{
		if(num[i]<0){
			cn=cn+1;
		}
	}
	System.out.println("Hay "+cn+" negativos");
	
	System.out.println("\n***Reporte cantidad de positivos***");
	for(i=0;i<N;i++)
	{
		if(num[i]>0){
			cp=cp+1;
		}
	}
	System.out.println("Hay "+cp+" positivos");
	
	System.out.println("\n***Reporte la suma de negativos***");
	for(i=0;i<N;i++)
	{
		if(num[i]<0){
			sumn=sumn+num[i];
		}
	}
	System.out.println("La suma de los negativos es: "+sumn);
	
	System.out.println("\n***Reporte la suma de positivos***");
	for(i=0;i<N;i++)
	{
		if(num[i]>0){
			sump=sump+num[i];
		}
	}
	System.out.println("La suma de los positivos es: "+sump);
 }
}
