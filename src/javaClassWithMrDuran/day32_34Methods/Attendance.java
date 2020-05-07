package javaClassWithMrDuran.day32_34Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Attendance {
    private String[] students ;
    private int[] studentId;
    static int[][] weekly ;
    final String[] days = {"mon", "tue", "wed", "thu", "fri"};

    public Attendance(String[] students, int[] studentId) {
        this.students = students;
        this.studentId = studentId;
        weekly = new int[5][students.length];
    }
    
    public void enterAttandenceToday(String today){
        int index = findDayIndex(today);
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < weekly[0].length; i++) {
            System.out.println(days[index] + " " + students[i] + " is here");
            weekly[index][i] = in.nextInt();
        }
    }

    public void printWeekly(){
        System.out.print("\t\t");
        for (String student : students) {
            System.out.print(student + "\t\t");
        }
        System.out.println();

        for (int i = 0; i < weekly.length; i++) {
            System.out.print(days[i] +"\t\t");
            for (int j = 0; j < weekly[0].length; j++) {
                System.out.print(weekly[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    private int findDayIndex(String today){

        if( today.contains("mon") ) return 0;
        if( today.contains("tue") ) return 1;
        if( today.contains("wed") ) return 2;
        if( today.contains("thu") ) return 3;
        if( today.contains("fri") ) return 4;
        return -1;
    }

    public void printDaily (String today){
        int index = findDayIndex(today);
        for (int i = 0; i < weekly[0].length; i++) {
            System.out.println(weekly[index][i] );
        }
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
