package Agenda;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
static int opcion;
static Scanner entrada = new Scanner(System.in);
static boolean terminar=true;
	public static void main(String[] args) {
		
		
				
		//Creo la agenda
		File agenda =new File("Agenda.txt");
		
		//creo la lista
		List <String> Agenda = new ArrayList ();
		
		while(terminar==true) {
			//creo el menu
			System.out.println("¿QUE DESEA HACER? \n");
			System.out.println("Pulse 1 si quiere registrar personas");
			System.out.println("Pulse 2 si quiere ver la Agenda \n");
			System.out.println("Pulse 3 si quiere buscar en la Agenda \n");
			
			int opcion = Integer.parseInt(entrada.nextLine());
			
			 
			if(opcion==1) {
				//creo Personas que van a entrar en la lista
				
				
			}
			
			//doy formato a las personas para guardarlas en la lista
			
			
			//primero las guardo en una lista
			
			
			//guardo la lista en el fichero agenda.txt
			
			
			//muestro el fichero
			if(opcion==2) {
				
				
			}
			
			//busco en el fichero
			if(opcion==3) {
				System.out.println("¿QUE QUIERES BUSCAR?");
				
				
				
			}

		}
		
		
		
	}

}
