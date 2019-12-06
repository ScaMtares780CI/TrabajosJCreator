/*Implementar un programa que lea nombre y nota de un alumno en N cursos, las almacene en un vector respectivamente
 *y calcule e imprima la nota promedio y luego las notas y nombres de los cursos en las que su nota es menor o igual que 
 *el promedio e indicar cuantas son.*/ 
import java.io.*;
public class P2
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
	{String nom[]=new String[100];
	int not[]=new int[100];
	int N,prom;
	N=LeerN();
	Ingresar(nom,not,N);
	prom=Reportarprom(nom,not,N);
	ReportarOt(nom,not,N,prom);
	}
	
	static int LeerN()throws IOException
	{int N;
		do{
			System.out.print("Ingrese cantidad de datos: ");
			N=Integer.parseInt(br.readLine());
		}while(N<=0);
	return N;
	}
	
	static void Ingresar(String nom[],int not[],int N)throws IOException
	{int i;
		for(i=0;i<N;i++){
				System.out.print("Ingrese el nombre del curso["+i+"]: ");
				nom[i]=br.readLine();
				do{
				System.out.print("Ingrese la nota de["+nom[i]+"]: ");
				not[i]=Integer.parseInt(br.readLine());
				}while(not[i]<0||not[i]>20);
		}
	return;
	}
	
	static int Reportarprom(String nom[],int not[],int N)throws IOException
	{int i,sum=0,prom;
			for(i=0;i<N;i++){
				sum=sum+not[i];
			}
		prom=sum/N;
		System.out.println("\nLa nota promedio es: "+prom);
	return prom;
	}
	
	
	static void ReportarOt(String nom[],int not[],int N,int prom)throws IOException
	{int i,sumP=0;
		System.out.println("\nNOTAS Y NOMBRES DE LOS CURSOS <= AL PROMEDIO");
		for(i=0;i<N;i++){
			if(not[i]<=prom){
				System.out.println("\nNombre del curso: "+nom[i]);
				System.out.println("\nNota: "+not[i]);				
				sumP=sumP+1;
			}
		}
		System.out.println("\n---Y son: "+sumP);
	return;
	}
}