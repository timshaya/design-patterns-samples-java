package com.timshaya.creational.factory;

public class CylonFleet implements Fleet {
    private String name;

    public CylonFleet(String n) {
        this.name = n;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
