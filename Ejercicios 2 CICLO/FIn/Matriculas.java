import java.io.*;
public class Matriculas	
{static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
 	
 		public static void main(String[]args)throws IOException	
 		{String nombCurso[] = new String[50], idCurso[]=new String[50], idPrereq[] = new String[50];
 		int cred[] = new int[50], ciclo[] = new int[50];
 		int NT = 0,opc=0,cre=21,f=0,n=0;
 			do{
 				opc=menu();
 				switch(opc){
 					case 1:
 						n=Leer();
 						Ingresar(n,nombCurso,idCurso,cred,idPrereq,ciclo);
 						f++;
 						break;
 					case 2:
 						if(f==0){
 						System.out.println("No hay datos\n");
 						}
 						else{
 						Reportar(n,nombCurso,idCurso,cred,idPrereq,ciclo);
 						}
 						break;
 					case 3:
 						if(f==0){
 						System.out.println("No hay datos\n");
 						}
 						else{
 						n=Agregar(n,nombCurso,idCurso,cred,idPrereq,ciclo);	
 						}
 						break;
 					case 4:
 					if(f==0){
 						System.out.println("No hay datos\n");
 						}
 						else{
 						Modificar(n,nombCurso,idCurso,cred,idPrereq,ciclo);	
 						}
 						break;
 					case 5:
 						if(f==0){
 						System.out.println("No hay datos\n");
 						}
 						else{
 						n=Eliminar(n,nombCurso,idCurso,cred,idPrereq,ciclo);	
 						}
 						break;
 					case 6:
 						if(f==0){
 						System.out.println("No hay datos\n");
 						}
 						else{
 						ConsultarNombre(n,nombCurso,idCurso,cred,idPrereq,ciclo);	
 						}
 						break;
 					case 7:
 						if(f==0){
 						System.out.println("No hay datos\n");
 						}
 						else{
 						ConsultarCiclo(n,nombCurso,idCurso,cred,idPrereq,ciclo);	
 						}
 						break;
 					case 8:
 						if(f==0){
 						System.out.println("No hay datos\n");
 						}
 						else{
 						OrdenarAlfabeticamente(n,nombCurso,idCurso,cred,idPrereq,ciclo);	
 						}
 						break;
 					case 12:
 						System.out.println("Fin del programa");
						break;
 			}
 			}while(opc!=12);
 		}
 		
 		//////////////////Metodo Menu///////////////////
 		static int menu() throws IOException
 		{int opc;
 		do{
 			System.out.println("Menu");
			System.out.print("1. Ingresar datos\n");
			System.out.print("2. Reportar datos\n");
			System.out.print("3. Agregar datos\n");
			System.out.print("4. Modificar los datos de los cursos\n");
			System.out.print("5. Eliminar los datos de los cursos\n");
			System.out.print("6. Consultar por nombre de curso\n");
			System.out.print("7. Consultar por ciclo\n");
			System.out.print("8. Ordenar los datos alfabeticamente en forma ascendente por nombre de curso\n");
			System.out.print("9. Ordenar los datos alfabeticamente en forma descendente en base al ciclo\n");
			System.out.print("10. Realizar la matricula de un alumno\n");
			System.out.print("11. Reportar todo\n");
			System.out.print("12. Finalizar programa\n");
			System.out.print("Ingrese opcion: ");
			opc=Integer.parseInt(br.readLine());
			System.out.println();
		}while(opc<1&&opc>12);
		return opc;
 		}
 		
 		////////////////////Metodo Leer///////////////
		static int Leer() throws IOException
		{int n;
			do{
				System.out.print("Ingrese cantidad de cursos: ");
				n=Integer.parseInt(br.readLine());
				System.out.println();
			}while(n<=0||n>50);
		return n;
		}
 		
 		//////////////////Metodo Ingresar////////////
		static void Ingresar(int n ,String nombCurso[] ,String idCurso[] ,int cred[] ,String idPrereq[] ,int ciclo[])throws IOException
		{int i;
			for(i=0;i<n;i++){
				do{System.out.print("ID Curso["+i+"]: ");
					idCurso[i]=br.readLine().toUpperCase();
				}while(idCurso[i].length() != 7);
				System.out.print("Nombre del curso["+i+"]: ");
				nombCurso[i]=br.readLine().toUpperCase();
				do{System.out.print("Creditos del curso["+i+"]: ");
					cred[i]=Integer.parseInt(br.readLine());
				}while(cred[i]<=0||cred[i]>6);
				do{System.out.print("Ciclo["+i+"]: ");
					ciclo[i]=Integer.parseInt(br.readLine());
				}while(ciclo[i]<0||ciclo[i]>10);
				do{System.out.print("ID Pre-requisito["+i+"]: ");
					idPrereq[i]=br.readLine().toUpperCase();
				}while(idPrereq[i].length()!=7&&idPrereq[i].length()!=0);
			System.out.println();
			}
		return ;
		}
		
