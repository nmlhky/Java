package javaClassWithMrDuran.day55Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(123,"joe",15));
        students.add(new Student(78,"sue",5));
        students.add(new Student(55,"jan",8));
        students.add(new Student(156,"alex",13));

        Collections.sort(students,new IdSorting());

        for (Student st : students) {
            System.out.println(st.id +" "+ st.name + " " + st.age);
        }

        Collections.sort(students,new AgeSorting());

        for (Student st : students) {
            System.out.println(st.id +" "+ st.name + " " + st.age);
        }

        Collections.sort(students,new NameSorting());

        for (Student st : students) {
            System.out.println(st.id +" "+ st.name + " " + st.age);
        }
    }
}
