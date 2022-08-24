package Exam240822;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Asan person1 = new Asan(1180989,"Asan","Kasymov",32,"asankasymov32@gmail.com","Biwkek");
        Adyl person2 = new Adyl(1180832,"Adyl","Allanov",28,"adylallanov28@gmail.com","Ow");
        Akyl person3 =  new Akyl(1180836,"Akyl","Zhaparov",41,"akylzhaparow@gmail.com","Batken");
        Ainur person4 = new Ainur(1180431,"Ainur","Urbaeva",22,"ainururbaeva@gmail.com","Biwkek");
        Uson person5 = new Uson(1180726,"Uson","Kasymov",32,"usonkasymov@gmail.com","Biwkek");

        People[] persons = {person1,person2,person3,person4,person5};
        Asan[] asans = new Asan[1];
        Adyl[] adyls = new Adyl[1];
        Akyl[] akyls = new Akyl[1];
        Ainur[] ainurs = new Ainur[1];
        Uson[] usons = new Uson[1];
         for (People i : persons) {
             if (i instanceof Asan) {
                 System.out.println("'''''''''''''''''''''''' Informations abut ASAN'''''''''''''''''''''");
                 ((Asan) i).work(i.getFirstName());
                 ((Asan) i).toRelax();
                 ((Asan) i).communications();
                 //((Asan) i).timetable();
                 asans[0] = (Asan) i;
             } else if (i instanceof Uson) {
                 System.out.println("'''''''''''''''''''''''' Informations abut USON'''''''''''''''''''''");
                 ((Uson) i).work(i.getFirstName());
                 ((Uson) i).toRelax();
                 ((Uson) i).communications();
                 //((Uson) i).timetable();
                 usons[0] = (Uson) i;
             } else if (i instanceof Adyl) {
                 System.out.println("'''''''''''''''''''''''' Informations abut ADYL'''''''''''''''''''''");
                 ((Adyl) i).work(i.getFirstName());
                 ((Adyl) i).toRelax();
                 ((Adyl) i).communications();
                 //((Adyl) i).timetable();
                 adyls[0] = (Adyl) i;
             } else if (i instanceof Akyl) {
                 System.out.println("'''''''''''''''''''''''' Informations abut AKYL'''''''''''''''''''''");
                 ((Akyl) i).work(i.getFirstName());
                 ((Akyl) i).toRelax();
                 ((Akyl) i).communications();
                 //((Akyl) i).timetable();
                 akyls[0] = (Akyl) i;
             } else if (i instanceof Ainur) {
                 System.out.println("'''''''''''''''''''''''' Informations abut AINUR'''''''''''''''''''''");
                 ((Ainur) i).work(i.getFirstName());
                 ((Ainur) i).toRelax();
                 ((Ainur) i).communications();
                 //  ((Ainur) i).timetable();
                 ainurs[0] = (Ainur) i;
             }
         }
             Scanner scanner = new Scanner(System.in);
             String name1 = scanner.nextLine();
             if (name1.equals("Asan")){
                 person1.timetable();
             }
              else if (name1.equals("Uson")){
                 person5.timetable();
             }
             else if (name1.equals("Akyl")){
                 person3.timetable();
             }
             else if (name1.equals("Adyl")){
                 person2.timetable();
             }
             else if (name1.equals("Ainur")){
                 person4.timetable();
             }
         }
    }