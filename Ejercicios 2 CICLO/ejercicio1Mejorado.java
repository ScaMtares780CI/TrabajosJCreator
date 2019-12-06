/*Elaborar un programa que maneje datos de N alumnos
 *(nombre,edad,sexo,nota)y realizar lo siguiente:
 *1.Ingresar Datos
 *2.Reportar datos
 *3.Buscar alumno por nombre
 *4.Modificar datos de alumno
			 *¿Que desea modificar?
			 *1.Nombre
 			*2.Edad
 			*3.Sexo
 			*4.Nota
 *5.Eliminar alumno(eliminar alumnos que tengan el mismo nombre)
 *6.Salir*/
 
 import java.io.*;
 public class ejercicio1Mejorado	{
 	static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
 	
 	public static void main(String[]args)throws IOException	{
	 	int ed[] = new int[10];
	 	String nomb[] = new String[10];
	 	char sex[] = new char[10];
	 	int nota[] =  new int[10];
	 	int op,pos,num,N=0;
	 	String nomaux;
	 	
	 	do	{
	 		op = menu();
	 		switch(op)	{
	 			case 1:
	 				N = leerN();
	 				ingresar(N,nomb,ed,sex,nota);
	 				break;
	 			case 2:reportar(N,nomb,ed,sex,nota);
	 				break;
	 			case 3:
	 				if(N>0)	{
		 				System.out.print("Ingrese nombre que busca:");
		 				nomaux =  br.readLine().toUpperCase();
		 				pos = buscar(N,nomb,nomaux);
		 				if(pos !=1)
		 					System.out.print("No existe dato!");
		 				else
		 					System.out.print("Existe dato!");
	 				}
		 			else
	 					System.out.println("Ingrese primero los datos en opcion 1.");
	 				break;
	 			case 4:
	 				if(N>0)	{
		 				System.out.print("Ingrese nombre que busca:");
		 				nomaux =  br.readLine().toUpperCase();
		 				modificar(N,nomb,ed,sex,nota,nomaux);
	 				}
	 				else
	 					System.out.println("Ingrese primero los datos en opcion 1.");
	 				break;
	 			case 5:
	 				if(N>0)	{
		 				System.out.print("Ingrese nombre que busca:");
		 				nomaux =  br.readLine().toUpperCase();
		 				pos = buscar(N,nomb,nomaux);
	 					if(pos == -1)	{
	 						System.out.println("Dato no existe!");
	 					}
	 					else	{
			 				num = eliminar(N,nomb,ed,sex,nota,nomaux);
			 				N = num;
			 				System.out.println("La lista actual maneja datos de " + N + "alumnos.");
	 					}
	 				}
	 				else
	 					System.out.println("Ingrese primero los datos en opcion 1.");
	 				break;
	 			case 6:salir();
	 				break;	
	 		}
	 	}while(op != 6);
	 	
 	}
 
	 static int leerN()throws IOException{
	 	int N;
	 	do	{
	 		System.out.print("Ingrese cantidad de alumnos:");
	 		N = Integer.parseInt(br.readLine());
	 	}while(N<=0 || N>10);
	 	return N;
	 }
	 
	 static int menu()throws IOException{
 		int opc;
 		do	{
 			System.out.println("\nMENU");
	 		System.out.println("(1)Ingresar");
	 		System.out.println("(2)Reportar");
	 		System.out.println("(3)Buscar alumnos por nombre");
	 		System.out.println("(4)Modificar datos del alumno");
	 		System.out.println("(5)eliminar alumno");
	 		System.out.println("(6)Salir");
	 		System.out.print("Opcion(1-6):");
	 		opc = Integer.parseInt(br.readLine());
 		}while(opc < 1 || opc >6);
 		return opc;
 	}
 	
 	 static int miniMenu()throws IOException{
 		int opc;
 		do	{
 			System.out.println("\nMENU");
	 		System.out.println("(1)Nombre");
	 		System.out.println("(2)Edad");
	 		System.out.println("(3)Sexo");
	 		System.out.println("(4)Nota");
	 		System.out.print("Opcion(1-4):");
	 		opc = Integer.parseInt(br.readLine());
 		}while(opc < 1 || opc >4);
 		return opc;
 	}
 
	 static void ingresar(int N,String nomb[],int ed[],char sex[],int nota[])throws IOException{
	 	int i;
	 	for(i = 0; i < N;i++)	{
	 		System.out.print("Nombre["+i+"]:");
	 		nomb[i] =  br.readLine().toUpperCase();
	 		do	{System.out.print("Edad["+i+"]:");
	 			ed[i] =  Integer.parseInt(br.readLine());
	 		}while(ed[i]<=0 || ed[i]>100);
	 		do	{System.out.print("Sexo["+i+"]:");
	 			sex[i] =  br.readLine().toUpperCase().charAt(0);
	 		}while(sex[i]!='F' && sex[i]!='M' );
	 		do	{System.out.print("Nota["+i+"]:");
	 			nota[i] =  Integer.parseInt(br.readLine());
	 		}while(nota[i]<0 || nota[i]>20 );
	 	}
	 	return;
	 }
 
	 static void reportar(int N,String nomb[],int ed[],char sex[],int nota[])throws IOException	{
	 	int i;
	 	System.out.println("NOMBRE\tEDAD\tSEXO\tNOTA");
	 	for(i = 0; i < N ; i++)	{
	 		System.out.println(nomb[i]+"\t" + ed[i] + "\t" + sex[i] + "\t" + nota[i] );
	 	}
	 	return;
	 }
	 
	 static int buscar(int N,String nomb[],String nomaux)throws IOException{
	 	int pos= -1,i;
	 	for(i = 0 ; i < N; i++)	{
	 		if(nomb[i].compareTo(nomaux) == 0)	{
	 			pos = i;
	 			i = N;
	 		}	
	 	}
	 	return pos;
	 }
	 
	 static void modificar(int N,String nomb[],int ed[],char sex[],int nota[],String nomaux)throws IOException{
	 	int pos,opc;
	 	pos = buscar(N,nomb,nomaux);
	 	if(pos == -1)	{
	 		System.out.println("Dato no existe!");
	 	}
	 	else	{
	 		System.out.print("Que desea modificar?");
	 		
	 		opc = miniMenu();
	 		if(opc>= 1 && opc<=4)	{
	 			switch(opc)	{
	 				case 1 :
	 					System.out.print("Nombre["+pos+"]:");
		 				nomb[pos] =  br.readLine().toUpperCase();
	 					break;
	 				case 2 :
	 					do	{System.out.print("Edad["+pos+"]:");
		 					ed[pos] =  Integer.parseInt(br.readLine());
		 				}while(ed[pos]<=0 || ed[pos]>100);
		 				break;
	 				case 3 :
	 					do	{System.out.print("Sexo["+pos+"]:");
		 					sex[pos] =  br.readLine().toUpperCase().charAt(0);
		 				}while(sex[pos]!='F' && sex[pos]!='M' );
	 					break;
	 				case 4 :
	 					do	{System.out.print("Nota["+pos+"]:");
		 					nota[pos] =  Integer.parseInt(br.readLine());
		 				}while(nota[pos]<0 || nota[pos]>20) ;
		 				break;
	 		}
	 	}
	 }
	 	return;
	}
	 
	 static int eliminar(int N,String nomb[],int ed[],char sex[],int nota[],String nomaux)throws IOException{
	 	int i,pos = -1;
	 	for(i = 0 ; i <= N; i++){	//OJO!HE AQUÍ LA CLAVE <= para que elimine todos los que tengan el mismo nombre.
	 		if(nomb[i].compareTo(nomaux) == 0)	{
	 			pos = i;
	 			//Cambio dato que está al final ,lo coloco en pos
		 		nomb[pos] = nomb[N-1]; 
		 		ed[pos]  = ed[N-1];
		 		sex[pos]  = sex[N-1];
		 		nota[pos]  = nota[N-1];
		 		N=N-1;
	 		}	
	 	}
	 	
	 	//if(pos == -1)	{
	 	//	System.out.println("Dato no existe!");
	 	//}
	 	
	 	return N;
	 }
	 
	 static void salir()throws IOException{
	 	System.out.print("Fin del programa...");
	 	return;
	 }
 
 }