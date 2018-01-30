package oop_lap8;

public class PersonInfo {
    public static void main (String[] args) {
        Student student =new Student(
                "1939900288581",
                "Suchita",
                "Fermale",
                22,
                "359211110036",
                "IS:Management Technology");
        System.out.println(student.toString());

        System.out.println(student.getName());
    }
}
