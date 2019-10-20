package com.threads;

import java.nio.ByteBuffer;

public class SocketDemo {
    public static void main(String[] args) {
        ByteBuffer bf = ByteBuffer.allocate(1024);
        bf.put("sdfsa".getBytes());
        System.out.println(bf.position());
        System.out.println(bf.limit());
        System.out.println(bf.capacity());
        bf.flip();
        bf.mark();
        byte[] bs = new byte[bf.limit()];
        System.out.println(bf.position());
        System.out.println(bf.limit());
        System.out.println(bf.capacity());
        bf.get(bs);
        System.out.println(new String(bs,1,4));
        //bf.reset();
        System.out.println(bf.position());
        System.out.println(bf.limit());
        System.out.println(bf.capacity());
    }
}
