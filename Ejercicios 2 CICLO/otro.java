/*Programa usando arreglos y metodos que permita:
 *1)Ingresar nombre edad, sexo y nota de N alumnos
 *2)Reportar todos los datos
 *3)Reportar los datos de los alumnos hombres
 *4)Reportar los datos de las alumnas mujeres aprobadas
 *5)Reportar los datos de los alumnos con nota < nota promedio
 *6)Reportar los datos de un alumno determinado
 *preguntando de nuevo*/
 
import java.io.*;
public class otro
{static BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
public static void main (String[]args)throws IOException
 /////////////////////////////METODO PRINCIPAL/////////////////////////////
 {	 String nom[]=new String[100];
	 int ed[]=new int[100];
	 char sex[]=new char[100];
	 double not []=new double[100];
	 int N;
	 
	 N=leerN();
	 ingresar(nom,ed,sex,not,N);
	 reportarTodo(nom,ed,sex,not,N);
	 reportarH(nom,ed,sex,not,N);
	 reportarMP(nom,ed,sex,not,N);
	 reportarNMP(nom,ed,sex,not,N);
	 reportarAD(nom,ed,sex,not,N);
 //////////////////////////////////////////////////////////////////////////
 }
 /**************************************************/
 static int leerN()throws IOException
 {int N;
 	do{
 		System.out.print("Ingrese cantidad de datos: ");
 		N=Integer.parseInt(br.readLine());
 	}while(N<=0||N>100);
 return N;
 }
 /**************************************************/
 static void ingresar(String nom[],int ed[],char sex[], double not[],int N)throws IOException
 {int i;
 	System.out.println("***INGRESO DE DATOS***");
 	for(i=0;i<N;i++){
 		System.out.print("Nombre["+i+"]: ");
 		nom[i]=br.readLine();
 		do{
 			System.out.print("Edad["+i+"]: ");
 			ed[i]=Integer.parseInt(br.readLine());
 		}while(ed[i]<=0||ed[i]>100);
 		do{
 			System.out.print("Sexo["+i+"]: ");
 			sex[i]=br.readLine().toUpperCase().charAt(0);
 		}while(sex[i]!='F'&&sex[i]!='M');
 		do{
 			System.out.print("Nota["+i+"]: ");
 			not[i]=Double.parseDouble(br.readLine());
 		}while(not[i]<0||not[i]>20);	
 	}
 return;
 }
 /**************************************************/
 static void reportarTodo(String nom[],int ed[],char sex[], double not[],int N)throws IOException
 {int i;
 System.out.println("\n***REPORTE DE TODOS LOS DATOS***");
 System.out.println("\nNOMBRE\tEDAD\tSEXO\tNOTA");
 	for(i=0;i<N;i++){
 		System.out.print("\n"+nom[i]+"\t"+ed[i]+"\t\t"+sex[i]+"\t\t"+not[i]);
 	}
 	return;
 }
 /**************************************************/
 static void reportarH(String nom[],int ed[],char sex[], double not[],int N)throws IOException
 {int i;
 System.out.println("\n***REPORTE DE LOS DATOS DE ALUMNOS HOMBRES***");
 System.out.println("\nNOMBRE\tEDAD\tSEXO\tNOTA");
	 	for(i=0;i<N;i++){
	 		if(sex[i]=='M'){
	 			System.out.print("\n"+nom[i]+"\t"+ed[i]+"\t\t"+sex[i]+"\t\t"+not[i]);
	 	}
 	}
 	return;
 }
 /**************************************************/
 static void reportarMP(String nom[],int ed[],char sex[], double not[],int N)throws IOException
 {int i;
 System.out.println("\n***REPORTE DE LOS DATOS DE ALUMNAS MUJERES APROBADAS***");
 System.out.println("\nNOMBRE\tEDAD\tSEXO\tNOTA");
	for(i=0;i<N;i++){
		if(sex[i]=='F'){
 			if(not[i]>=11){
		 		System.out.print("\n"+nom[i]+"\t"+ed[i]+"\t\t"+sex[i]+"\t\t"+not[i]);
		 	}
 		}
 	}
 	return;
 }
 /**************************************************/
 static void reportarNMP(String nom[],int ed[],char sex[], double not[],int N)throws IOException
 {int i;
  double np,sn=0;
  System.out.println("\n***REPORTE DE LOS DATOS DE ALUMNOS CON NOTA < NOTA PROMEDIO***");
  System.out.println("\nNOMBRE\tEDAD\tSEXO\tNOTA");
	 for(i=0;i<N;i++){
	 	sn=sn+not[i];
 		np=sn/N;
 		if(not[i]<np){
	 		System.out.print("\n"+nom[i]+"\t"+ed[i]+"\t\t"+sex[i]+"\t\t"+not[i]);
	 	}
 	}
 	return;
 }
 /**************************************************/
 static void reportarAD(String nom[],int ed[],char sex[], double not[],int N)throws IOException
 {String nombre;
  int i, pos=-1;
  System.out.println("\n***REPORTE DE LOS DATOS DE UN ALUMNOS DETERMINADO***");
  do{ 
  	  pos=-1;
	  System.out.println("Ingrese nombre de alumno a buscar: ");
	  nombre=br.readLine();
	  System.out.println("\nReporte de los datos del alumno: "+nombre+"\n");
	  System.out.println("\nNOMBRE\tEDAD\tSEXO\tNOTA");
		 	for(i=0;i<N;i++){
			 	if(nom[i].compareTo(nombre)==0)
			 		{
			 			pos=i;
			 			break;
			 		}
			}
			if(pos==-1){
				System.out.print("Este alumno no existe");
			}
			else{
				System.out.print("\n"+nom[i]+"\t"+ed[i]+"\t\t"+sex[i]+"\t\t"+not[i]);
			}
	}while(pos==-1);
  return;
 }
}