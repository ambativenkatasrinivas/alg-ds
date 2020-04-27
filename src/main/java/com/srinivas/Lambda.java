package com.srinivas;

public class Lambda {
    public static void main(String args[]) {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Inside thread1");
//            }
//        });
//        thread.start();

        Thread thread = new Thread(() -> System.out.println("Inside thread"));
        thread.start();

    }
}
