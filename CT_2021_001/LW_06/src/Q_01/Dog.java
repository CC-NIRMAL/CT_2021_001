package Q_01;


public class Dog extends Pet {
    private double weight;

    public void setWeight(double w) {
        weight = w;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String speak() {
        return "Woof!";
    }
}
