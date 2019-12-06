
import java.io.*;
public class T9
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
 {String nomc[]=new String[50];
  int notfc[]=new int[50];
  int nroAlum[]=new int[50];
 
  int N;
  
  N=LeerN();
  Ingresar(nomc,notfc,nroAlum,N);
  ntpcole(notfc,nroAlum,N);
  crs(nomc,nroAlum,N);
 }

 static int LeerN()throws IOException
 {int N;
  do{
	System.out.print("Ingrese cantidad de cursos: ");
	N=Integer.parseInt(br.readLine());
  }while(N<=0||N>50);
 return N;
 }

 static void Ingresar(String nomc[],int notfc[],int nroAlum[],int N)throws IOException
 {int i;
  for(i=0;i<N;i++){
	System.out.println("Ingrese nombre del curso["+i+"]: ");
	nomc[i]=br.readLine();
	do{
		System.out.println("Ingrese nota final del curso["+nomc[i]+"]: ");
		notfc[i]=Integer.parseInt(br.readLine());
	}while(notfc[i]<0||notfc[i]>20);
	do{
	System.out.println("Ingrese numero de alumnos del curso de ["+nomc[i]+"]: ");
	nroAlum[i]=Integer.parseInt(br.readLine());
	}while(nroAlum[i]<0||nroAlum[i]>100);
  }
 return;
 }

 static void ntpcole(int notfc[],int nroAlum[],int N)throws IOException
 {int i,sum=0,prom;
  for(i=0;i<N;i++){
 	sum=sum+notfc[i];
  }
 prom=sum/N;
 System.out.println("El promedio ponderado es: "+prom);
 return;
 }

 static void crs(String nomc[],int nroAlum[],int N)throws IOException
 {int i,may;
	System.out.println("El curso con mayor cantidad de alumnos");
	System.out.println("Es:");
  may=nroAlum[0];
  for(i=0;i<N;i++){
	if(nroAlum[i]>may){
	System.out.println("/n"+nomc[i]);
	}
  return;
  }
 }
 
}