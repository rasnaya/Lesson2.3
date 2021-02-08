package lesson2;

public class NewTask5 {

    public static void main(String[] args) {
        int abcd = 9669;

        while ( abcd > 0 ) {
            int n = abcd % 10;
            abcd = abcd / 10;
            System.out.println(n);
        }

}
}
