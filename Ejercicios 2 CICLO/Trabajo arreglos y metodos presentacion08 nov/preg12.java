import java.io.*;
public class preg12
{static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
public static void main (String[]args)throws IOException
	{	
		int numb2[]=new int [20];
		int numb10[]=new int [20];
		int N;
	
		numb2=ingresar(numb2);
		reportar(numb2,numb10);
	}

	static void ingresar(int numb2[],int N)throws IOException
	{int i,f=0;

			do{
				f=i+1;
				System.out.println("Ingrese el ["+f+"°] numero: ");
				numb2[f]=Integer.parseInt(br.readLine());
			}while(numb2[f]<=0);
		}
	return ;
	}
	static void reportar(int numb2[],int numb10[],int N)throws IOException
	{int i,c=0;
		for(i=0;i<N;i++){
			c=numb2[i]%2;
		}
		System.out.print("\t"+c);
	return;
	}
}