import java.io.*;
public class ejercicio2 //clase tiene que ser el mismo que el archivo
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main (String[]args)throws IOException    
	{int N1,N2,fact1,fact2,sf;
		N1=LeerN();
		N2=LeerN();
		fact1=fact(N1);
		fact2=fact(N2);
		sf=sumfac(fact1,fact2);
		reportar(N1,N2,sf);
	}
	//////////////////////////////////////////////////////////
	static int LeerN()throws IOException
	{int N;
		do{
			System.out.print("Ingrese numero positivo: ");
			N=Integer.parseInt(br.readLine());
		}while(N<=0);
		return N;
	}
	//////////////////////////////////////////////////////////
	static int fact(int N1) throws IOException
	{int fact=1,c;
		for(c=1;c<=N1;c++){
			fact=fact*c;
		}
		return fact;
	}
	//////////////////////////////////////////////////////////
	static int sumfac(int fact1,int fact2) throws IOException
	{int sf;
		sf=fact1+fact2;
		return sf;
	}
	//////////////////////////////////////////////////////////
	static void reportar(int N1,int N2, int sf) throws IOException
	{
		System.out.print("la suma de los factoriales de "+N1+" , "+N2+" es: "+sf);
		return;
	}
}