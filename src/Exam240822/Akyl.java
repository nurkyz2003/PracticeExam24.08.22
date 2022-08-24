package Exam240822;

import java.util.Scanner;

public class Akyl extends People{
    public Akyl(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }
    @Override
    public void work(String firstName) {
        System.out.println(firstName + " - Stroitel");
    }
    @Override
    public void toRelax() {
        System.out.println("Jylyna bir jolu Prirodada es alat");
    }

    @Override
    public void communications() {
        System.out.println("Adamdar mn til tabywuusu sonun");

    }

    @Override
    public void timetable() {
        String day1 = "Jumuw";
        String day2 = "Jumuw";
        String day3 = "Jumuw";
        String day4 = "Jumuw";
        String day5 = "Jumuw";
        String day6 = "Jumuw";
        String day7 = "Jumuw";
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
