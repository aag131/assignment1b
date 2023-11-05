public class DropOutStack<T> {
    T[] arr;
    int top;
    public DropOutStack(int capacity) {
        arr = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T elem) {
        // check for overflow and if true assigns top to the beginning of the array
        if(isFull()) {
            top = 0;
            arr[top] = elem;
        }
        // assigns top to the next index and will overwrite the bottom of the stack
        // if the stack is at capacity
        top++;
        arr[top] = elem;
    }

    public T pop() {
        // check for underflow and throw exception
        if (isEmpty()) {
            throw new IllegalStateException("Cannot call pop() on empty stack");
        }
        T temp = arr[top];
        top--;
        return temp;
    }

    public T peek() {
        // check for underflow and throw exception
        if (isEmpty()) {
            throw new IllegalStateException("Cannot call pop() on empty stack");
        }
        return arr[top];
    }

    @Override
    public String toString() { // TODO write toString method
        return "";
    }

    //private helper method to check for underflow
    private boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }
    // private helper method to check for overflow. In drop out stack imlementation,
    // it mostly just checks if the top is at the end of the array
    private boolean isFull() {
        if (top==arr.length-1) {
            return true;
        }
        return false;
    }

}
