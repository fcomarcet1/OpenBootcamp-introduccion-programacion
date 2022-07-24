public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Car car = new Car(5, 120);
        System.out.println(car.actualSpeed);
        car.speedUp();
        System.out.println(car.actualSpeed);
        car.brake();
        System.out.println(car.actualSpeed);


    }
}

class Car
{
    int doors;
    int maxSpeed;
    float actualSpeed;

    // constructor
    public Car() {
        this.doors = 5;
        this.actualSpeed = 120;
    }

    // constructor overloading -> podemos tener mas de 1 constructor con params o sin params
    public Car(int doors, float actualSpeed) {
        this.doors = doors;
        this.actualSpeed = actualSpeed;
    }

    public void speedUp() {
        actualSpeed += 15;
    }
    public void brake() {
        actualSpeed -= 5;
    }

    // overloading functions
    public int suma(int a, int b){return a + b;}
    public float suma(float a, float b) {return a + b;}


}
