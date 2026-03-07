package com.zero.to.hero.multi.threading.MULTITHREADING.Process_Threads_Multitasking_MultiThreading.Program;

public class World extends Thread {
    @Override
    public void run() {
        for( ; ; ){
            System.out.println("World   "+ " using Thread - "+Thread.currentThread().getName());
        }
    }
}
