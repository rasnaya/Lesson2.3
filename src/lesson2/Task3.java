package lesson2;

public class Task3 {
    public static void main(String[] args) {
        int s = 4500;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int d = h / 12;
        int week = d / 7;
        System.out.println(week + " недель " + d + " дней " +
                h + " часов " + min + " минут " + sec + " секунд ");
    }
}