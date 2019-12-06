import java.io.*;
public class ejercicio3 //clase tiene que ser el mismo que el archivo
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main (String[]args)throws IOException    
	{int N1,N2,sum,snf;
		N1=LeerN();
		N2=LeerN();
		sum=suma(N1,N2);
		snf=sumf(sum);
		reportar(N1,N2,snf);
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
	static int suma(int N1,int N2)throws IOException
	{int sum;
		sum=N1+N2;
		return sum;
	}
	//////////////////////////////////////////////////////////
	static int sumf(int sum) throws IOException
	{int snf=1,c;
		for(c=1;c<=sum;c++){
			snf=snf*c;
		}
		return snf;
	}
	//////////////////////////////////////////////////////////
	static void reportar(int N1,int N2, int snf) throws IOException
	{
		System.out.print("el factorial de "+N1+" + "+N2+" es: "+snf);
		return;
	}
}