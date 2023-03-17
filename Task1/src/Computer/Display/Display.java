package Computer.Display;

public class Display {
    private int diagonal;
    private DisplayType displayType;
    private double weight;

    public Display(int diagonal, DisplayType displayType, double weight) {
        this.diagonal = diagonal;
        this.displayType = displayType;
        this.weight = weight;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public void setDisplayType(DisplayType displayType) {
        this.displayType = displayType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Display{" +
                "diagonal=" + diagonal +
                ", displayType=" + displayType +
                ", weight=" + weight +
                '}';
    }
}
