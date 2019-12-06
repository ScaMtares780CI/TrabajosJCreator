/*4. Leer 2 numeros enteros positivos n1,N2
 *Si N1>N2 calcular el mcm
 */
import java.io.*;
public class ejercicio4 //clase tiene que ser el mismo que el archivo
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main (String[]args)throws IOException    
	{int N1,N2,sum,snf,fact1,fact2,sf,mcm,pot;
		N1=LeerN();
		N2=LeerN();
		if(N1==N2){
			sum=suma(N1,N2);
			snf=sumf(sum);
			
			fact1=fact(N1);
			fact2=fact(N2);
			sf=sumfac(fact1,fact2);
			
			reportarf(N1,N2,sf,snf);
		}
		else{
			if(N1>N2){
				mcm=mcm(N1,N2);
				reportarmcm(N1,N2,mcm);
			}
			else{
				pot=potencia(N1,N2);
				reportarpot(N1,N2,pot);
			}
		}
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
	static void reportarf(int N1,int N2, int sf, int snf) throws IOException
	{
		System.out.println("la suma de los factoriales de "+N1+" , "+N2+" es: "+sf);
		System.out.println("el factorial de "+N1+" + "+N2+" es: "+snf);
		return;
	}
	//////////////////
	/////////////////
	/////////////////
	static int mcm(int N1,int N2)throws IOException
	{int d=2,mcm=1;
		while(N1>1||N2>1)
		{
			if(N1%d==0||N2%d==0){
				if(N1%d==0){
					N1=N1/d;
				}
				if(N2%d==0){
					N2=N2/d;
				}
				mcm=mcm*d;
			}
			else{
				d=d+1;
			}
		}
		return mcm;
	}
	///////////////////////////////////////////////////////////////
	static void reportarmcm(int N1,int N2, int mcm) throws IOException
	{
		System.out.println("el mcm de "+N1+" y "+N2+" es: "+mcm);
		return;
	}
	//////////////////////////////////////////////////////////////
	//////////////////////////////////////////
	////////////////////////////////
	static int potencia(int N1,int N2)throws IOException
	{int i,pot=1;
		for(i=1;i<=N2;i++){
			pot=pot*N1;
		}
		return pot;
	}
	///////////////////////////////////////////////////////////
	static void reportarpot(int N1,int N2, int pot) throws IOException
	{
		System.out.println("la potencia de "+N1+" y "+N2+" es: "+pot);
		return;
	}
}