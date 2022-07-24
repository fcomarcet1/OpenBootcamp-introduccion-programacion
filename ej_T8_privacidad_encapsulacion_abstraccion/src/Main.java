/*Crear clase Persona.
  Crear variables las privadas edad, nombre y telefono de la clase Persona.
  Crear gets y sets de cada propiedad.
  Crear un objeto persona en el main.
  Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
*/
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Pepe");
        persona.setEdad(55);
        persona.setTelefono(610666666);

        System.out.println(persona.getNombre() + " " + persona.getEdad() + " " + persona.getTelefono());
    }
}

class Persona
{
    private int edad;
    private String nombre;
    private int telefono;



    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
