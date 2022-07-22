public class Main {
    public static void main(String[] args)
    {
         String station = "Primavera";
         int count = 0;
         int contador = 2;
         //int i = 0;

        // If
        if(station == "Primavera"){
            System.out.println("Hoy es primavera");
        }
        else if(station =="Verano"){
            System.out.println("Hoy es verano");
        }
        else{
            System.out.println("No es una estacin");
        }

        // while
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        // do-while
        do {
            System.out.println(contador);
            contador--;
        } while (contador > 2);


        // for
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // Ambas son declaraciones válidas para arrays
        //int[] intArray;
        //int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //switch
        switch (station) {
            case "Primavera":
                System.out.println("Hoy es primavera");
                break;
            case "Verano":
                System.out.println("Hoy es verano");
                break;
            default:
                System.out.println("No es una estacion");
                break;
        }




    }
}

