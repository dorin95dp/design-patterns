package com.dorin.patterns.creational.abstractfactory;

import com.dorin.patterns.creational.abstractfactory.computers.Computer;
import com.dorin.patterns.creational.abstractfactory.monitors.Monitor;

public abstract class AbstractFactory {
    abstract Computer getComputer(String computer);
    abstract Monitor getMonitor(String monitor) ;
}
