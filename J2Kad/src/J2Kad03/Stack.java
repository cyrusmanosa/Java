package J2Kad03;

public class Stack {
    private String[] stack;
    private int sp;

    public Stack(int size) {
        this.stack = new String[size];
        sp = 0;
    }
    public void push(int data) {
        stack[sp++] = data;
    }
    public int pop() {
        return stack[--sp];
    }
    public int getData(int i) {
        return stack[i];
    }
    public int size() {
        return sp;
    }
    public boolean isEmpty() {
        return (sp <= 0);
    }
    public boolean isFull() {
        return (sp >= stack.length);
    }
}
