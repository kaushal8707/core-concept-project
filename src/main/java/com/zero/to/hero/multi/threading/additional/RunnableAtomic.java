package com.zero.to.hero.multi.threading.additional;

public class RunnableAtomic implements Runnable
{
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() +"  ");


        System.out.println(AtomicIntegerExample.sharedAtomicInteger.getAndIncrement());
    }
}
