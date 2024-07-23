package com.javastudy.demo;

import java.io.IOException;

public class ApiDemoRuntime {
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        System.out.println(rt.availableProcessors());
        System.out.println(rt.maxMemory() / Math.pow(1024, 3));
        System.out.println(rt.totalMemory() / Math.pow(1024, 3));
        System.out.println(rt.freeMemory() / Math.pow(1024, 3));
        System.out.println(rt.exec("notepad"));

    }
}
