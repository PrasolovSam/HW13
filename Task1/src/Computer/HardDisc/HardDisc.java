package Computer.HardDisc;

public class HardDisc {
    private DiscType discType;
    private int volume;
    private double weight;

    public HardDisc(DiscType discType, int volume, double weight) {
        this.discType = discType;
        this.volume = volume;
        this.weight = weight;
    }

    public DiscType getDiscType() {
        return discType;
    }

    public void setDiscType(DiscType discType) {
        this.discType = discType;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HardDisc{" +
                "discType=" + discType +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
