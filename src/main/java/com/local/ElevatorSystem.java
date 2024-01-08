package com.local;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {

    private List<Elevator> elevators;

    public ElevatorSystem(int nElevators, int maxFloors) {
        elevators = new ArrayList<>();
        for (int i = 0; i < nElevators; i++) {
            elevators.add(new Elevator(maxFloors));
        }
    }

    public void requestElevator(int floor, DirectionElevator directionElevator) {
        Elevator elevator = assignElevator(floor);
        elevator.addRequestFloor(new RequestElevator(floor, directionElevator));
    }

    private Elevator assignElevator(int floor) {
        Elevator closestElevator = elevators.get(0);
        int minDistance = Math.abs((closestElevator.getCurrentFloor() - floor));

        for (Elevator elevator : elevators) {
            int distance = Math.abs((elevator.getCurrentFloor() - floor));
            if (distance < minDistance) {
                closestElevator = elevator;
                minDistance = distance;
            }
        }
        return closestElevator;
    }

    public void start() {
        for (Elevator elevator : elevators) {
            elevator.start();
        }
    }

}
