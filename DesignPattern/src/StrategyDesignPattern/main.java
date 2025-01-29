package StrategyDesignPattern;

import StrategyDesignPattern.Drive.HighSpeedDriving;
import StrategyDesignPattern.Drive.LowSpeedDrive;

public class main {
    public static void main(String[] args) {
        Vehicle farari = new Vehicle("Farari", new HighSpeedDriving());
        farari.drive.drive();

        Vehicle bus = new Vehicle("Bus", new LowSpeedDrive());
        bus.drive.drive();
    }
}
