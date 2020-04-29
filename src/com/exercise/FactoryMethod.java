package com.exercise;

public class FactoryMethod {
    public static void main(String[] args) {
        BeanzFactory beanzFactory = new BeanzFactory();
        Benz benz = beanzFactory.getCar();
        benz.run();

    }
}

//interface Car{
//    void run();
//}

interface CarFactory{
    Car getCar();
}

class BeanzFactory implements CarFactory{
    @Override
    public  Benz getCar(){
        return new Benz();
    }
}

class BMWFactory implements CarFactory{
    @Override
    public BMW getCar(){
        return new BMW();
    }
}

class QQFactory implements CarFactory{
    @Override
    public QQ getCar(){
        return new QQ();
    }
}

class TELSAFactory implements CarFactory{
    @Override
    public TELSA getCar(){
        return new TELSA();
    }
}

class AUDIFactory implements CarFactory{
    @Override
    public AUDI getCar(){
        return new AUDI();

    }
}