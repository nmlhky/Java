package questionsAnswers;
import java.util.Iterator;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;





// Defines a class RandomizedQueue derived from interface Iterable

public class RandomQ<T> implements Iterable

{

// Instance variable to store index of the end in the queue,

// also the number of elements in the queue.

    private int indexQueueEnd = 0;

// Creates an array for the queue

    private T[] randomQueue = (T[]) new Object[1];

// Random class object declared

    private Random randomObj = new Random();

// Method to change the size of the queue

    private void changeQueueSize(int newQueueSize)

    {

        System.out.println("Changes the size of queue from " + randomQueue.length + " to " + newQueueSize);

// Creates a new array with specified size as parameter

        T[] newArray = Arrays.copyOfRange(randomQueue, 0, newQueueSize);

        randomQueue = newArray;

    }// End of method

// Method to return true if queue is empty otherwise returns false

    public boolean isEmpty() {
        return indexQueueEnd == 0;
    }// End of method

// Method to return size of the queue

    public int size() {
        return indexQueueEnd;
    }// End of method

// Method to insert an element to the queue

    public void enQueue(T element) {
// Checks if the element is NULL then throws an exception
        if (element == null)

            throw new NullPointerException();

// Otherwise checks if queue end is equals to the queue length

        if (indexQueueEnd == randomQueue.length)

// Calls the method to double the size of the queue

            changeQueueSize(randomQueue.length * 2);

// Adds the element at indexQueueEnd position and increase the counter by one

        randomQueue[indexQueueEnd++] = element;

    }// End of method

// Method to delete a random element from the queue

    public T deQueue()

    {

// Checks if the queue end index position is zero then throw an exception

        if (indexQueueEnd == 0)

            throw new UnsupportedOperationException();

// Checks if end index position of the queue is less than or equals to the quarter of it is used

        if (indexQueueEnd <= randomQueue.length/4)

// Calls the method to decrease the size of the queue by half

            changeQueueSize(randomQueue.length/2);

// Generates a random index position based on the last index position

        int index = randomObj.nextInt(indexQueueEnd);

// Stores the element randomly selected index which will be returned later

        T returnValue = randomQueue[index];

// Fills the gap (randomly selected index is being deleted) with the last element in the queue

        randomQueue[index] = randomQueue[--indexQueueEnd];

// Sets the end index position to null

        randomQueue[indexQueueEnd] = null;

// Returns the deleted value

        return returnValue;

    }// End of method

// Creates an inner class RanQueueIterator derived from Iterator interface

    private class RanQueueIterator implements Iterator<T>

    {

// Creates an array to store shuffle elements

        private T[] shuffledArray;

// To store current position

        private int current = 0;

// Default constructor

        public RanQueueIterator()

        {

            shuffledArray = randomQueue.clone();

            shuffleElement(shuffledArray);

        }// End of method

        @Override

// Overrides method to return if current position is less than the queue length otherwise returns false

        public boolean hasNext()

        {

            return current < randomQueue.length;

        }// End of method

        @Override

// Overrides the method to return next element

        public T next()

        {

// Calls the method to check whether next element is available or not

// If not then throws an exception

            if (!hasNext())

                throw new NoSuchElementException();

// Otherwise return the current index position data and increase the counter by one

            return shuffledArray[current++];

        }// End of method

// Method to shuffle an array of objects

        public void shuffleElement(T[] tempArray)

        {

// Stores the length of the array

            int len = tempArray.length;

// Loops till length of the array

            for (int counter = 0; counter < len; counter++)

            {

// Generates index between counter and len -1

                int index = counter + (int) (Math.random() * (len - counter));

// Swapping process

                T temp = tempArray[index];

                tempArray[index] = tempArray[counter];

                tempArray[counter] = temp;

            }// End of for loop

        }// End of method

    }// End of inner class

    @Override

// Method to return RanQueueIterator object

    public Iterator<T> iterator()

    {

        return new RanQueueIterator();

    }// End of method

    //--------------------------  main  --------------------------------------//


    public static void main(String[] args){

// Creates an object of the class RandomizedQueue for integer type

        RandomQ<Integer> randomQueue = new RandomQ<>();

// Adds 20 elements

        for (int counter = 0; counter < 20; counter++){

// Calls the method to insert element

            randomQueue.enQueue(counter);

            System.out.println("Added element: " + counter);

            System.out.println("Current number of elements in queue: " + randomQueue.size() + "\n");

        }// End of for loop

        System.out.print("\nIterator test:\n[");

// Loops till end of the queue and displays the elements

        for (Object number: randomQueue)

            System.out.print(number + " ");

        System.out.println("]\n");

// Removes 20 elements for deletion

        for (int counter = 0; counter < 20; counter++)

        {

// Calls the method to delete an element

            System.out.println("Removed element: " + randomQueue.deQueue());

            System.out.println("Current number of elements in queue: " + randomQueue.size() + "\n");

        }// End of for loop

    }// End of main method

}// End of class

