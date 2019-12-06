Igual que la parte 2a pero el progra,a se debe repetir mientras se desee continuar*/

import java.io.*;
public class ejercicio2c
{static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
	{int N1,N2,prod,pot;
	 String preg;
		
		do{
			N1=LeerN();
			N2=LeerN();
			if(N2%N1==0){
		      prod=producto(N1,N2);
		      reportar(N1,N2,prod,"El producto ");
			}
			else{
			  pot=potencia(N1,N2);
		      reportar(N1,N2,pot,"La potencia ");
			}
			preg=pregunta();
		}while(preg.compareTo("S")==0);
	}
	
	static int LeerN() throws IOException
	{int N;
		System.out.print("Ingrese numero: ");
		N=Integer.parseInt(br.readLine());
	return N;
	}
	
	static int producto(int N1, int N2) throws IOException
	{int prod=0,c;
		for(c=1;c<=N1;c++){
			prod=prod+N2;
		}
	return prod;
	}
	
	static int potencia(int N1, int N2) throws IOException
	{int pot=1,c;
		for(c=1;c<=N2;c++){
			pot=pot*N1;
		}
	return pot;
	}
	
	static void reportar(int prod,int pot,int x,String mensaje) throws IOException
	{
		System.out.println("\n"+mensaje+"es ="+x);
	return;
	}
	
	static String pregunta() throws IOException
	{String preg;
		do{
			System.out.println("Desea continuar: s/n ?");
			preg=br.readLine().toUpperCase();
		}while(preg.compareTo("S")!=0&&preg.compareTo("N")!=0);
	return preg;
	}
}