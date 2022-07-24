public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        User user = new User();
        user.setName("Frank");
        user.setSurname("Marcet");

        String name = user.getName();
        String surname = user.getSurname();

        //System.out.println(name);
        //System.out.println(surname);
        System.out.print(user.getName() + " " + user.getSurname());



    }
}

class User
{
    private String name;
    private String surname;
    private boolean state = true;


    // Getters && Setters (no son necesarios para prop que solo vamos a usar dentro de la clase)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (this.state){
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}

abstract class Vehicle
{
    private String type;
    private String sound;
    private float maxSpeed;

    //abstract public void setSounds(String sound){};
    //abstract public String getSpeed(){};


    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
