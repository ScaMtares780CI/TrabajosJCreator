import java.io.*;
public class P3
{static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[]args)throws IOException
	{	String nom[]=new String [50];
		int pre[]=new int[50];
		char tip[]=new char[50];
		int N=0,opc;
	
	 do{ 
	 	 opc=menu();
	 	 switch(opc)
	 	 { case 1: N=leernum();
	 	 			ingresar(nom,pre,tip,N);
	 	 		   break;
	 	   case 2: if(N>0){
					reportar(nom,pre,tip,N);
	 	   		   }
	 	   		   else{
	 	   		   System.out.println("\n Primero debe ingresar 1");
	 	   		   }
	 	   		   break;
	 	   case 3: if(N>0){
		 			N=agregar(nom,pre,tip,N);
	 	   		   }
	 	   		   else{
	 	   		   System.out.println("\n Primero debe ingresar 1");
	 	   		   }
	 	   		   break;
	 	   case 4: if(N>0){
		 			modificar(nom,pre,tip,N);
	 	   		   }
	 	   		   else{
	 	   		   System.out.println("\n Primero debe ingresar 1 ...");
	 	   		   }
	 	   		   break;
	 	   case 5: terminar();
	 	   		   break;
	   	 }
	   }while(opc!=5);
	}
	/////////////////////////////////////////////////////////////////
	static int menu() throws IOException
	{int opc;
		do{
			System.out.println("------------------------MENÚ--------------------------");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("[1] Ingresar");
			System.out.println("[2] Reportar");
			System.out.println("[3] Agregar");
			System.out.println("[4] Modificar");
			System.out.println("[5] Terminar");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Seleccione opcion:");
			opc=Integer.parseInt(br.readLine());
		}while(opc<1 || opc>5);
	return opc;
	}
	/////////////////////////////////////////////////////////////////
	static int leernum()throws IOException
	{int N;
		do{
			System.out.print("Ingrese cantidad: ");
			N=Integer.parseInt(br.readLine());
		}while(N<=0||N>50);
	return N;
	}
	////////////////////////////////////////////////////////////////
	static void ingresar(String nom[],int pre[],char tip[],int N)throws IOException
	{int i;
		for(i=0;i<N;i++){
			System.out.print("Ingrese nombre: ");
			nom[i]=br.readLine();
			do{
				System.out.print("Ingrese precio: ");
				pre[i]=Integer.parseInt(br.readLine());
			}while(pre[i]<=0);
			do{
				System.out.print("Ingrese tip: ");
				tip[i]=br.readLine().toUpperCase().charAt(0);
			}while(tip[i]!='N'&&tip[i]!='I');
		}
	return;
	}
	/////////////////////////////////////////////////
	static void reportar(String nom[],int pre[],char tip[],int N)throws IOException
	{int i;
		System.out.println("REPORTE TOTAL");
		for(i=0;i<N;i++){
			System.out.println("\n "+nom[i]+" "+pre[i]+" "+tip[i]);
		}
	return;
	}
	/////////////////////////////////////////////////
	static void modificar(String nom[],int pre[],char tip[],int N)throws IOException
	{int i,pos=-1;
	String nomaux;
	 System.out.print("Ingrese Nomaux: ");
	 nomaux=br.readLine();
		for(i=0;i<N;i++){
			if(nom[i].compareTo(nomaux)==0){
				pos=i;
				i=N;
			}
		}
		if(pos==-1){
			System.out.println("Dato no existe");
		}
		else{
			System.out.print("Ingrese pos: ");
	 		nom[pos]=br.readLine();
	 		do{
	 			System.out.print("Ingrese pre:");
	 			pre[pos]=Integer.parseInt(br.readLine());
	 		}while(pre[pos]<=0);
	 		do{
	 			System.out.print("Ingrese tip: ");
	 			tip[pos]=br.readLine().toUpperCase().charAt(0);
	 		}while(tip[pos]!='N'&&tip[pos]!='I');
		}
	return;
	}
	//////////////////////////////////////////////////////
	static int agregar(String nom[],int pre[],char tip[],int N)throws IOException
	{
		if(N<50){
			System.out.print("Ingrese nomb: ");
	 		nom[N]=br.readLine();
	 		do{
	 			System.out.print("Ingrese pre: ");
	 			pre[N]=Integer.parseInt(br.readLine());
	 		}while(pre[N]<=0);
	 		do{
	 			System.out.print("Ingrese tip: ");
	 			tip[N]=br.readLine().toUpperCase().charAt(0);
	 		}while(tip[N]!='N'&&tip[N]!='I');
	 		N=N+1;
		}
		else{
			System.out.println("Arreglo lleno");
		}

	return N;
	}
	//////////////////////////////////////////////////////
	static void terminar() throws IOException
	{
		System.out.println("Fin del programa...ADIOS");
		return;
	}
}