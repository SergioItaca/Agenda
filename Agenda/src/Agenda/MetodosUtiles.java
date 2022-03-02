package Agenda;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public interface MetodosUtiles {
static Scanner sc = new Scanner(System.in);
	
	//metodos para grabar y escribir
	
	//metodo grabar persona
			
	//metodo para leer el fichero
	
	//metodo para buscar en el fichero
	
	//metodo grabar persona
	public  grabarPersona() throws IOException {
		FileWriter fichero;
		fichero = new FileWriter ("agenda.txt", true);
		fichero.write( );
		fichero.close();
	
}
	
	//metodo para crear persona
	public static void creacionPersona(){
		//boolean terminar para controlar la salida
				boolean terminar=true;
				
				//bucle while donde se ejecutrará el menú
				while (terminar==true) {
					
					//titulo del menú
					System.out.println("       CREACION DE PERSONAS");
					//salto de linea
					System.out.println();
					//imprimo las opciones del menú
					System.out.println("--Pulse '0' si quiere dejar de registrar Personas");
					System.out.println("--Pulse '1' si quiere registrar una Persona"); 
					
					//Leo la opcion elegida y la convierto a entero 
					int opcion = Integer.parseInt(sc.nextLine());
					
					//creo el objeto Persona al que voy a asignar los datos
					Persona datosPersona = new Persona();
					
					//bucle if para darle valor false al boolean y salir del bucle en caso de que el usuario marque el '0'
					if (opcion == 0) {
						terminar=false;
						System.out.println("Registro finalizado.");
					}
					
					//bucle if para registrar datos en caso de que el usuario pulse '1'
					
					if(opcion == 1) {
						
						System.out.println("Introduce el nombre: ");
						//paso el nombre al objeto
						datosPersona.setNombre(sc.nextLine());
						//paso el apellido al objeto
						System.out.println("Introduce el apellido: ");
						datosPersona.setApellido(sc.nextLine());
						//paso la edad al objeto
						System.out.println("Introduce la edad: ");
						datosPersona.setEdad(Integer.parseInt(sc.nextLine()));
						//paso la ocupacion al objeto
						System.out.println("Introduce la ocupacion: ");
						datosPersona.setOcupacion(sc.nextLine());
						//paso le correo al objeto
						System.out.println("Introduce el correo: ");
						datosPersona.setCorreo(sc.nextLine());
						
					}
					
					
					
				}
	}
	
	
	
	
	
	
	
	
	
	//metodos para dar formato al texto
	
	//metodo para convertir de mayusculas a minusculas
		public static String convertirMinusculas (String mayusculas) {
			//Scanner sc = new Scanner(System.in);
			String palabra="";
			String texto="";
			String textoFinal;
			System.out.println("Inserta el mensaje en mayusculas que quieres convertir a minusculas");
			texto=sc.nextLine();
			
			//con el metodo toLowerCase, convierto a minusculas todo el texto al que se lo aplique
			textoFinal=texto.toLowerCase();
			
			System.out.println(textoFinal);
			
			return mayusculas;
		}
		
		//metodo para cambiar los espacios por puntos y comas
		public static String cambioEspacios(String espacios) {
			
			//Scanner sc = new Scanner(System.in);
			String texto="";
			String textoFinal;
			System.out.println("Inserta el texto a modificar");
			texto=sc.nextLine();
			
			//con el metodo replace, entre parentesis, le indico lo que quiero que me modifique, y que quiero que me ponga, separado por una coma
			textoFinal=texto.replace(" ", ";");
			
			System.out.println(textoFinal);
			
			
			return espacios;
		}
		
		//metodo para quitar las tildes
			public static String quitarTildes(String tildes) {
				//Scanner sc = new Scanner (System.in);
				String texto;
				String textoFinal="";
				System.out.println("Inserte el texto que desea modificar");
				texto=sc.nextLine();
				
				
				//creo un array donde voy a guardar los caracteres del texto
				char [] cadena = new char [1000];
				
				//con el metodo .toCharArray separo la cadena por caracteres y se lo aplico a cada posicion del array
				cadena = texto.toCharArray();
				
				//bucle for para recorrer el array 
				for(int i =0; i<cadena.length;i++) {
					//en los if, identifico el caracter con tilde y lo cambio por el mismo caracter pero sin tilde
					if(cadena[i]=='á') {
						cadena[i]='a';
					}
					if(cadena[i]=='é') {
						cadena[i]='e';
					}
					if(cadena[i]=='í') {
						cadena[i]='i';
					}
					if(cadena[i]=='ó') {
						cadena[i]='o';
					}
					if(cadena[i]=='ú') {
						cadena[i]='u';
					}
					if(cadena[i]=='Á') {
						cadena[i]='A';
					}
					if(cadena[i]=='É') {
						cadena[i]='E';
					}
					if(cadena[i]=='Í') {
						cadena[i]='I';
					}
					if(cadena[i]=='Ó') {
						cadena[i]='O';
					}
					if(cadena[i]=='Ú') {
						cadena[i]='U';
					}
					
					textoFinal=textoFinal+(char)(cadena[i]);
					
				}
				System.out.println(textoFinal);
				//reseteo la cadena
				textoFinal="";
				
				
				return tildes;
			}
			
			
		//metodo para suprimir mas de dos espacios seguidos por un espacio
			public static String acortarEspacios(String acortarEspacios) {
				//Scanner sc = new Scanner(System.in);
				String texto="";
				String textoFinal="";
				System.out.println("Inserta el texto que quieres modificar");
				texto=sc.nextLine();
				
				//con el metodo replaceAll le indico con el parentesis y el + que cuando haya mas de un espacio seguido sean cambiados por uno solo
				textoFinal= texto.replaceAll("( )+" , " ");

				System.out.println(textoFinal);
				
				
				return acortarEspacios;
			}
}
