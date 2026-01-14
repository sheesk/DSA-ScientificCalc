package scientificcalculator;


public class Stack {
     public static final int SIZE = 1000;
    double[] arr = new double[SIZE];
    int top;

    public Stack() {
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == SIZE - 1;
    }

    public void push(double value) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        arr[++top] = value;
    }

    public double pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top--];
    }

    public double peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }

    public int size() {
        return top + 1;
    }

    
    
}
