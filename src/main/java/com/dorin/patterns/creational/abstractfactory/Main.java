package com.dorin.patterns.creational.abstractfactory;

// Client needs monitor and computer
// monitors: Samsung, Phillips and Sharp
// computers: Asus, Hp, Lenovo

import com.dorin.patterns.creational.abstractfactory.computers.Computer;
import com.dorin.patterns.creational.abstractfactory.monitors.Monitor;

public class Main {
    public static void main(String[] args) {
        //get shape factory
        AbstractFactory monitorFactory = FactoryProducer.getFactory("MONITOR");
        Monitor monitor1 = monitorFactory.getMonitor("SAMSUNG");
        monitor1.display();
        //...............................................................................
        AbstractFactory colorFactory = FactoryProducer.getFactory("COMPUTER");
        Computer computer1 = colorFactory.getComputer("ASUS");
        computer1.process();

    }
}
