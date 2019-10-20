package com.jvm;

import org.junit.Test;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class JvmDemo {
    int i = 1;
    @Test
    public void a(){
        final HashMap<String, String> map = new HashMap<String, String>(2);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            map.put(UUID.randomUUID().toString(), "");
                        }
                    }, "ftf" + i).start();
                }
            }
        }, "ftf");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

   /* public static void main(String[] args) {
        byte[] a = new byte[1024 * 1024];
        System.out.println(Runtime.getRuntime().maxMemory()/(1024*1024));
        System.out.println(Runtime.getRuntime().freeMemory()/(1024*1024));
        System.out.println(Runtime.getRuntime().totalMemory()/(1024*1024));
        byte[] b = new byte[4*1024 * 1024];
        System.out.println(Runtime.getRuntime().maxMemory()/(1024*1024));
        System.out.println(Runtime.getRuntime().freeMemory()/(1024*1024));
        System.out.println(Runtime.getRuntime().totalMemory()/(1024*1024));
    }*/
}
