package com.structural.proxy;

public interface SocketInterface {
    String readLine();

    void writeLine(String str);

    void dispose();
}
