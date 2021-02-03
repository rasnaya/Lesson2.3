package lesson2;

public class NewTask6 {
    public static void main(String[] args) {
        int abcd = 3453;
        while (abcd < 4444) {
            System.out.println(abcd++);
        }

        if (abcd % 2 ==0) { System.out.println("четное");
        } else {
            System.out.println("не четное");
        }
        if (abcd > 99 && abcd <= 999) {
    System.out.println("трехзначное");
} else { System.out.println("не трехзначное");
}

    }

}
