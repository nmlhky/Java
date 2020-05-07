package javaClassWithMrDuran.day38Interface;

public class ExpoPlanner extends Planner {
    String expoName;
    String[] checkList;

    public ExpoPlanner(String plannerName, String expoName, String[] checkList) {
        super(plannerName);
        this.expoName = expoName;
        this.checkList = new String[dateAndEvent.length];
    }


    public void PrintEvendAndCheckList() {
        for (String[] event:dateAndEvent) {
            System.out.println(event[0] + " " + event[1]);
        }

        for (String check :checkList) {
            System.out.println(check);
        }
    }
}
