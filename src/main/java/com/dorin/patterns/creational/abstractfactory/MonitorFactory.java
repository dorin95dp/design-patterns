package com.dorin.patterns.creational.abstractfactory;

import com.dorin.patterns.creational.abstractfactory.computers.Computer;
import com.dorin.patterns.creational.abstractfactory.monitors.Monitor;
import com.dorin.patterns.creational.abstractfactory.monitors.Phillips;
import com.dorin.patterns.creational.abstractfactory.monitors.Samsung;
import com.dorin.patterns.creational.abstractfactory.monitors.Sharp;

public class MonitorFactory extends AbstractFactory {

    @Override
    public Monitor getMonitor(String monitorType){
        switch (monitorType.toUpperCase()) {
            case "SAMSUNG": return new Samsung();
            case "PHILLIPS": return new Phillips();
            case "SHARP": return new Sharp();
            default: return null;
        }
    }

    @Override
    Computer getComputer(String computer) {
        return null;
    }
}
