public class Queue<T> {
    Node<T> front;
    Node<T> rear;
    int count;

    public Queue() {
        front = null;
        rear = null;
        count = 0;
    }
    public void enqueue (T elem) { /* TODO write enqueue method */
        Node temp = new Node();
        temp.elem = elem;
        if (isEmpty()) {
            front = rear = temp;
        } else {
            rear.next = temp;
        }
    }

    public T dequeue() { // TODO write dequeue method
        return null;
    }

    public T peek() { // TODO write peek method
        return null;
    }
    @Override
    public String toString() { // TODO write toString method
        return "";
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

    static class Node<T> {
        private T elem;
        private Node<T> next;
        Node() {
            elem = null;
            next = null;
        }
    }
}
