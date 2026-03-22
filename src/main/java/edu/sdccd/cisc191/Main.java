package edu.sdccd.cisc191;

//import
//removed arrayslist because its not working for me?
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        // TODO create students
        List<Student> students = Arrays.asList(
                new Student("Abe", 3.9, 1001),
                new Student("Andre",   3.9, 1002),
                new Student("Jace", 3.7, 1003),
                new Student("Justin", 2.1, 1004),
                new Student("Collin",   3.8, 1005),
                new Student("Chris", 4.0, 1006)
        );
        // TODO demonstrate filtering
        //added \n infront to match the other format
        System.out.println("\nStudents with GPA >= 3.0");
        List<Student> filtered = StudentAnalyzer.filter(students, s -> s.getGpa() >= 3.0);
        for (Student s : filtered) {
            System.out.println(s);
        }

        // TODO demonstrate sorting
        System.out.println("\nStudents sorted by name");
        List<Student> byName = StudentAnalyzer.sort(students, Comparator.comparing(Student::getName));
        for (Student s : byName) {
            System.out.println(s);
        }

        System.out.println("\nStudents sorted by GPA (highest first)");
        List<Student> byGpa = StudentAnalyzer.sort(students, (a, b) -> Double.compare(b.getGpa(), a.getGpa()));
        for (Student s : byGpa) {
            System.out.println(s);
        }

        // TODO print average GPA
        //changed to printf to match the other layouts (println)
        System.out.println("\nAverage GPA: " + StudentAnalyzer.averageGpa(students));

    }
}