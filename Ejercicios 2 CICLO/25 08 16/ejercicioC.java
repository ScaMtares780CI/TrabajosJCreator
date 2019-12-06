Igaual a la parte 1 pero se debe repetir mientras se desee continuar*/
import java.io.*;
public class ejercicioC
{static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
	{int N,fac;
	String preg;
	  
	  do{
	      N=LeerN();
	      fac=factorial(N);
	      reportar(N,fac);
	      preg=pregunta();
	  }while(preg.compareTo("S")==0);
	}
	
	static int LeerN() throws IOException
	{int N;
		System.out.print("Ingrese numero: ");
		N=Integer.parseInt(br.readLine());
	return N;
	}
	static int factorial(int N) throws IOException
	{int fac=1,c;
		for(c=1;c<=N;c++){
			fac=fac*c;
		}
	return fac;
	}
	static String pregunta() throws IOException
	{String preg;
		do{
			System.out.println("Desea continuar: s/n ?");
			preg=br.readLine().toUpperCase();
		}while(preg.compareTo("S")!=0&&preg.compareTo("N")!=0);
	return preg;
	}
	static void reportar(int N,int fac) throws IOException
	{
		System.out.println("\tEl factorial de "+N+" es: "+fac);
	return;
	}
}