package javaClassWithMrDuran.day38Interface;

public class PlannerTest {
    public static void main(String[] args) {
        Planner plan = new Planner("planner");
        plan.printEvent();

        plan.AddEvent("may 15","java");



        plan.AddEvent("april 15","PHp");


        plan.printEvent();

        System.out.println("-------");

        plan.deleteEvent("may 15");


        plan.printEvent();

        plan.AddEvent("jun 20","HTML");

        plan.printEvent();
    }
}
