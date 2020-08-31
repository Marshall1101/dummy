package com.test;

public class DummyServiceImpl implements DummyService {
    @Override
    public void login(String id, String password) {
        System.out.println(id + password);
    }
}
