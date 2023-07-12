package written_test_question2;

public class Meal {
    private String name;
    private double proteinContentInMilligram;
    private double carbonHydrateContentInMilligram;
    private double fatContentInMilligram;
    private int quantity;

    public Meal(String name,
                double proteinContentInMilligram,
                double carbonHydrateContentInMilligram,
                double fatContentInMilligram,
                int quantity) {
        this.name = name;
        this.proteinContentInMilligram = proteinContentInMilligram;
        this.carbonHydrateContentInMilligram = carbonHydrateContentInMilligram;
        this.fatContentInMilligram = fatContentInMilligram;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProteinContentInMilligram() {
        return proteinContentInMilligram;
    }

    public void setProteinContentInMilligram(double proteinContentInMilligram) {
        this.proteinContentInMilligram = proteinContentInMilligram;
    }

    public double getCarbonHydrateContentInMilligram() {
        return carbonHydrateContentInMilligram;
    }

    public void setCarbonHydrateContentInMilligram(double carbonHydrateContentInMilligram) {
        this.carbonHydrateContentInMilligram = carbonHydrateContentInMilligram;
    }

    public double getFatContentInMilligram() {
        return fatContentInMilligram;
    }

    public void setFatContentInMilligram(double fatContentInMilligram) {
        this.fatContentInMilligram = fatContentInMilligram;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", proteinContentInMilligram=" + proteinContentInMilligram +
                ", carbonHydrateContentInMilligram=" + carbonHydrateContentInMilligram +
                ", fatContentInMilligram=" + fatContentInMilligram +
                ", quantity=" + quantity +
                '}';
    }
}
