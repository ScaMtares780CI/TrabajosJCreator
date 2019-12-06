///Anggie Núñez López///
/*1.Escribir un programa que presente un menu de opciones que permita realizar alguna de las sgtes tareas mientras no se desee terminar:
 *'L'Ingresar datos de una matriz de orden NxN(de numeros enteros positivos).Se permite solo una vez.
 *'R'Reportar la matriz (como matriz )solo si hay datos ingresados,si no mostrar un mensaje"No hay datos."
 *'S'Reportar la suma de los datos de la matriz solo si hay datos si no mostrar mensaje"No hay datos"
 *'D'Reportar la matriz diagonal solo si hay datos si no mostrar mensaje"No hay datos"
 *'P'Reportar solamente los numeros pares de la matriz solo si hay datos si no mostrar mensaje"No hay datos"
 *'I'Reportar la matriz diagonal inferior solo si hay datos si no mostrar mensaje"No hay datos"
 *'Terminar'
 */
 import java.io.*;
 public class ejercicio1anggie	{
 static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));	
 public static void main(String[]args)throws IOException	{
 		int fil,col,marcadoOpL = 0,sum = 0;
 		char op;
	 	int m[][] = new int[10][10];
	 	do	{
			 	fil = leer("filas");
			 	col = leer("columnas");
			 	if(fil == col )	{	//Es una matriz de orden NxN
					 	do	{
					 		op = menu();
					 		switch(op)	{
					 			case 'L': 
						 				if(marcadoOpL==1)	{
						 					System.out.println("Solo se permite una vez!");
						 				}
						 				else{
							 				ingresar(m,fil, col);
							 				marcadoOpL++;
						 				}
						 				break;
						 				
					 			case 'R':
					 					if(marcadoOpL>0)
						 					reportar(m,fil, col);
						 				else
						 					System.out.println("No hay datos!");
					 		
						 				break;
					 				
					 			case 'S':
						 				if(marcadoOpL>0)	{
						 					sum = suma(m,fil, col);
						 					System.out.println("La suma de los datos de la matriz es : " + sum);
						 				}
						 				else
						 					System.out.println("No hay datos!");
						 				break;
						 				
						 		case 'D':
						 				if(marcadoOpL>0)
						 					diagonal(m,fil, col);
						 				else
						 					System.out.println("No hay datos!");
						 				break;
						 				
						 		case 'P':
						 				if(marcadoOpL>0)
						 					pares(m,fil, col);
						 				else
						 					System.out.println("No hay datos!");
						 				break;
						 				
						 		case 'I':
						 				if(marcadoOpL>0)
						 					inferior( m, fil, col);
						 				else
						 					System.out.println("No hay datos!");
						 				break;
					 				
					 			case 'T': 
					 				terminar();
					 				break;
					 		}
					 	}while(op != 'T');
			 	}
			 	else	{
			 		System.out.println("ERROR:El numero de filas debe ser igual al numero de columnas(Orden de la matriz NxN)!");
			 	}
	 	}while(fil != col);
	 	
}
 
	 static int leer(String dato)throws IOException{
	 	int N;
	 	do	{
	 		System.out.print("Ingrese numero de " + dato + " :");
	 		N = Integer.parseInt(br.readLine());
	 	}while(N<=0 || N>10);
	 	return N;
	 }
	 
	 static char menu()throws IOException{
 		char op;
 		do	{
 			System.out.println("\nMENU");
	 		System.out.println("(L)Ingresar");
	 		System.out.println("(R)Reportar datos");
	 		System.out.println("(S)Reportar suma");
	 		System.out.println("(D)Reportar matriz diagonal");
	 		System.out.println("(P)Reportar numeros pares");
	 		System.out.println("(I)Reportar matriz diagonal inferior");
	 		System.out.println("(T)Terminar");
	 		System.out.print("Opcion:");
	 		op = br.readLine().toUpperCase().charAt(0);
 		}while( (op != 'L') && (op != 'R') && (op != 'S') && (op != 'D') && (op != 'P') && (op != 'I') && (op != 'T') );
 		return op;
 	}
 
	 static void ingresar(int m[][],int f, int c)throws IOException{
	 	int i,j;
	 	for(i = 0; i < f;i++)	{
	 		for(j = 0; j < c; j++)	{
	 			do	{
	 				System.out.print("m[ "+ i +" ][ "+ j + " ] :");
	 				m[i][j] =  Integer.parseInt(br.readLine());
	 			}while(m[i][j]<=0);
	 		}
	 	}
	 	return;
	 }
 
	 static void reportar(int m[][],int f, int c)throws IOException	{
	 	int i,j;
	 	for(i = 0; i < f; i++)	{
	 		for(j = 0; j < c; j++)	{
	 			System.out.print(m[i][j]);
	 		}
	 		System.out.print("\n");
	 	}
	 	return;
	 }
	 
	 static int suma(int m[][],int f, int c)throws IOException{
	 	int sum = 0,i,j;
	 	for(i = 0 ; i < f; i++)	{
	 		for(j = 0; j < c; j++)	{
	 			sum = sum + m[i][j] ;
	 		}
	 	}
	 	return sum;
	 }
	 
	 static void diagonal(int m[][],int f, int c)throws IOException	{
	 	int i,j;
	 	for(i = 0; i < f; i++)	{
	 		for(j = 0; j < c; j++)	{
	 			if(i == j)	
	 				System.out.print(m[i][j]);
	 			
	 			else
	 				System.out.print("_");
	 		}
	 		System.out.print("\n");
	 	}
	 	return;
	 }
	 
	 static void pares(int m[][],int f, int c)throws IOException	{
	 	int i,j;
	 	for(i = 0; i < f; i++)	{
	 		for(j = 0; j < c; j++)	{
	 			if( m[i][j] % 2 == 0)	
	 				System.out.print(m[i][j]);
	 			else
	 				System.out.print("_");
	 		}
	 		System.out.print("\n");
	 	}
	 	return;
	 }
	 
	 static void inferior(int m[][],int f, int c)throws IOException	{
	 	int i,j;
	 	for(i = 1; i < f; i++)	{
	 		for(j = 0; j < i; j++)	{
	 			System.out.print(m[i][j] );
	 		}
	 		System.out.print("\n");
	 	}
	 	return;
	 }
	 
	 static void terminar()throws IOException{
	 	System.out.print("Fin del programa...");
	 	return;
	 }
 
 }