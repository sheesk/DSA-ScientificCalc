package scientificcalculator;

public class Char_Stack{
     public static final int SIZE = 1000;
    char[] arr = new char[SIZE];

    int top;

    public Char_Stack() {
        this.top = -1;
    }

    public boolean isFull() {
        return top == SIZE - 1;
    }

    // push an element into the stack
    public void push(char value) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        arr[++top] = value;
    }

    // remove and return the top element from the stack
    public char pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        char value = arr[top];
        top--;
        return value;
    }

    // return the top element of the stack without removing it
    public char peek() {
        if (top == -1) {
            throw new RuntimeException("Stack is Empty");
        }
        return arr[top];
    }

    // return true if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // return the size of stack
    public int size() {
        return top + 1;
    }

    
}
