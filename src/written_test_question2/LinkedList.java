package written_test_question2;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Meal meal) {
        Node newNode = new Node(meal);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(Meal meal) {
        if (isEmpty()) {
            return;
        }
        if (head.data.equals(meal)) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(meal)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public Meal find(String mealName) {
        Node current = head;
        while (current != null) {
            if (current.data.getName().equals(mealName)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node current = head;
        while (current != null) {
            stringBuilder.append(current.data.toString());
            stringBuilder.append("\n");
            current = current.next;
        }
        return stringBuilder.toString();
    }
}
