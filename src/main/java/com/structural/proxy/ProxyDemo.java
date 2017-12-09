package com.structural.proxy;

import java.util.Scanner;

public class ProxyDemo {
    public static void main(String[] args) {
        InputHelper inputHelper = new InputHelper();
        // 3. The client deals with the wrapper
        boolean isServer = inputHelper.isServerChosenByUser();

        SocketInterface socket = new SocketProxy("127.0.0.1", 8080, isServer);
        String str;
        boolean skip = true;

        boolean isStopped = false;
        while (!isStopped) {
            if (!isServer && skip) {
                skip = !skip;
            } else {
                str = socket.readLine();
                System.out.println("Receive - " + str);
                if (str == null) {
                    break;
                }
            }
            System.out.println("Send ---- ");
            str = new Scanner(System.in).nextLine();
            socket.writeLine(str);
            if (str.equals("quit")) {
                isStopped = true;
            }
        }

        socket.dispose();
    }


}