package lesson3;

public class Hometask6 {
    public static void main(String[] args) {

        int StartDist = 10;
        int Distance = 100;

        double res =StartDist;
        int day =7;

        for (int i = 1; i <= 7; i++);

        while(res<Distance){
            res = res +(StartDist*0.1);
            day++;
        }
        System.out.println("Day: "+day);
        System.out.println("Result: "+res);

    }
}

