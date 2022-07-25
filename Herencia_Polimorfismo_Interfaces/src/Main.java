public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Ferrari ferrari = new Ferrari();
        Fiat fiat = new Fiat();

        ferrari.checkCarLicensePlate("111");
        ferrari.setSound("test sound");
        ferrari.sayHello();
        fiat.checkCarLicensePlate("222");

    }
}

class Vehicle
{
    private float maxSpeed;
    private String gasolineType;

    public String sayHello(){
        return "Hello";
    }

    public Boolean checkCarLicensePlate (String LicensePlate){
        if (!(LicensePlate == "XXX")) {
            return true;
        }
        return false;
    }
}


class Fiat extends Vehicle
{
    private int numDoors;

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
}

class Ferrari extends Vehicle
{
    private String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
// con final no se podra heredar de esta clase
final class Tesla extends Vehicle
{
    private float kw;

}


