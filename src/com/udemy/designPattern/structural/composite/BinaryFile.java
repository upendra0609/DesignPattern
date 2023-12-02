package com.udemy.designPattern.structural.composite;

/*Leaf node in composite pattern*/
public class BinaryFile extends File {
    private long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }


    @Override
    public void ls() {
        System.out.println(getName() + "\t" + size);
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("Leaf Node doesn't support add operation");
    }

    @Override
    public File[] getFile() {
        throw new UnsupportedOperationException("Leaf Node doesn't support get operation");
    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("Leaf Node doesn't support remove operation");
    }
}
