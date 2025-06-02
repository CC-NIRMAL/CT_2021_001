package Q_01;


public class Cat extends Pet {
    private String coatColor;

    public void setCoatColor(String color) {
        coatColor = color;
    }

    public String getCoatColor() {
        return coatColor;
    }

    @Override
    public String speak() {
        return "Meow!";
    }
}
