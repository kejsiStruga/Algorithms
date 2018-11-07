package Adt.ds.stack;

public class Stack {

    private int maxSize; // stack size
    private char[] stackArray; // array that will contain the items
    private int top; // index pos of the last item placed on the stack

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char item) {
        if(isFull()) {
            System.out.println("Stack already full!");
        } else {
            top++;
            stackArray[top] = item;
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is already empty");
            return 0;
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public char peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top==-1);
    }

    public boolean isFull() {
        return (maxSize-1 == top);
    }
}
