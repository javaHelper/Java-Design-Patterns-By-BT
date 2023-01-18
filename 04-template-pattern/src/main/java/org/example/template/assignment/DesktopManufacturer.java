package org.example.template.assignment;

public class DesktopManufacturer extends ComputerManufacturer {
    @Override
    void addHardDisk() {
        System.out.println("Desktop - HardDisk added!");
    }

    @Override
    void addRam() {
        System.out.println("Desktop - RAM added!");
    }

    @Override
    void addKeyboard() {
        System.out.println("Desktop - Keyboard added!");
    }
}