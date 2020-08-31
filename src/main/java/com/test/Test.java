package com.test;

public class Test {
    public static void main(String[] args) {
        String id = "admin";
        String password = "123456";

        DummyService service = new DummyServiceImpl();
        service.login(id, password);

        System.out.println("----------");
    }
}
