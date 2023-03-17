package Computer.Processor;

public class Processor {

    private Frequency frequency;
    private CoreCount coreCount;
    private Manufacture manufacture;
    private double weight;

    public Processor(Frequency frequency, CoreCount coreCount, Manufacture manufacture, double weight) {
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.manufacture = manufacture;
        this.weight = weight;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public CoreCount getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(CoreCount coreCount) {
        this.coreCount = coreCount;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", coreCount=" + coreCount +
                ", manufacture=" + manufacture +
                ", weight=" + weight +
                '}';
    }
}
