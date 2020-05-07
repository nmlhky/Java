package javaClassWithMrDuran.day38Interface;


public class Planner {
    String plannerName;
    String[][] dateAndEvent;


    public Planner(String plannerName ) {
        this.plannerName = plannerName;
        this.dateAndEvent= new String[1][2];
        this.dateAndEvent[0][0] = "Date";
        this.dateAndEvent[0][1] = "Event";
    }

    public Planner() {
        this.plannerName = "DefaultPlannerName";
        this.dateAndEvent= new String[1][2];
        this.dateAndEvent[0][0] = "Date";
        this.dateAndEvent[0][1] = "Event";


    }

    public void AddEvent(String date , String eventName) {
        String[][] newDateAndEvent = new String[dateAndEvent.length+1][2];

        for (int i=0;i<dateAndEvent.length;i++){
            newDateAndEvent[i][0]=dateAndEvent[i][0];
            newDateAndEvent[i][1]=dateAndEvent[i][1];
        }

        newDateAndEvent[dateAndEvent.length][0] = date;
        newDateAndEvent[dateAndEvent.length][1] = eventName;

        dateAndEvent = newDateAndEvent;
    }

    public void deleteEvent(String date){
        for (int i = 0; i < dateAndEvent.length; i++) {
            if (dateAndEvent[i][0].equals(date)){
                dateAndEvent[i][0] = "";
                dateAndEvent[i][1] = "";
            }

        }
    }

    public void printEvent(){
        for (String[] event:dateAndEvent) {
            System.out.println(event[0] + " " + event[1]);
        }
    }

}
