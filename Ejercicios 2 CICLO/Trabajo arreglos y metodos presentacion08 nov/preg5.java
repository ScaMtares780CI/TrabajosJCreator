import java.io.*;
public class preg5
{static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
public static void main (String[]args)throws IOException
	{	
		int M1[][]=new int [20][20];
		int fil,col;
		int N;
	
		do{
			fil=leerN("filas");
			col=leerN("columnas");
			if(fil==col){
				ingresar(M1,fil,col);
				reportarMC(M1,fil,col);
				reportarMT(M1,fil,col);
			}
			else{
				System.out.println("Las matrices tienen que tener el modelo de NxN");
			}
			
		}while(fil!=col);
	}
	static int leerN(String msj)throws IOException
	{int N;
		do{
			System.out.print("Ingrese cantidad de "+msj+" de la matriz: ");
			N=Integer.parseInt(br.readLine());
		}while(N<=0||N>20);
	return N;
	}
	static void ingresar(int M1[][],int fil,int col)throws IOException
	{int i,j,f,g;
		for(i=0;i<fil;i++){
			for(j=0;j<col;j++){
					f=i+1;
					g=j+1;
					System.out.print("Ingrese la matriz "+f+" x "+g+" :");
					M1[i][j]=Integer.parseInt(br.readLine());
			}
		}
	return ;
	}
	static void reportarMC(int M1[][],int fil,int col)throws IOException
	{int i,j;
		System.out.println("REPORTE de la matriz completa");
		for(i=0;i<fil;i++){
			for(j=0;j<col;j++){
				System.out.print(M1[i][j]+"\t");
			}
			System.out.println(" ");
		}
	return;
	}
	static void reportarMT(int M1[][],int fil,int col)throws IOException
	{int i,j;
		System.out.println("REPORTE de la matriz transpuesta");
		for(i=0;i<col;i++){
			for(j=0;j<fil;j++){
				System.out.print(M1[j][i]+"\t");
			}
			System.out.println(" ");
		}
	return;
	}
}