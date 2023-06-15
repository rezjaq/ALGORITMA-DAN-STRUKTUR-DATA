public class TruckQueue {
     Node front, rear;

    public TruckQueue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Truck Kendaraan) {
        Node newNode = new Node(Kendaraan);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.setPrev(rear);
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public Truck dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            Node removNode = front;
            front = front.getNext();
            if (front == null) {
                rear = null;
            } else {
                front.setPrev(null);
            }
            return removNode.getTruck();
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            Node current = front;
            while (current != null) {
                System.out.println("Truck " + current.getTruck().getNumber());
                current = current.getNext();
            }
        }
    }
}