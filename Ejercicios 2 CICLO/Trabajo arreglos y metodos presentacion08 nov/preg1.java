import java.io.*;
public class preg1
{static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
public static void main (String[]args)throws IOException
	{	
		char dat[]=new char [20];
		String fre[]=new String[20];
		int N;
	
		N=leerN();
		ingresar(dat,N);
		reportar(dat,fre,N);
		
	}
	static int leerN()throws IOException
	{int N;
		do{
			System.out.print("Ingrese cantidad de personas: ");
			N=Integer.parseInt(br.readLine());
		}while(N<=0||N>20);
	return N;
	}
	static void ingresar(char dat[],int N)throws IOException
	{int i,j=0;
		System.out.println("Ingrese: E(excelente),B(bueno),R(regular),M(malo),P(pésimo)");
		for(i=0;i<N;i++){
			i=j;//algo de estetica
			j++;//algo de estetica :D
			do{
				System.out.print("\n\tParticipante["+j+"] ¿Como califica al gobierno?: ");
				dat[i]=br.readLine().toUpperCase().charAt(0);
			}while(dat[i]!='E'&&dat[i]!='B'&&dat[i]!='R'&&dat[i]!='M'&&dat[i]!='P');
		}
	return;
	}
	static void reportar(char dat[],String fre[],int N)throws IOException
	{int i,sumE=0,sumB=0,sumR=0,sumM=0,sumP=0;
		for(i=0;i<N;i++){
			if(dat[i]=='E'){
				sumE++;
			}
			if(dat[i]=='B'){
				sumB++;
			}
			if(dat[i]=='R'){
				sumR++;
			}
			if(dat[i]=='M'){
				sumM++;
			}
			if(dat[i]=='P'){
				sumP++;
			}
			fre[i]="*";
		}
		System.out.print("HISTOGRAMA");
			System.out.print("\nE: "+sumE+"	E: ");
			for(i=0;i<sumE;i++){
				System.out.print(""+fre[i]);
			}
			System.out.print("\nB: "+sumB+"	B: ");
			for(i=0;i<sumB;i++){
				System.out.print(""+fre[i]);
			}
			System.out.print("\nR: "+sumR+"	R: ");
			for(i=0;i<sumR;i++){
				System.out.print(""+fre[i]);
			}
			System.out.print("\nM: "+sumM+"	M: ");
			for(i=0;i<sumM;i++){
				System.out.print(""+fre[i]);
			}
			System.out.print("\nP: "+sumP+"	P: ");
			for(i=0;i<sumP;i++){
				System.out.print(""+fre[i]);
			}
	return;
	}
}