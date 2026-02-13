package edu.sdccd.cisc191;

import java.util.Arrays;

/**
 * Module 1 - Demo runner.
 * This is primarily for your video demo.
 */
public class Main {
    public static void main(String[] args) {
        // TODO: Create at least 6 students and demonstrate:
        // - original order
        // - sorted-by-GPA order
        // - topNByGpa with N=3
        // - findByIdLinear with existing and non-existing id
        System.out.println("Module 1 Demo (implement me!)");

        Student[] students = {
                new Student("Ken", 3.2, 103),
                new Student("Tom", 3.4, 995),
                new Student("Jake", 3.5, 996),
                new Student("Mike", 3.7, 997),
                new Student("Mason", 3.9, 998),
                new Student("Brian", 3.8, 999)
        };
        
        System.out.println("original order");
        Arrays.stream(students).forEach(System.out::println);

        System.out.println("\nsorted by gpa (desc):");
        Student[] sorted = StudentArrayToolkit.copySortedByGpaDesc(students);
        Arrays.stream(sorted).forEach(System.out::println);

        System.out.println("\ntop 3 students:");
        Student[] top3 = StudentArrayToolkit.topNByGpa(students, 3);
        Arrays.stream(top3).forEach(System.out::println);

        System.out.println("\nfind id 103");
        System.out.println(StudentArrayToolkit.findByIdLinear(students, 103));

        System.out.println("\nfind id 999");
        System.out.println(StudentArrayToolkit.findByIdLinear(students, 999));
    }
}
