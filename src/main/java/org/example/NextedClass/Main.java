package org.example.NextedClass;

public class Main {
    public static void main(String[] args) {
        //we first created an instance of an outer class CPU named cpu.
        CPU cpu1 = new CPU();

        //Using the instance of the outer class, we then created objects of inner classes:
        CPU.Processor processor1 = cpu1.new Processor();
        CPU.RAM Ram2 = cpu1.new RAM();

        System.out.println(cpu1.price);
        System.out.println("------------------");
        System.out.println(processor1.score);
        System.out.println(processor1.manufacturer);
        System.out.println(processor1.getCache());
        System.out.println("---------------------------------------------------");
        System.out.println(Ram2.manufacturer);
        System.out.println(Ram2.memory);
        System.out.println(Ram2.getClockSpeed());

    }
}
