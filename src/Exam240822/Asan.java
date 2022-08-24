package Exam240822;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Asan extends People{
    public Asan(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }

    @Override
    public void work(String firstName) {
        System.out.println(firstName + " - Programmist");
    }

    @Override
    public void toRelax() {
        System.out.println("Jylyna bir jolu Moldaviyada es alat");
    }

    @Override
    public void communications() {
        System.out.println("Adamdar mn til tabywuusu tatal");

    }

    @Override
    public void timetable() {
        String day1 = "Jumuw";
        String day2 = "Jumuw";
        String day3 = "Jumuw";
        String day4 = "Jumuw";
        String day5 = "Jumuw";
        String day6 = "Dem aluu";
        String day7 = "Dem aluu";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grafigin korgunuz kelgen juma kunun tandanyz: ");
        int day = scanner.nextInt();
        switch (day){
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
