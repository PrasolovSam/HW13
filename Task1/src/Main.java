import Computer.Computer;
import Computer.Display.Display;
import Computer.Display.DisplayType;
import Computer.HardDisc.DiscType;
import Computer.HardDisc.HardDisc;
import Computer.Keyboard.Keyboard;
import Computer.Keyboard.KeyboardType;
import Computer.Keyboard.Light;
import Computer.Memory.Memory;
import Computer.Memory.MemoryType;
import Computer.Processor.CoreCount;
import Computer.Processor.Frequency;
import Computer.Processor.Manufacture;
import Computer.Processor.Processor;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(Frequency.SIX_THOUSANDS ,
                CoreCount.FOUR, Manufacture.INTEL, 23.0);
        Memory memory = new Memory(MemoryType.DDR4,
                8, 23.0);
        Keyboard keyboard = new Keyboard(KeyboardType.WIRELESS,
                Light.YES, 23.0);
        HardDisc hardDisc = new HardDisc(DiscType.SSD, 256, 23);
        Display display = new Display(24, DisplayType.IPS, 230);

        Computer computer = new Computer(processor, memory,
                hardDisc, display, keyboard, "Apple", "Mac Pro");

        System.out.println(computer.getDisplay());
    }
}