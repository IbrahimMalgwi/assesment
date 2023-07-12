package written_test_question2;

public class Meal {
    private String name;
    private int quantity;

    public Meal(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return name + ", " + quantity;
    }
}
