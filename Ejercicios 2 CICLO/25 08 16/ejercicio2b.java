igual a laparte 2 pero el proceso debe repetir x veces
import java.io.*;
public class ejercicio2b
{static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
	{int N1,N2,prod,pot,Cn,c;
	
		Cn=LeerN();
	  	for(c=1;c<=Cn;c++){
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
	  	}
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
		System.out.println(" ");
	return;
	}
}