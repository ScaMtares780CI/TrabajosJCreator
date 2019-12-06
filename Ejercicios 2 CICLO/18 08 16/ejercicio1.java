/*1.Esccribir un programa usando metodos que lea un numero entero 
N positivo y calcule el factorial de N y reporta N y su factorial.*/

import java.io.*;
public class ejercicio1 //clase tiene que ser el mismo que el archivo
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main (String[]args)throws IOException    
	{int N,f;
		N=LeerN();
		f=factorial(N);
		reportar(N,f);
	}
	//////////////////////////////////////////////////////////
	static int LeerN()throws IOException
	{int N;
		do{
			System.out.print("Ingrese un numero positivo: ");
			N=Integer.parseInt(br.readLine());
		}while(N<=0);
		return N;
	}
	//////////////////////////////////////////////////////////
	static int factorial(int N) throws IOException
	{int f=1,c;
		for(c=1;c<=N;c++){
			f=f*c;
		}
		return f;
	}
	//////////////////////////////////////////////////////////
	static void reportar(int N, int f) throws IOException
	{
		System.out.print("El factorial de "+N+" es: "+f);
		return;
	}
}