package Exam240822;

public abstract class People {
    int id;
    String firstName;
    String lastName;
    int age;
    String email;
    String city;

    public People(int id, String firstName, String lastName, int age, String email, String city) {
        this.id = id;
        if(firstName.equals(getClass().getSimpleName())) {
            this.firstName = firstName;
        }
        else System.out.println("Attaryn almashtyryp jatasyz!");
        this.lastName = lastName;
        if(age>0 && age<110) {
            this.age = age;
        }
        else System.out.println("Ters san beruugo jana jik jaw beruugo bolboyt");
        if(email.endsWith("@gmail.com")){
            this.email = email;
        }
        else System.out.println("'@gmail.com' jok, kairadan tekwerip korunuz!");
        this.city = city;
    }

    public abstract void work(String firstName);
    public abstract void toRelax();
    public abstract void communications();
    public abstract void timetable();

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

}
