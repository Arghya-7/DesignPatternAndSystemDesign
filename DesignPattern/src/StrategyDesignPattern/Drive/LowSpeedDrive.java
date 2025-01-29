package StrategyDesignPattern.Drive;

public class LowSpeedDrive implements Drive{
    @Override
    public void drive() {
        System.out.println("Low Speed Driving");
    }
}
