import java.io.*;
public class preg3
{static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
public static void main (String[]args)throws IOException
	{	
		int pri[]=new int [20];
		int seg[]=new int [20];
		int N;
	
		N=leerN();
		ingresar(pri,seg,N);
		verif(pri,seg,N);
	}
	static int leerN()throws IOException
	{int N;
		do{
			System.out.print("Ingrese cantidad de enteros: ");
			N=Integer.parseInt(br.readLine());
		}while(N<=0||N>20);
	return N;
	}
	static void ingresar(int pri[],int seg[],int N)throws IOException
	{int i;

		for(i=0;i<N;i++){
			do{
				System.out.println("Ingrese el ["+i+"] elemento del primer arreglo: ");
				pri[i]=Integer.parseInt(br.readLine());
			}while(pri[i]<=0);
		}
		for(i=0;i<N;i++){
			do{
				System.out.println("Ingrese el ["+i+"]elemento del segundo arreglo: ");
				seg[i]=Integer.parseInt(br.readLine());
			}while(seg[i]<=0);
		}
	return ;
	}
	static void verif(int pri[],int seg[],int N)throws IOException
	{int i;
		for(i=0;i<N;i++){
			if(pri[i]==seg[i]){
				if
				p=i
			}
		}
		if(p==pri[i])
				System.out.print("Contienen los mismos digitos");
		else
				System.out.print("NO");
	}
}