		//////////////////Metodo reportar///////////////////
		static void Reportar(int n ,String nombCurso[] ,String idCurso[] ,int cred[] ,String idPrereq[] ,int ciclo[])throws IOException
		{int i;
		for(i=0;i<n;i++){
			System.out.print("ID Curso["+i+"]:"+idCurso[i]+"\n");
			System.out.print("Nombre del curso["+i+"]:"+nombCurso[i]+"\n");
			System.out.print("Creditos del curso["+i+"]:"+cred[i]+"\n");;
			System.out.print("Ciclo["+i+"]:"+ciclo[i]+"\n");
			System.out.print("ID Pre-requisito["+i+"]:"+idPrereq[i]+"\n");
			System.out.println();
			}
		return ;
		}
		
		///////////////Metodo Agregar//////////////
		static int Agregar(int n ,String nombCurso[] ,String idCurso[] ,int cred[] ,String idPrereq[] ,int ciclo[])throws IOException
		{
			if(n<50){
				do{System.out.print("ID Curso["+n+"]: ");
					idCurso[n]=br.readLine().toUpperCase();
				}while(idCurso[n].length() != 7);
				System.out.print("Nombre del curso["+n+"]: ");
				nombCurso[n]=br.readLine().toUpperCase();
				do{System.out.print("Creditos del curso["+n+"]: ");
					cred[n]=Integer.parseInt(br.readLine());
				}while(cred[n]<=0||cred[n]>6);
				do{System.out.print("Ciclo["+n+"]: ");
					ciclo[n]=Integer.parseInt(br.readLine());
				}while(ciclo[n]<0||ciclo[n]>10);
				do{System.out.print("ID Pre-requisito["+n+"]: ");
					idPrereq[n]=br.readLine().toUpperCase();
				}while(idPrereq[n].length()!=7&&idPrereq[n].length()!=0);
			System.out.println();
			n++;
			}
			else{
				System.out.println("La base de datos esta llena");
			}
			return n;
		}
		
		/////////////Metodo Modificar//////////////////
		static void Modificar(int n ,String nombCurso[] ,String idCurso[] ,int cred[] ,String idPrereq[] ,int ciclo[])throws IOException
		{int i,pos=-1,opc;
		String nomaux;
		System.out.print("Ingrese el nombre del curso a modificar: ");
		nomaux=br.readLine().toUpperCase();
		for(i=0;i<n;i++){
			if(nombCurso[i].compareTo(nomaux)==0){
				pos=i;
				i=n;
			}	
			}
		if(pos==-1){
			System.out.println("El curso buscado no existe.");
			}
		else{
			do{
				System.out.println("¿Que datos desea modificar?");
				System.out.println("1. ID Curso");
				System.out.println("2. Nombre del curso");
				System.out.println("3. Creditos del curso");
				System.out.println("4. Ciclo");
				System.out.println("5. ID de Pre-requisito");
				System.out.print("Ingrese opcion: ");
				opc=Integer.parseInt(br.readLine());
			}while(opc<1||opc>5);
	
		switch(opc){
			case 1:
				do{System.out.print("ID Curso["+pos+"]: ");
					idCurso[pos]=br.readLine().toUpperCase();
				}while(idCurso[pos].length() != 7);
				System.out.println("Dato modificado");
				break;
			case 2:
				System.out.print("Nombre del curso["+pos+"]: ");
				nombCurso[pos]=br.readLine().toUpperCase();
				System.out.println("Dato modificado");
				break;
			case 3:
				do{System.out.print("Creditos del curso["+pos+"]: ");
				cred[pos]=Integer.parseInt(br.readLine());
				}while(cred[pos]<=0||cred[pos]>6);
				System.out.println("Dato modificado");
				break;
			case 4:
				do{System.out.print("Ciclo["+pos+"]: ");
					ciclo[pos]=Integer.parseInt(br.readLine());
				}while(ciclo[pos]<0||ciclo[pos]>10);
				System.out.println("Dato modificado");
				break;
			case 5:
				do{System.out.print("ID Pre-requisito["+pos+"]: ");
					idPrereq[pos]=br.readLine().toUpperCase();
				}while(idPrereq[pos].length()!=7&&idPrereq[pos].length()!=0);
				System.out.println("Dato modificado");
				break;
			}
		}
		return;
		}
		
