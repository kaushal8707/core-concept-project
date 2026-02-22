package com.zero.to.hero.design_pattern_frameworks.creational_dp.singleton.break_and_prevent;

import java.io.*;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path ="C://tmp/hello.text";

        Singleton singleton = Singleton.getInstance();
        FileOutputStream fout= new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(singleton);

        FileInputStream fin = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fin);
        Singleton deserailizedInstance = (Singleton) ois.readObject();

        System.out.println("Instance : "+singleton);
        System.out.println("Deserialized Instance : "+deserailizedInstance);
    }
}
