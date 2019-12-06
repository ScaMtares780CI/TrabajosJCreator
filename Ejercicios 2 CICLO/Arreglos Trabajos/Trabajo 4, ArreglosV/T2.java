import java.io.*;
public class T2
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
 {String nomb[]= new String[50];
  int not[]=new int[50];
  int ed[]=new int[50];
  int N;
  
  	N=leerN();
  	ingresar(nomb,not,ed,N);
  	reportarTodo(nomb,not,ed,N);
  	reportarAM(nomb,not,ed,N);
  	reportarDM(nomb,not,ed,N);
  }
  
	static int leerN()throws IOException
  	{int N;
		do{
			System.out.print("Ingrese cantidad de datos: ");
			N=Integer.parseInt(br.readLine());
		}while(N<=0||N>50);
	return N;
	}
	
	static void ingresar(String nomb[],int not[],int ed[],int N)throws IOException
	{int i;
		System.out.println("***INGRESO DE DATOS***");
 		for(i=0;i<N;i++){
 			System.out.print("Nombre["+i+"]: ");
 			nomb[i]=br.readLine();
 			do{
	 			System.out.print("Nota["+i+"]: ");
	 			not[i]=Integer.parseInt(br.readLine());
 			}while(not[i]<0||not[i]>20);
 			do{
	 			System.out.print("Edad["+i+"]: ");
	 			ed[i]=Integer.parseInt(br.readLine());
 			}while(ed[i]<=0||ed[i]>100);
 		}	
	return ;
	}
	
	static void reportarTodo(String nom[],int not[],int ed[],int N)throws IOException
	{int i;
		System.out.println("***REPORTE A.***");
		for(i=0;i<N;i++){
				System.out.println("\n"+nom[i]+"\t"+ed[i]+"\t"+not[i]);
			}
	return ;
	}
	
	static void reportarAM(String nom[],int not[],int ed[],int N)throws IOException
	{int i;
		System.out.println("***REPORTE B.***");
		for(i=0;i<N;i++){
			if(ed[i]>=18){
				if(not[i]>11&&not[i]<=20){
					System.out.println("\n"+nom[i]+"\t"+not[i]+"\t"+ed[i]);
				}
			}
		}
	return ;
	}
	
	static void reportarDM(String nom[],int not[],int ed[],int N)throws IOException
	{int i;
		System.out.println("***REPORTE C.***");
		for(i=0;i<N;i++){
			if(ed[i]<18){
				if(not[i]>=0&&not[i]<11){
					System.out.println("\n"+nom[i]+"\t"+not[i]+"\t"+ed[i]);
				}
			}
		}
	return ;
	}
}
