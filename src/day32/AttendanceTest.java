package day32;

public class AttendanceTest {
    public static void main(String[] args) {

        String[] students = {"alex", "joe", "sue", "peter","emily"};
        int[] ids = {1, 2, 3, 4,5};

        Attendance myAtt = new Attendance(students,ids);

        myAtt.enterAttandenceToday("tue");
    }
}
