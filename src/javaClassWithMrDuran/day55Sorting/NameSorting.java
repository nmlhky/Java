package javaClassWithMrDuran.day55Sorting;

import java.util.Comparator;

public class NameSorting implements Comparator<Student> {
    public int compare(Student s1 , Student s2){
        if ( s1.name.charAt(0) == s2.name.charAt(0) ) return 0;
        if ( s1.name.charAt(0) > s2.name.charAt(0) ) return 1;
        return -1;
    }
}