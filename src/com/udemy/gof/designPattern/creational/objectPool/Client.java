package com.udemy.designPattern.creational.objectPool;

public class Client {
    private static final ObjectPool<BitMap> objectPool = new ObjectPool<>(()->new BitMap("logo.bmp"),5);

    public static void main(String[] args) {
        BitMap b1 = objectPool.get();
        b1.setLocation(new Point2D(10,12));
        System.out.println(b1.getLocation());
        objectPool.release(b1);

        BitMap b2 = objectPool.get();
        b2.setLocation(new Point2D(20,2));
        System.out.println(b2.getLocation());
        objectPool.release(b2);

    }
}
