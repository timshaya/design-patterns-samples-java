package com.timshaya.creational.factory;

public class StarFighter {

    private String shipModelName;

    public StarFighter(String modelName) { this.shipModelName = modelName; }

    public String getShipModelName() {return shipModelName; }
    public void setShipModelName(String shipModelName) { this.shipModelName = shipModelName; }
}
