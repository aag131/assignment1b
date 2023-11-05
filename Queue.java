public class Queue<T> {
    // for this implementation I'm treating SLL's head as Queue's front and no need to track rear
    // because adding to the end of a linked list is easy
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
        return list.toString();
    }
    // private helper to check for underflow
    private boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }
    // private helper to get size/count
    private int size() {
        return count;
    }
    // node class for queue; I did try using SLL's node class, but it got too messy
    static class Node<T> {
        private T elem;
        private Node<T> next;
        Node() {
            elem = null;
            next = null;
        }
    }
}
