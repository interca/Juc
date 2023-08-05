package com.dgut.thread;

import sun.nio.cs.ext.MacArabic;

public class CreateThread2 {
    public static void main(String[] args) {
        MyRunnable target = new MyRunnable();
        Thread t1 = new Thread(target,"1号线程");
        t1.start();
        Thread t2 = new Thread(target,"2号线程");//Thread-0
        t2.start();
    }

}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i < 10 ; i++ ){
            System.out.println(Thread.currentThread().getName() + "->" + i);
        }
    }
}
