package questionsAnswers.JavaClub;

import java.util.*;

public class StackWithMinMax {
    private Stack<Integer> minStack ;
    private Stack<Integer> maxStack ;

    public static void main(String[] args) {
        StackWithMinMax test = new StackWithMinMax();
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String sc = scanner.next();
            if (sc.equals("max")){
                System.out.println(test.maxStack.peek());
            }
            else if (sc.equals("pop")){
                test.pop(stack.pop());
            }
            else if (sc.contains("push")){
                int k = scanner.nextInt();
                stack.push(k);
                test.push(k);
            }
        }
    }

    public StackWithMinMax () {
        minStack = new Stack<Integer>();
        maxStack = new Stack<Integer>();
    }

    public void push(int value){
        if (value <= min()) { // Note the '=' sign here
            minStack.push(value);
        }

        if (value >= max()) {
            maxStack.push(value);
        }
    }

    public Integer pop(int value) {

        if (value == min()) {
            minStack.pop();
        }

        if (value == max()) {
            maxStack.pop();
        }

        return value;
    }

    public int min() {
        if (minStack.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return minStack.peek();
        }
    }

    public int max() {
        if (maxStack.isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            return maxStack.peek();
        }
    }
}


