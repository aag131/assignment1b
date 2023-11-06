/*
Alyssa Goodwin
CSS 342
Assignment 1b
Due: Nov 05, 2023
 */
public class Queue<T> {
    /* for this implementation I'm treating SLL's head as Queue's front and no need to track rear
    because of using SLL doesn't require knowledge of the end */
    SLL<T> list;

    int count;

    public Queue() {
        list = new SLL<T>();
        count = 0;
    }
    public void enqueue (T elem) {
        list.addRear(elem);
        count++;
    }

    public T dequeue() {
        // check for underflow
        if (isEmpty()) {
            throw new IllegalStateException("Cannot call dequeue on empty queue");
        }
        T result = (T) list.get(0);
        list.delete(0);
        count--;
        return result;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot call peek on empty queue");
        }
        return list.get(0);
    }
    @Override
    public String toString() {
        String result = "";
        if (count == 0) {
            result = "Queue is empty";
        } else {
            result = list.toString();
        }
        return result;
    }
    // private helper to check for underflow
    private boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

}
