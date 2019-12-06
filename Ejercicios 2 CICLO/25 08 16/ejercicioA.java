calcular el factorial de x numeros
import java.io.*;
public class ejercicioA
{static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
public static void main(String[]args)throws IOException
	{int N,fac;
      N=LeerN();
      fac=factorial(N);
      reportar(N,fac);
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
		System.out.print("El factorial de "+N+" es: "+fac);
	return;
	}
}