package Exam240822;

import java.util.Scanner;

public class Ainur extends People{
    public Ainur(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }
    @Override
    public void work(String firstName) {
        System.out.println(firstName + " - Bloger");
    }
    @Override
    public void toRelax() {
        System.out.println("Jylyna besh jolu Egipette,Parijde,Moldaviyada,Berlinde,New-Yorkto es alat");
    }

    @Override
    public void communications() {
        System.out.println("Adamdar mn til tabywuusu sonun");
    }

    @Override
    public void timetable() {
        String day1 = "Kontent";
        String day2 = "Kontent";
        String day3 = "Kontent";
        String day4 = "Jumuw";
        String day5 = "Kontent";
        String day6 = "Kontent";
        String day7 = "Kontent";
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
