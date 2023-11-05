public class Queue<T> {
    Node<T> front;
    Node<T> rear;
    int count;

    public Queue() {
        front = null;
        rear = null;
        count = 0;
    }
    public void enqueue (T elem) {
        Node temp = new Node();
        temp.elem = elem;
        if (isEmpty()) {
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = rear.next;
            count++;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot call dequeue on empty queue");
        }
        T result = front.elem;
        front = front.next;
        count--;
        if (count == 0) {
            rear = null;
        }
        return result;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot call peek on empty queue");
        }
        return front.elem;
    }
    @Override
    public String toString() {
        String result = "";
        if (isEmpty()) {
            result = "Queue is empty";
        } else {
            Node curr = front;
            result = "[" + curr.elem;
            for (int i = 1; i < size() - 1; i++) {
                curr = curr.next;
                result += "," + curr.elem;

            }
            result += "]";
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
