package com.timshaya.creational.factory;

class ColonialFleet implements Fleet {
    private String name;

    public ColonialFleet(String n) {
        this.name = n;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}