		//////////////////Metodo Eliminar///////////////////
		static int Eliminar(int n ,String nombCurso[] ,String idCurso[] ,int cred[] ,String idPrereq[] ,int ciclo[])throws IOException
	{int i,pos=-1,c=0;
	String nomaux;
	System.out.print("Ingrese el nombre del curso a eliminar: ");
	nomaux=br.readLine().toUpperCase();
	for(i=0;i<n;i++){
		if(nombCurso[i].compareTo(nomaux)==0){
			pos=i;
			i=n;
		}
		}
	if(pos==-1){
		System.out.println("El curso buscado no existe.");
	}
	else{
		idCurso[pos]=idCurso[n-1];
		nombCurso[pos]=nombCurso[n-1];
		cred[pos]=cred[n-1];
		idPrereq[pos]=idPrereq[n-1];
		ciclo[pos]=ciclo[n-1];
		n=n-1;
		System.out.println("Los datos del curso fueron borrados");
		System.out.println();
	}
	return n;
	}
		
	////////////////////Metodo Consultar por Nombre/////////////////
	static void ConsultarNombre(int n ,String nombCurso[] ,String idCurso[] ,int cred[] ,String idPrereq[] ,int ciclo[])throws IOException
	{int i,pos=-1;
	String nomaux;
	System.out.print("Ingrese el nombre del curso a buscar: ");
	nomaux=br.readLine().toUpperCase();
	for(i=0;i<n;i++){
		if(nombCurso[i].compareTo(nomaux)==0){
			pos=i;
			i=n;
		}
		}
	if(pos==-1){
		System.out.println("El curso buscado no existe.");
	}
	else{
		System.out.print("ID Curso["+pos+"]:"+idCurso[pos]+"\n");
		System.out.print("Nombre del curso["+pos+"]:"+nombCurso[pos]+"\n");
		System.out.print("Creditos del curso["+pos+"]:"+cred[pos]+"\n");;
		System.out.print("Ciclo["+pos+"]:"+ciclo[pos]+"\n");
		System.out.print("ID Pre-requisito["+pos+"]:"+idPrereq[pos]+"\n");
		System.out.println();
	}
	return ;
	}
	
	///////////////////Consultar por Ciclo/////////////////
	static void ConsultarCiclo(int n ,String nombCurso[] ,String idCurso[] ,int cred[] ,String idPrereq[] ,int ciclo[])throws IOException
	{int i,pos=-1,cicloaux=0;
	System.out.print("Ingrese el ciclo de los cursos a buscar: ");
	cicloaux=Integer.parseInt(br.readLine());
	for(i=0;i<n;i++){
		if(cicloaux==ciclo[i]){
			pos=i;
			System.out.print("ID Curso["+pos+"]:"+idCurso[pos]+"\n");
			System.out.print("Nombre del curso["+pos+"]:"+nombCurso[pos]+"\n");
			System.out.print("Creditos del curso["+pos+"]:"+cred[pos]+"\n");;
			System.out.print("Ciclo["+pos+"]:"+ciclo[pos]+"\n");
			System.out.print("ID Pre-requisito["+pos+"]:"+idPrereq[pos]+"\n");
			System.out.println();
		}
		}
	if(pos==-1){
		System.out.println("El curso buscado no existe.");
	}
	return ;
	}
	
	//////////////////Metodo Ordenar Alfabeticamente////////////////
	static void OrdenarAlfabeticamente(int n ,String nombCurso[] ,String idCurso[] ,int cred[] ,String idPrereq[] ,int ciclo[])throws IOException
	{int i,j,credaux,cicloaux;
	String nomaux,idcursaux,idprereqaux;
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(nombCurso[i].compareTo(nombCurso[j])>0){
					nomaux=nombCurso[i];
					nombCurso[i]=nombCurso[j];
					nombCurso[j]=nomaux;
					credaux=cred[i];
					cred[i]=cred[j];
					cred[j]=credaux;
					cicloaux=ciclo[i];
					ciclo[i]=ciclo[j];
					ciclo[j]=cicloaux;
					idcursaux=idCurso[i];
					idCurso[i]=idCurso[j];
					idCurso[j]=idcursaux;
					idprereqaux=idPrereq[i];
					idPrereq[i]=idPrereq[j];
					idPrereq[j]=idprereqaux;
				}
			}
		}
		System.out.println("Datos ordenados de forma ascendente");
		System.out.println();
		return;
	}
}
 