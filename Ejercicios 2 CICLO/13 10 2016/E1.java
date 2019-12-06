/*Elaborar un programa en Java que maneje datos de N alumnos
 *(nombre,edad,sexo,nota) y que permita realizar lo sgte.:
 *-Ingrasar datos
 *-Reportar datos
 *-Buscar alumno por nombre
 *-Modificar datos del alumno
 *-Eliminar alumno*/
import java.io.*;
public class E1
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
	{String nom[]=new String[100];
	 int ed[]=new int[100];
	 char sex[]=new char[100];
	 int not[]=new int[100];
	 int N=0,opc,pos=-1,num;
	 
	  do{
	  	opc=menu();
	  	switch(opc)
	  	{
	  		case 1: N=leerN();
	  				ingresar(nom,ed,sex,not,N);
	  				break;
	  		/////
	  		case 2: if(N>0){
	  					reportar(nom,ed,sex,not,N);
	  				}
	  				else{
	  					System.out.println("\n Primero debe ingresar la opcion 1");
	  				}
	  				break;

	  		case 3: if(N>0){
						buscar(nom,ed,sex,not,N);
		  			}
		  			else{
		  				System.out.println("\n Primero debe ingresar la opcion 1");
		  			}
		  			break;
		  	case 4: if(N>0){
		  					pos=buscar(nom,ed,sex,not,N);
							modificar(nom,ed,sex,not,N,pos);
	  					}
	  					else{
	  						System.out.println("\n Primero debe ingresar la opcion 1");
	  					}
	  					break;
	  		case 5: if(N>0){
	  						pos=buscar(nom,ed,sex,not,N);
							num=eliminar(nom,ed,sex,not,N,pos);
							N=num;
							System.out.println("La cantidad de datos actual es= "+N);
		  				}
		  				else{
		  					System.out.println("\n Primero debe ingresar la opcion 1");
		  				}
		  				break;

	  		case 6: terminar();
	  				break;
	  	}
	  }while(opc!=6);
	}
	///////////////////////////////////////////////////////////////////////////////
	static int menu()throws IOException
	{int opc;
		do{
			System.out.println("------------------------MENÚ--------------------------");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("[1] Ingresar");
			System.out.println("[2] Reportar");
			System.out.println("[3] Buscar");
			System.out.println("[4] Modificar");
			System.out.println("[5] Eliminar");
			System.out.println("[6] Terminar");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Seleccione opcion:");
			opc=Integer.parseInt(br.readLine());
		}while(opc<1 || opc>6);
	 return opc;
	}
/////////////////////////////////////////////////////////////////////////////////
	static int leerN() throws IOException
	{int N;
		do{
			System.out.println("Ingrese cantidad: ");
			N=Integer.parseInt(br.readLine());
		}while(N<=0||N>100);
	return N;
	}
	///////////////////////////////////////////////
	static void ingresar(String nom[],int ed[],char sex[],int not[],int N)throws IOException
	{int i;
		System.out.println("***Ingreso de datos***");
		for(i=0;i<N;i++){
			System.out.print("Ingrese nombre ["+i+"]: ");
			nom[i]=br.readLine();
			do{
				System.out.print("Ingrese edad ["+i+"]: ");
				ed[i]=Integer.parseInt(br.readLine());
			}while(ed[i]<0||ed[i]>100);
			do{
				System.out.print("Ingrese sexo ["+i+"]: ");
				sex[i]=br.readLine().toUpperCase().charAt(0);
			}while(sex[i]!='F'&&sex[i]!='M');
			do{
				System.out.print("Ingrese nota ["+i+"]: ");
				not[i]=Integer.parseInt(br.readLine());
			}while(not[i]<0||not[i]>20);			
		}
	return;
	}
	////////////////////////////////////////
	static void reportar(String nom[],int ed[],char sex[],int not[],int N)throws IOException
	{int i;
		System.out.println("***Reporte de datos***");
		System.out.println("\tNOMBRE\tEDAD\tSEXO\tNOTA");
		for(i=0;i<N;i++){
			System.out.println("\t"+nom[i]+"\t"+ed[i]+"\t"+sex[i]+"\t"+not[i]);;
		}
	return;
	}
	//////////////////////////////////////
	static int buscar(String nom[],int ed[],char sex[],int not[],int N)throws IOException
	{int i,pos=-1;
	 String nomX;
		System.out.println("***Busqueda de datos***");
		System.out.println("Ingrese nombre: ");
		nomX=br.readLine();
		for(i=0;i<N;i++){
			if(nom[i].compareTo(nomX)==0){
				pos=i;
				i=N;
			}
		}
		if(pos==-1){
			System.out.println("Dato buscado no existe");
		}
		else{
			System.out.println("\tNOMBRE\tEDAD\tSEXO\tNOTA");
			System.out.println("\t"+nom[pos]+"\t"+ed[pos]+"\t"+sex[pos]+"\t"+not[pos]);
		}
	return pos;
	}
	///////////////////////////////////////////////////////////////////////////////////////
	static void modificar(String nom[],int ed[],char sex[],int not[],int N,int pos)throws IOException
	{int i;
	 String nomX;
		System.out.println("***Modificar datos***");
			if(pos==-1){
				System.out.println("NO EXISTE");
			}
			else{
				System.out.print("Ingrese nuevo nombre["+pos+"]: ");
				nom[pos]=br.readLine();
				do{
					System.out.println("Ingrese nueva edad ["+pos+"]: ");
					ed[pos]=Integer.parseInt(br.readLine());
				}while(ed[pos]<0||ed[pos]>100);
				do{
					System.out.println("Ingrese nuevo sexo ["+pos+"]: ");
					sex[pos]=br.readLine().toUpperCase().charAt(0);
				}while(sex[pos]!='F'&&sex[pos]!='M');
				do{
					System.out.println("Ingrese nota ["+pos+"]: ");
					not[pos]=Integer.parseInt(br.readLine());
				}while(not[pos]<0||not[pos]>20);
			}
	return;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	static int eliminar(String nom[],int ed[],char sex[],int not[],int N,int pos)throws IOException
	{int i;
		System.out.println("***Eliminar datos***");
			for(i=0;i<N;i++){
				if(pos==-1){
				System.out.println("NO EXISTE");
				}
				else{
					nom[pos]=nom[N-1];
					ed[pos]=ed[N-1];
					sex[pos]=sex[N-1];
					not[pos]=not[N-1];
					N=N-1;
				}
			}
	return N;
	}
	///////////////////////////////////////////////////////////
	static void terminar()throws IOException
	{
		System.out.println("Fin del programa...ADIOS");
		return;
	}
}