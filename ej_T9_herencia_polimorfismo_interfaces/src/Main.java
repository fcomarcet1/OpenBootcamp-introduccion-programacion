/*
* Crea una clase Persona con las siguientes variables:
*    La edad
*    El nombre
*    El teléfono
* Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito
* solo para esa clase.
*
* Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito,
* tienes que darles valor y mostrarlas por pantalla.
*
* Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo
* tenga la clase Trabajador.
*
*
* */


public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Cliente cliente = new Cliente();
        cliente.setEdad(20);
        cliente.setNombre("Frank");
        cliente.setTelefono("666666666");

        System.out.print("El cliente: " + cliente.getNombre() + " tiene la edad: " + cliente.getEdad()
                + ", su telefono es: " + cliente.getTelefono() );

    }
}

class Persona
{
    public int edad;
    public String nombre;
    public String telefono;

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}


class Cliente extends Persona
{
    private int credito;
}

class Trabajador extends Persona
{
    private int salario;
}

