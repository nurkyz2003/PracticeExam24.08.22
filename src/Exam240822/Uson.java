package Exam240822;

import java.util.Scanner;

public class Uson extends People {
    public Uson(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }

    @Override
    public void work(String firstName) {
        System.out.println(firstName + " - Mugalim");
    }

    @Override
    public void toRelax() {
        System.out.println("Eki jylda bir jolu Issyk-Koldo es alat");
    }

    @Override
    public void communications() {
        System.out.println("Adamdar mn til tabywuusu mykty");

    }

    @Override
    public void timetable() {
        String day1 = "Jumuw";
        String day2 = "Jumuw";
        String day3 = "Jumuw";
        String day4 = "Jumuw";
        String day5 = "Jumuw";
        String day6 = "Jumuw";
        String day7 = "Dem aluu";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grafigin korgunuz kelgen juma kunun tandanyz: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1 -> System.out.println(day1);
            case 2 -> System.out.println(day2);
            case 3 -> System.out.println(day3);
            case 4 -> System.out.println(day4);
            case 5 -> System.out.println(day5);
            case 6 -> System.out.println(day6);
            case 7 -> System.out.println(day7);
            default -> System.out.println("Mynday juma kunu jok");

        }
    }
}
