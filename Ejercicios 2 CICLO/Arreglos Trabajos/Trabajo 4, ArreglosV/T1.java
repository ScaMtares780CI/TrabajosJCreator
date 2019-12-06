import java.io.*;
public class T1
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
 {String nomb[]= new String[50];
  int ed[]=new int[50];
  char sex[]=new char[50];
  int N;
  
  	N=leerN();
  	ingresar(nomb,ed,sex,N);
  	reportaralmsM(nomb,ed,sex,N);
  	reportaralmsH(nomb,ed,sex,N);
  }
  
	static int leerN()throws IOException
  	{int N;
		do{
			System.out.print("Ingrese cantidad de datos: ");
			N=Integer.parseInt(br.readLine());
		}while(N<=0||N>50);
	return N;
	}
	
	static void ingresar(String nomb[],int ed[],char sex[],int N)throws IOException
	{int i;
		System.out.println("***INGRESO DE DATOS***");
 		for(i=0;i<N;i++){
 			System.out.print("Nombre["+i+"]: ");
 			nomb[i]=br.readLine();
 			do{
 			System.out.print("Edad["+i+"]: ");
 			ed[i]=Integer.parseInt(br.readLine());
 			}while(ed[i]<=0||ed[i]>100);
 			do{
 			System.out.print("Sexo["+i+"]: ");
 			sex[i]=br.readLine().toUpperCase().charAt(0);
 			}while(sex[i]!='F'&&sex[i]!='M');
 		}	
	return ;
	}
	
	static void reportaralmsM(String nom[],int ed[],char sex[],int N)throws IOException
	{int i,mjr=0;
		System.out.println("***REPORTE a.***");
		for(i=0;i<N;i++){
			if(sex[i]=='F'){
				System.out.println("\n"+nom[i]+"\t"+ed[i]+"\t\t"+sex[i]);
				mjr=mjr+1;
			}
		}
		System.out.println("Y tambien hay: "+mjr);
	return ;
	}
	
	static void reportaralmsH(String nom[],int ed[],char sex[],int N)throws IOException
	{int i,seh=0;
		System.out.println("***REPORTE b.***");
		for(i=0;i<N;i++){
			if(sex[i]=='M'){
				System.out.println("\n"+nom[i]+"\t"+ed[i]+"\t\t"+sex[i]);
				seh=seh+ed[i];
			}
		}
		System.out.println("Y la suma de edades es: "+seh);
	return ;
	}
}
