package javaClassWithMrDuran.day55Sorting;

import java.util.Comparator;

public class IdSorting implements Comparator<Student> {
    public int compare(Student s1,Student s2){
        if (s1.id==s2.id) return 0;
        if (s1.id > s2.id) return 1;
         return -1;
    }
}
