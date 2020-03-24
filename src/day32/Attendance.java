package day32;

import java.util.Arrays;

public class Attendance {
    String[] students ;
    int[] studentId;
    int[][] weekly ;
    final String[] days = {"mon", "tue", "wed", "thu", "fri"};

    public Attendance(String[] students, int[] studentId) {
        this.students = students;
        this.studentId = studentId;
        this.weekly = new int[5][students.length];
    }
    
    public void enterAttandenceToday(String today){
        int index = findDayIndex(today);

        System.out.println(index);

    }

    private int findDayIndex(String today){

        if( today.equals("mon") ) return 0;
        if( today.equals("tue") ) return 1;
        if( today.equals("wed") ) return 2;
        if( today.equals("thu") ) return 3;
        if( today.equals("fri") ) return 4;
        return -1;
    }


    @Override
    public String toString() {
        return "Attendance{" +
                "students=" + Arrays.toString(students) +
                ", studentId=" + Arrays.toString(studentId) +
                ", weekly=" + Arrays.toString(weekly) +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}
