package com.local;

import java.util.Stack;

public class Elevator {

    private int maxFloors;
    private int currentFloor;
    private Stack<RequestElevator> requestsElevator;

    public Elevator(int maxFloors) {
        this.requestsElevator = new Stack<>();
        this.maxFloors = maxFloors;
        this.currentFloor = 1;
    }

    public int getMaxFloors() {
        return this.maxFloors;
    }

    public int getCurrentFloor() {
        return this.currentFloor;
    }

    public void moveUp(int requestFloor) {
        if (requestFloor <= maxFloors) {
            System.out.println("Subiendo");
            for (int i = getCurrentFloor(); i <= requestFloor; i++) {
                System.out.println("Piso " + i);
            }
            stop();
            this.currentFloor = requestFloor;
        }
        System.out.println("====================");
    }

    public void moveDown(int requestFloor) {
        if (requestFloor >= 1 && getCurrentFloor() > requestFloor) {
            System.out.println("Bajando");
            for (int i = getCurrentFloor(); i >= requestFloor; i--) {
                System.out.println("Piso " + i);
            }
            stop();
            this.currentFloor = requestFloor;
        } else {
            moveUp(requestFloor);
        }
        System.out.println("====================");
    }

    public void addRequestFloor(RequestElevator requestElevator) {
        if (!requestsElevator.isEmpty()) {
            DirectionElevator directionPriority = requestsElevator.get(0).getDirectionElevator();
            if (directionPriority == requestElevator.getDirectionElevator()) {
                requestsElevator.add(requestElevator);
            }
        } else {
            requestsElevator.add(requestElevator);
        }
    }

    public void start() {
        if (!requestsElevator.isEmpty()) {
            while (!requestsElevator.isEmpty()) {
                RequestElevator request = requestsElevator.pop();
                if (request.getDirectionElevator() == DirectionElevator.UP) {
                    moveUp(request.getFloor());
                } else {
                    moveDown(request.getFloor());
                }  
            }
        }
    }

    private void stop() {
        System.out.println("Parar ascensor");
    }

}
