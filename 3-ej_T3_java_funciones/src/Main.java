/*Primera parte:
        Crear una función con tres parámetros que sean números que se suman entre sí.
        Llamar a la función en el main y darle valores.

Segunda parte:
        Crear una clase coche.
        Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        Una función que incremente el número de puertas que tiene el coche.
        Crear un objeto miCoche en el main y añadirle una puerta.
        Mostrar el número de puertas que tiene el objeto.
*/

public class Main
{
    public static void main(String[] args) {
        //int result = 0;

        int result = sum(4, 16, 25);

        Car miCoche = new Car();
        miCoche.addDoors();

        //System.out.println("Hello world!");
        System.out.println(result);
        System.out.println(miCoche.numDoors);

    }

    public static int sum (int value1, int value2, int value3) {
        return value1 + value2 + value3;
    }


}

class Car
{
    public int numDoors = 2;

    public void addDoors (){
        this.numDoors++;
    }

}





