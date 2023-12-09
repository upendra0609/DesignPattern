package com.udemy.designPattern.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


/*The component base clas for composite pattern
defines operations applicable both leaf & composite*/
@AllArgsConstructor
@Setter
@Getter
public abstract class File {
    private String name;

    public abstract void ls();

    public abstract void addFile(File file);

    public abstract File[] getFile();

    public abstract boolean removeFile(File file);
}
