package com.dorin.patterns.creational.abstractfactory;

import com.dorin.patterns.creational.abstractfactory.computers.Asus;
import com.dorin.patterns.creational.abstractfactory.computers.Computer;
import com.dorin.patterns.creational.abstractfactory.computers.Hp;
import com.dorin.patterns.creational.abstractfactory.computers.Lenovo;
import com.dorin.patterns.creational.abstractfactory.monitors.Monitor;

public class ComputerFactory extends AbstractFactory {

    @Override
    public Monitor getMonitor(String monitorType){
        return null;
    }

    @Override
    Computer getComputer(String computer) {
        switch (computer.toUpperCase()) {
            case "LENOVO": return new Lenovo();
            case "HP": return new Hp();
            case "ASUS": return new Asus();
            default: return null;
        }
    }
}
