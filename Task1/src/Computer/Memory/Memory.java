package Computer.Memory;

public class Memory {

    private MemoryType memoryType;
    private int volume;
    private double weight;

    public Memory(MemoryType memoryType, int volume, double weight) {
        this.memoryType = memoryType;
        this.volume = volume;
        this.weight = weight;
    }

    public MemoryType getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(MemoryType memoryType) {
        this.memoryType = memoryType;
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
        return "Memory{" +
                "memoryType=" + memoryType +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
