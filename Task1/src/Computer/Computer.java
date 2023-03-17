package Computer;

import Computer.Display.Display;
import Computer.HardDisc.HardDisc;
import Computer.Keyboard.Keyboard;
import Computer.Memory.Memory;
import Computer.Processor.Processor;

public class Computer {
      private Processor processor;
      private Memory memory;
      private HardDisc hardDisc;
      private Display display;
      private Keyboard keyboard;

      private final String vendor;
      private final String namw;

      public Computer(Processor processor, Memory memory,
                      HardDisc hardDisc, Display display,
                      Keyboard keyboard, String vendor, String namw) {
            this.processor = processor;
            this.memory = memory;
            this.hardDisc = hardDisc;
            this.display = display;
            this.keyboard = keyboard;
            this.vendor = vendor;
            this.namw = namw;
      }

      public Processor getProcessor() {
            return processor;
      }

      public void setProcessor(Processor processor) {
            this.processor = processor;
      }

      public Memory getMemory() {
            return memory;
      }

      public void setMemory(Memory memory) {
            this.memory = memory;
      }

      public HardDisc getHardDisc() {
            return hardDisc;
      }

      public void setHardDisc(HardDisc hardDisc) {
            this.hardDisc = hardDisc;
      }

      public Display getDisplay() {
            return display;
      }

      public void setDisplay(Display display) {
            this.display = display;
      }

      public Keyboard getKeyboard() {
            return keyboard;
      }

      public void setKeyboard(Keyboard keyboard) {
            this.keyboard = keyboard;
      }

      public String getVendor() {
            return vendor;
      }

      public String getNamw() {
            return namw;
      }

      public double getWeight() {
            return processor.getWeight() +
                    memory.getWeight() +
                    hardDisc.getWeight() +
                    display.getWeight() +
                    keyboard.getWeight();
      }

      @Override
      public String toString() {
            return "Computer{" +
                    "processor=" + processor +
                    ", memory=" + memory +
                    ", hardDisc=" + hardDisc +
                    ", display=" + display +
                    ", keyboard=" + keyboard +
                    ", vendor='" + vendor + '\'' +
                    ", namw='" + namw + '\'' +
                    '}';
      }
}
