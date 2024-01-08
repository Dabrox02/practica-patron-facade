package com.local;

public class RequestElevator {

    private int floor;
    private DirectionElevator directionElevator;

    public RequestElevator(int floor, DirectionElevator directionElevator) {
        this.floor = floor;
        this.directionElevator = directionElevator;
    }

    public int getFloor() {
        return this.floor;
    }

    public DirectionElevator getDirectionElevator() {
        return this.directionElevator;
    }

}
