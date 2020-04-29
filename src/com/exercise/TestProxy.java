package com.exercise;


import java.time.format.DateTimeFormatter;

/*
代理：
可以帮助被代理者做一些事情，后期的善后工作，核心的业务逻辑

 */
public class TestProxy {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        UserDAOProxy userDAOProxy = new UserDAOProxy(userDAO);
        userDAOProxy.add();

    }
}

interface DAO{
    void add();
}


//被代理者
class UserDAO implements DAO{

    @Override
    public void add() {
        System.out.println("add user");
    }
}

//代理
class UserDAOProxy implements DAO{
    private DAO target;

    public UserDAOProxy(DAO target){
        super();
        this.target = target;
    }

    @Override
    public void add() {
        System.out.println("add method begin to execte");

        long start = System.currentTimeMillis();

        //核心业务代码
        target.add();

        long end = System.currentTimeMillis();
        System.out.println("use time: " + (end - start));
        System.out.println("add done");

    }
}
