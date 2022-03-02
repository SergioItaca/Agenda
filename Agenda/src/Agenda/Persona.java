package Agenda;

import java.io.FileWriter;
import java.io.IOException;

public class Persona {
	
	// defino las variables donde voy a guardar los atributos
	String nombre;
	String apellido;
	String ocupacion;
	int edad;
	String correo;
	String codigoPais;
	String telefono;
	String dni;
	
	//creo la clase Persona para salvar un error
	public Persona(){
		
	}
	
	//constructor para asignar los valores a las variables
	public Persona (String nombre, String apellido, int edad, String ocupacion, String correo, String codigoPais, String telefono, String dni){
        this.nombre=nombre;
        this.apellido = apellido; 
        this.edad=edad;
        this.ocupacion=ocupacion;
        this.correo=correo;
        this.codigoPais=codigoPais;
        this.telefono=telefono;
        this.dni=dni;
        		
	}
	
	
	//creo los set y get de los atributos del objeto persona para que recogan los valores que se le asignen.
	

	public void setNombre (String y){
        nombre=y;
    }

	public String getNombre() {
		return nombre;
	}
	
	

		public void setApellido (String a){
	        apellido=a;
	 }
		

		public String getApellido() {
			return apellido;
	 }
		
		

	public void setEdad (int e){
	        edad=e;
	 }

	public int getEdad() {
			return edad;
	 }
	

		public void setOcupacion (String o){
	        ocupacion=o;
	 }
	
		public String getOcupacion() {
			return ocupacion;
	 }
		
		
	
		public void setCorreo (String c){
		correo=c;
	 }
	
		public String getCorreo() {
		return correo;
	 }
	
	
		public String getCodigoPais() {
			return codigoPais;
		}
	
		public void setCodigoPais(String codigoPais) {
			this.codigoPais = codigoPais;
		}

		public String getTelefono() {
			return telefono;
		}
	
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		
		public String getDni() {
			return dni;
		}
		
		public void setDni(String dni) {
			this.dni = dni;
		}

		
				
		//metodo buscar por Nombre (CUIDADO CON LOS COMPUESTOS)
		
		//metodo buscar por Apellido (CUIDADO CON LOS COMPUESTOS)
		
}
