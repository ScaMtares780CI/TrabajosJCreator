la parte 1 pero se debe repetir mientras se desee continuar*/
import java.io.*;
public class ejercicioB
{static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
	{int N,fac,Cn,c;
	  Cn=LeerN();
	  for(c=1;c<=Cn;c++){
	      N=LeerN();
	      fac=factorial(N);
	      reportar(N,fac);
	  }
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
	static void reportar(int N,int fac) throws IOException
	{
		System.out.println("\tEl factorial de "+N+" es: "+fac);
	return;
	}
}