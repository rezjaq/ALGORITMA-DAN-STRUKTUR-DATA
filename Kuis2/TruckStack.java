public class Stack {
    Node top;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(Truck Kendaraan) {
        Node newNode = new Node(Kendaraan);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.setPrev(top);
            top.setNext(newNode);
            top = newNode;
        }
    }

    public Truck pop() {
        if (isEmpty()) {
            return null;
        } else {
            Node popNode = top;
            top = top.getPrev();

            if (top != null) {
                top.setNext(null);
            }
            return popNode.getTruck();
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack masih kosong");
        } else {
            Node current = top;
            while (current != null) {
                System.out.println("Truck " + current.getTruck().getNumber());
                current = current.getPrev();
            }
        }
    }
}