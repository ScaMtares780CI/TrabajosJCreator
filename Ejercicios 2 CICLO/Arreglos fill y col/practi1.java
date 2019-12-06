import java.io.*;
public class practi1
{static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
public static void main (String[]args)throws IOException
	{	int mat[][]=new int[20][20];
		int fil,col;
	
		fil=leerN("filas");
		col=leerN("columnas");
		ingresar(mat,fil,col);
		reportar(mat,fil,col);
		diagonal(mat,fil,col);
		suma(mat,fil,col);
	}
	static int leerN(String msj)throws IOException
	{int N;
		do{
			System.out.print("Ingrese cantidad "+msj+" : ");
			N=Integer.parseInt(br.readLine());
		}while(N<=0||N>20);
	return N;
	}
	static void ingresar(int mat[][],int fil,int col)throws IOException
	{int i,j;
		for(i=0;i<fil;i++){
			for(j=0;j<col;j++){
					System.out.print("Ingrese matriz: ");
					mat[i][j]=Integer.parseInt(br.readLine());
			}
		}
	return;
	}
	static void reportar(int mat[][],int fil,int col)throws IOException
	{int i,j;
		System.out.println("REPORTE TOTAL");
		for(i=0;i<fil;i++){
			for(j=0;j<col;j++){
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println(" ");
		}
	return;
	}
	static void diagonal(int mat[][],int fil,int col)throws IOException
	{int i,j;
		if(fil==col){
			System.out.println("REPORTE Diagonal");
			for(i=0;i<fil;i++){
				for(j=0;j<col;j++){
					{
						if(i==j){
							System.out.print(mat[i][j]+"\t");
						}
						else{
							System.out.print("\t");
						}
					}
					System.out.println("");
				}
			}
		}
		else{
			System.out.println("No es una matriz cuadrada");
		}
	return;
	}
	static void suma(int mat[][],int fil,int col)throws IOException
	{int i,j,sum=0;
		System.out.println("REPORTE suma");
		for(i=0;i<fil;i++){
			for(j=0;j<col;j++){
				sum=sum+mat[i][j];
				}
		}
		System.out.print("\t"+sum);
	return;
	}
	/////////////////////////////////////////////////
	//////////////////////////////////////////////////////
	//////////////////////////////////////////////////////
}