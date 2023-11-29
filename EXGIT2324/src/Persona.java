
public class Persona {
	    // Propiedades
	    private String nombre;
	    private String apellidos;
	    private int edad;

	    // Constructor
	    public Persona(String nombre, String apellidos, int edad) {
	        this.nombre = nombre;
	        this.apellidos = apellidos;
	        this.edad = edad;
	    }

	    // M�todo para sumar 1 a la edad e imprimir por pantalla
	    public void cumplea�os() {
	        edad++; // Sumar 1 a la edad
	        System.out.println("�Feliz cumplea�os! Ahora tienes " + edad + " a�os.");
	    }

	    // M�todos para obtener los valores de las propiedades
	    public String getNombre() {
	        return nombre;
	    }

	    public String getApellidos() {
	        return apellidos;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    // M�todos para establecer los valores de las propiedades
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public void setApellidos(String apellidos) {
	        this.apellidos = apellidos;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    
	    // M�todo para imprimir los datos de la persona por pantalla
	    public void datosPersona() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Apellidos: " + apellidos);
	        System.out.println("Edad: " + edad);
	    }
	    
	    
	    
	    public static void main(String[] args) {
	        // Ejemplo de uso
	        Persona persona = new Persona("Juan", "P�rez", 25);
	        System.out.println("Nombre: " + persona.getNombre());
	        System.out.println("Apellidos: " + persona.getApellidos());
	        System.out.println("Edad: " + persona.getEdad());

	        // Llamada al m�todo cumplea�os
	        persona.cumplea�os();
	        // Llamada al m�todo datosPersona
	        persona.datosPersona();

	        // Llamada al m�todo cumplea�os
	        persona.cumplea�os();
	    }
		    
	    
	    }
	



   
