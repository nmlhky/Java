package day32_34;

public class AttendanceTest {
    public static void main(String[] args) {

        String[] students = {"leo", "joe", "sue", "ivy","mia","lily"};
        int[] ids = {1, 2, 3, 4,5};

        Attendance myAtt = new Attendance(students,ids);

        myAtt.enterAttandenceToday("thu");

        myAtt.printWeekly();
    }
}
