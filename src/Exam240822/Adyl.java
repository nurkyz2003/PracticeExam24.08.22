package Exam240822;

import java.util.Scanner;

public class Adyl extends People{
    public Adyl(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }
    @Override
    public void work(String firstName) {
        System.out.println(firstName + " - Akter");
    }

    @Override
    public void toRelax() {
        System.out.println("Jylyna uch jolu Moldaviyada,Dubaida,Egipette es alat");
    }

    @Override
    public void communications() {
        System.out.println("Adamdar mn til tabywuusu jakwy");

    }

    @Override
    public void timetable() {
        String day1 = "Syemka";
        String day2 = "Dem aluu";
        String day3 = "Syemka";
        String day4 = "Dem aluu";
        String day5 = "Syemka";
        String day6 = "Dem aluu";
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
