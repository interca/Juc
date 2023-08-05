package com.dgut.thread;

public class CreateThread {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        for(int i = 0 ; i < 100 ; i++ ){
            System.out.println("main线程" + i);
        }
        // main线程输出放在上面 就变成有先后顺序了，因为是 main 线程驱动的子线程运行
    }

}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程输出：" + i);
        }

    }
}