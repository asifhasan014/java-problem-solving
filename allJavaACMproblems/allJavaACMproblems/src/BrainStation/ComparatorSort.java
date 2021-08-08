/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BrainStation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Asif Hasan
 */
public class ComparatorSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Test Case Number");
        int testCases = Integer.parseInt(in.nextLine());
        System.out.println("####################################");

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            
            System.out.print("Enter Id : ");
            int id = in.nextInt();
            System.out.print("Enter Name : ");
            String name = in.next();
            System.out.print("Enter Cgpa : ");
            double cgpa = in.nextDouble();
            System.out.println("####################################");

            Student st = new Student(id, name, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s2.getCgpa() > s1.getCgpa()) {
                    return 1;
                } else if (s2.getCgpa() < s1.getCgpa()) {
                    return -1;
                }
                return s1.getName().compareTo(s2.getName());
            }
        });
        System.out.println("your result is : ");
        for (Student st : studentList) {
            System.out.println(st.getName());
        }
    }
}
