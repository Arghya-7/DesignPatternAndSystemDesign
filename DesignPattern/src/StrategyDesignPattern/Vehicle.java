package StrategyDesignPattern;

import StrategyDesignPattern.Drive.Drive;

public class Vehicle {
    Drive drive;
    String vercleName;
    Vehicle(String vercleName, Drive drive){
        this.vercleName = vercleName;
        this.drive = drive;
    }
}
