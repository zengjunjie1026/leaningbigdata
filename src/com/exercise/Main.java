package com.exercise;

import javax.xml.stream.FactoryConfigurationError;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BMW bmw = new BMW();

        Car bmw1 = SimpleFactory.getCar("BMW");
        assert bmw1 != null;
        bmw1.run();

    }
}

interface Car{
    void run();
}

class BMW implements Car{
    @Override
    public void run(){
        System.out.println("宝马");
    }
}

class Benz implements Car{
    @Override
    public void run(){
        System.out.println("奔驰");
    }
}


class QQ implements Car{
    @Override
    public void run(){
        System.out.println("奇瑞");
    }
}

class TELSA implements Car{
    @Override
    public void run(){
        System.out.println("特斯拉");
    }
}

class AUDI implements Car{
    @Override
    public void run(){
        System.out.println("奥迪");
    }
}


class SimpleFactory{
    public static Car getCar(String type) {
        if ("BMW".equals(type)) {
            return new BMW();
        } else if ("TELSA".equals(type)) {
            return new TELSA();
        } else if ("Benz".equals(type)) {
            return new Benz();
        }else
        return null;
    }
}




