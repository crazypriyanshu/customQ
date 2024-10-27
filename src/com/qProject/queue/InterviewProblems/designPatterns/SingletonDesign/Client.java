package com.qProject.queue.InterviewProblems.designPatterns.SingletonDesign;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
        System.out.println(singleton.hashCode());
//        Singleton anotherSingleObj = Singleton.getInstance();
//        System.out.println(anotherSingleObj.hashCode());
//
//        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singleton s2 = constructor.newInstance();
//        System.out.println(s2.hashCode());


        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(s1);
        System.out.println("serialization done");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        Samosa s2 = (Samosa) ois.readObject();
        System.out.println(s2.hashCode());


//        BigPughSigletonDesign d1 = BigPughSigletonDesign.getInstance();
//        System.out.println(d1.hashCode());
//        Constructor<BigPughSigletonDesign> construct = BigPughSigletonDesign.class.getDeclaredConstructor();
//        construct.setAccessible(true);
//        BigPughSigletonDesign newObj = construct.newInstance();
//        System.out.println(newObj.hashCode());
    }
}
