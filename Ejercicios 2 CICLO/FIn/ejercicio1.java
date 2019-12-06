/*PROYECTO
 */
 
 import java.io.*;
 public class ejercicio1	{
 	static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
 	
 	public static void main(String[]args)throws IOException	{
 		int NC; //Preguntar capacidad de cursos
 		String idCurso[] = new String[50];
 		String nombCurso[] = new String[50];
 		int cred[] = new int[50];
 		int ciclo[] = new int[50];
 		String idPrereq[] = new String[50];
 		int NT = 0,opIng=0,op,posNC=-1;
 		
	 	NC = leerNC();
	 	do{
	 		op = menu();
	 		switch(op){
	 			case 1:	 					
		 					if( opIng == 1 )
		 						System.out.print("Se permite una vez");
		 					else{
		 						ingresar(NC,idCurso,nombCurso,cred,ciclo,idPrereq);
		 						opIng++;
		 					}
		 					break;
		 		case 2:
		 					if( opIng > 0)
		 						reportar(NC,idCurso,nombCurso,cred,ciclo,idPrereq);
		 					else
		 						System.out.println("No hay datos");
		 					break;
		 		case 3:		//no va if(opIng>0){...} porque se puede agregar datpos desde el comienzo.
		 					agregar(NC,idCurso,nombCurso,cred,ciclo,idPrereq);
		 					break;
		 		case 4:
		 					if( opIng > 0)
		 						modificar(NC,idCurso,nombCurso,cred,ciclo,idPrereq,posNC);
		 					else
		 						System.out.println("No hay datos");
		 					break;
		 		case 5:
		 					if( opIng > 0)
		 						eliminar(NC,idCurso,nombCurso,cred,ciclo,idPrereq);
		 					else
		 						System.out.println("No hay datos");
		 					break;
		 		case 6:
		 					if( opIng > 0)
		 						consultarNC(NC,idCurso,nombCurso,cred,ciclo,idPrereq);
		 					else
		 						System.out.println("No hay datos");
		 					break;
		 		case 7:
		 					if( opIng > 0)
		 						consultarC(NC,idCurso,nombCurso,cred,ciclo,idPrereq);
		 					else
		 						System.out.println("No hay datos");
		 					break;
		 		case 8:
		 					if( opIng > 0)
		 						ordenarNC(NC,idCurso,nombCurso,cred,ciclo,idPrereq);
		 					else
		 						System.out.println("No hay datos");
		 					break;
		 		/*case 5:
		 					if( opIng > 0)
		 						ordenarC(NC,idCurso,nombCurso,cred,ciclo,idPrereq);
		 					else
		 						System.out.println("No hay datos");
		 					break;
		 		case 5:
		 					if( opIng > 0)
		 						eliminar(NC,idCurso,nombCurso,cred,ciclo,idPrereq);
		 					else
		 						System.out.println("No hay datos");
		 					break;*/
		 		case 12:
		 				terminar();
		 				break;
		 		}
	 	}while(op != 12);
	 			
 	}
	 
	static int menu()throws IOException{
		int op;
		do{
			System.out.println("*****MENU*****");
			System.out.println("1. Ingresar");
			System.out.println("2. Reportar");
			System.out.println("3. Agregar");
			System.out.println("4. Modificar");
			System.out.println("5. Eliminar");
			System.out.println("6. Consultar por nombre de curso");
			System.out.println("7. Consultar por ciclo");
			System.out.println("8. Orden ascendente por nombre de curso");
			System.out.println("9. Orden descendente por ciclo");
			/*System.out.println("9. Orden descendente por ciclo");
			System.out.println("9. Orden descendente por ciclo");*/
			System.out.println("12. Terminar");
			System.out.print("Opcion: ");
			op = Integer.parseInt(br.readLine());
		}while(op < 0|| op > 12);
		return op;
	} 
		
	static int menuMod()throws IOException	{
		int op;
		do{
			System.out.println("*****MENU MODIFICAR*****");
			System.out.println("1. IDcurso");
			System.out.println("2. Nombre del curso");
			System.out.println("3. Creditos");
			System.out.println("4. Ciclo");
			System.out.println("5. ID Pre-requisito del curso");
			System.out.print("Opcion:");
			op = Integer.parseInt(br.readLine());
		}while(op < 0|| op > 5);
		return op;
	}
	 
	static int leerNC()throws IOException{
		int NC;
		
		do	{
			System.out.print("Ingrese numero de cursos:");
			NC = Integer.parseInt(br.readLine());
		}while(NC <= 0 || NC > 50);
		
		return NC;
	} 
	 
	static void ingresar(int NC,String idCurso[],String nombCurso[],int cred[],int ciclo[],String idPrereq[])throws IOException{
		int i;
		for(i = 0 ; i < NC; i++){
			do	{
				System.out.print("Ingrese id del curso:");
				idCurso[i] = br.readLine();
			}while( idCurso[i].length() != 7);
			System.out.print("Ingrese nombre del curso:");
			nombCurso[i] = br.readLine();
			do	{
				System.out.print("Ingrese creditos del curso:");
				cred[i] = Integer.parseInt(br.readLine());
			}while(cred[i] < 0 || cred[i] > 5);
			do	{
				System.out.print("Ingrese ciclo al que pertenece el curso:");
				ciclo[i] = Integer.parseInt(br.readLine());
			}while(ciclo[i] < 0 || ciclo[i] > 10);
			do	{
				System.out.print("Ingrese id del curso pre-requisito:");
				idPrereq[i] = br.readLine();
			}while( idPrereq[i].length() != 7 && idPrereq[i] != null);
			
		}
		
		return;
	}
	
	static void reportar(int NC,String idCurso[],String nombCurso[],int cred[],int ciclo[],String idPrereq[])throws IOException	{
		int i;
		for(i = 0; i < NC; i++)	{
			System.out.println("\t"+idCurso[i]+"\t"+nombCurso[i]+"\t"+cred[i]+"\t"+ciclo[i]+"\t"+idPrereq[i]);
		}
		return;
	}
	
	static void agregar(int NC,String idCurso[],String nombCurso[],int cred[],int ciclo[],String idPrereq[])throws IOException{
		if(NC<50){
			do	{
				System.out.print("Ingrese NUEVO id del curso:");
				idCurso[NC] = br.readLine();
			}while( idCurso[NC].length() != 7);
			System.out.print("Ingrese NUEVO nombre del curso:");
			nombCurso[NC] = br.readLine();
			do	{
				System.out.print("Ingrese creditos del NUEVO curso:");
				cred[NC] = Integer.parseInt(br.readLine());
			}while(cred[NC] < 0 || cred[NC] > 5);
			do	{
				System.out.print("Ingrese ciclo al que pertenece el NUEVO curso:");
				ciclo[NC] = Integer.parseInt(br.readLine());
			}while(ciclo[NC] < 0 || ciclo[NC] > 10);
			do	{
				System.out.print("Ingrese id del NUEVO curso pre-requisito:");
				idPrereq[NC] = br.readLine();
			}while( idPrereq[NC].length() != 7 && idPrereq[NC] != null);
			NC++;
		}
		else{
			System.out.println("Arreglo lleno");
		}
		return NC;
	}

	static void modificar(int NC,String idCurso[],String nombCurso[],int cred[],int ciclo[],String idPrereq[],int posNC)throws IOException{
		int op;
		if(pos==-1){
			System.out.print("No existe");
		}
		else{
			System.out.print("Que desea modificar?");
			op =  menuMod();
			switch(op)	{
				case 1:	
					do	{
						System.out.print("Ingrese id del curso:");
						idCurso[i] = br.readLine();
					}while( idCurso[i].length() != 7);
					break;
				case 2:	
					System.out.print("Ingrese nombre del curso:");
					nombCurso[i] = br.readLine();
					break;
				case 3:	
					do	{
						System.out.print("Ingrese creditos del curso:");
						cred[i] = Integer.parseInt(br.readLine());
					}while(cred[i] < 0 || cred[i] > 5);
					break;
				case 4:	
					do	{
						System.out.print("Ingrese ciclo al que pertenece el curso:");
						ciclo[i] = Integer.parseInt(br.readLine());
					}while(ciclo[i] < 0 || ciclo[i] > 10);
					break;
				case 5:
					do	{
						System.out.print("Ingrese id del curso pre-requisito:");
						idPrereq[i] = br.readLine();
					}while( idPrereq[i].length() != 7 && idPrereq[i] != null);
					break;
			}
		}
	return;
	}
	
	static void eliminar(int NC,String idCurso[],String nombCurso[],int cred[],int ciclo[],String idPrereq[],int posNC)throws IOException
	{
	
	}
	static void consultarNC(int NC,String idCurso[],String nombCurso[],int cred[],int ciclo[],String idPrereq[])throws IOException
	{int i,posNC=-1;
	 String cursox;
	 	System.out.print("***Consulta de nombre de curso***");
	 	System.out.print("Ingrese nombre de curso: ");
	 	cursox=br.readLine();
	 	for(i=0;i<NC;i++){
	 		if(nombCurso[i].compareTo(cursox)==0){
	 			posNC=i;
	 			i=N;
	 		}
	 	}
	 	if(posNC==-1){
	 		System.out.print("Dato buscado no encontrado");
	 	}
	 	else{
	 		System.out.print("-Datos del curso buscado-");
	 		System.out.print("\tnombre del curso\tid del curso\tcreditos\tciclo\tidPrereq");
	 		System.out.print("\t"+nombCurso[posNC]+"\t"+idCurso[posNC]+"\t"+cred[posNC]+"\t"+ciclo[posNC]+"\t"+idPrereq[posNC]);
	 	}
	 return posNC;
	}
	static void consultarC(int NC,String idCurso[],String nombCurso[],int cred[],int ciclo[],String idPrereq[])throws IOException
	{
		
	}
	static void ordenarNC(int NC,String idCurso[],String nombCurso[],int cred[],int ciclo[],String idPrereq[])throws IOException
	{
		
	}
				
	static void terminar()throws IOException{
	 	System.out.print("Fin del programa...");
	 	return;
	 }
	
	
	
		
}
 