package lesson2;

public class NewTask4 {
    public static void main(String[] args) {
        int array [] = {6,7,8,9};

        int number1 = 9;
        int number2 = 8;
        int number3 = 7;
        int number4 = 6;


        for (int i = 0; i < array.length; i++) {
            if (array [i] > 3 && array [i] <8){
                System.out.println(array [i]);
            }
        }

        int result = number4 * 1000 + number3 * 100 + number2 *
                10 + number1 * 1;
        System.out.println("Число" + number4 + "" + number3 + "" + number2
                + "" + number1);
    }
}
