package com;
class ThreadingDemo extends Thread{
public void start(){
    super.start();
    System.out.println("child thread");
}

    @Override
    public void run() {
        System.out.println("Main Thread");
    }
}
public class MyThreadDemo {
    public static void main(String[] args) {
            ThreadingDemo threadingDemo = new ThreadingDemo();
            threadingDemo.start();
    }
}

