package Computer.Keyboard;

public class Keyboard {

    private KeyboardType keyboardType;
    private Light light;
    private double weight;

    public Keyboard(KeyboardType keyboardType, Light light, double weight) {
        this.keyboardType = keyboardType;
        this.light = light;
        this.weight = weight;
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(KeyboardType keyboardType) {
        this.keyboardType = keyboardType;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "keyboardType=" + keyboardType +
                ", light=" + light +
                ", weight=" + weight +
                '}';
    }
}
