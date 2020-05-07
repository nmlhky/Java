package javaClassWithMrDuran.day55Sorting;

import java.util.Comparator;

public class AgeSorting implements Comparator<Student> {
    public int compare(Student s1 , Student s2){
        if (s1.age==s2.age) return 0;
        if (s1.age > s2.age) return 1;
        return -1;
    }
}
