import java.io.*;
public class preg4
{static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
public static void main (String[]args)throws IOException
	{	
		int M1[][]=new int [20][20];
		int fil,col;
		int M2[][]=new int [20][20];
		int MS[][]=new int [20][20];
		int N;
	
		do{
			fil=leerN("filas");
			col=leerN("columnas");
			if(fil==col){
				ingresar(M1,M2,fil,col);
				reportar(M1,M2,fil,col);
				reportarsum(M1,M2,fil,col,MS);
			}
			else{
				System.out.println("Las matrices tienen que tener el modelo de NxN");
			}
			
		}while(fil!=col);
	}
	static int leerN(String msj)throws IOException
	{int N;
		do{
			System.out.print("Ingrese cantidad de"+msj+": ");
			N=Integer.parseInt(br.readLine());
		}while(N<=0||N>20);
	return N;
	}
	static void ingresar(int M1[][],int M2[][],int fil,int col)throws IOException
	{int i,j;
		for(i=0;i<fil;i++){
			for(j=0;j<col;j++){
					System.out.print("Ingrese la primera matriz "+i+" x "+j+" :");
					M1[i][j]=Integer.parseInt(br.readLine());
			}
		}
		for(i=0;i<fil;i++){
			for(j=0;j<col;j++){
					System.out.print("Ingrese la segunda matriz "+i+" x "+j+" :");
					M2[i][j]=Integer.parseInt(br.readLine());
			}
		}
	return ;
	}
	static void reportar(int M1[][],int M2[][],int fil,int col)throws IOException
	{int i,j,f=0;
		System.out.println("REPORTE TOTAL");
		System.out.println("MATRIZ 1\t");
		for(i=0;i<fil;i++){
			for(j=0;j<col;j++){
				System.out.print(M1[i][j]+"\t");
			}
			System.out.println(" ");
		}
		System.out.println("MATRIZ 2\t");
		for(i=0;i<fil;i++){
			for(j=0;j<col;j++){
				System.out.print(M2[i][j]+"\t");
			}
			System.out.println(" ");
		}
	return;
	}
	static void reportarsum(int M1[][],int M2[][],int fil,int col,int MS[][])throws IOException
	{int i,j;
		System.out.println("REPORTE de MATRIZ SUMA");
		for(i=0;i<fil;i++){
			for(j=0;j<col;j++){
				MS[i][j]=M1[i][j]+M2[i][j];
				System.out.print(MS[i][j]+"\t");
			}
			System.out.println(" ");
		}
	return;
	}
}