package com.wyyl1.study.chapter1;

public class Synchronized {

    public static void main(String[] args) {
        synchronized (Synchronized.class) {
            m();
        }
    }

    public static synchronized void m() {

    }
}
