import java.io.*;
public class T6
{static BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
public static void main (String[]args)throws IOException
 /////////////////////////////METODO PRINCIPAL/////////////////////////////
 {	 int num[]=new int[100];
	 int N;
	 
	 N=leerN();
	 ingresar(num,N);
	 reportarmsj(num,N);
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
 static void ingresar(int num[],int N)throws IOException
 {int i;
 	System.out.println("***INGRESO DE DATOS***");
 	for(i=0;i<N;i++){
		System.out.print("Numero["+i+"]: ");
		num[i]=Integer.parseInt(br.readLine());
 	}
 return;
 }
 /**************************************************/
 static void reportarmsj(int num[],int N)throws IOException
 { int i,numr,pos=-1;
  
  System.out.println("\n***REPORTE DE LA BUSQUEDA DE DATO***");
  System.out.print("\nIngrese numero a buscar: ");
  numr=Integer.parseInt(br.readLine());
  System.out.println("\nReporte de la posicion del numero: "+numr);
	 for(i=0;i<N;i++){
	 	if(num[i]==numr){
	 		pos=i;
	 		i=N;
	 	}
	 }
	 if(pos==-1){
	 	System.out.println("NO");
	 }
	 else{
	 	System.out.println("\nEsta en la posicion(arreglo): "+pos);
	 }
 	return;
 }
}