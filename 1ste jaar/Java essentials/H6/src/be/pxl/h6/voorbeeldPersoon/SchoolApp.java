package be.pxl.h6.voorbeeldPersoon;

public class SchoolApp {
    public static void main(String[] args) {
        Lector l1 = new Lector();
        Lector l2 = new Lector();
        Lector l3 = new Lector();
        Student s1 = new Student();
        Student s2 = new Student();
        Persoon p1 = new Persoon();

        System.out.println(Lector.getAantal() + " lectoren");
        System.out.println(Student.getAantal() + " studenten");
        System.out.println(Persoon.getAantal() + " personen");
    }
}
