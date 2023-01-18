package org.example.template.assignment;

public abstract class ComputerManufacturer {
    public void buildComputer() {
        addHardDisk();
        addRam();
        addKeyboard();
    }

    abstract void addHardDisk();
    abstract void addRam();
    abstract void addKeyboard();
}