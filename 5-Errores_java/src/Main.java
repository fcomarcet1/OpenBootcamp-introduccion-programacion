public class Main
{
    public static void main(String[] args) {


        System.out.println("Hello world!");

        int[][] num = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
        };

        int value = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " "); // 10 20 30 40 50 60 70 80
            }
            System.out.println(); //  10 20 30 40
                                  //  50 60 70 80
        }



        //System.out.println("Hello world!");
    }
}
