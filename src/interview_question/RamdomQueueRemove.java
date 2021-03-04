package interview_question;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class RamdomQueueRemove {

    Queue<Integer> randomQueue = new LinkedList<>();
    Random random = new Random();

    public int addToQueue (){

        int rnd = random.nextInt(100);
        randomQueue.add(rnd);

        return rnd;
    }


    public int removeFromQueue (){
        int rnd = random.nextInt(5);

        for (int i = 0; i < rnd; i++) {
            if (randomQueue.isEmpty())break;
            randomQueue.remove();
        }

        return rnd;
    }


    public void printQueue(){
        System.out.print("\nQueue print:\n");
        for (Integer i: randomQueue) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }


    //--------------------------  main  --------------------------------------//
    public static void main(String[] args){

        RamdomQueueRemove q = new RamdomQueueRemove();

        // Adds 20 elements
        for (int i = 0; i < 20; i++){
            System.out.println("Added element: " + q.addToQueue());
        }

        //print
        q.printQueue();


        // Remove
        while (!q.randomQueue.isEmpty()){
            System.out.println("Removed element quanty: " + q.removeFromQueue());
        }

    }
}
