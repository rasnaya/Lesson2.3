package lesson2;

public class Task5 {

    public static void main(String[] args) {
        int abcd = 9999;
        int d = abcd % 10;
        int abc = abcd / 10;
        int c = abc % 10;
        int ab = abc / 10;
        int b = ab % 10;
        int a = ab / 10;
        if ( a == b && b == c && c==d ) {
            System.out.println("все числа равны");
        } else {
            System.out.println("все числа не равны");
    }
}
}
