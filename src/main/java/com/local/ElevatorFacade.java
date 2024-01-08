package com.local;

public class ElevatorFacade {

    private ElevatorSystem elevatorSystem;

    public ElevatorFacade(int nElevators, int maxFloors) {
        this.elevatorSystem = new ElevatorSystem(nElevators, maxFloors);
    }

    public void subir(int floor) {
        elevatorSystem.requestElevator(floor, DirectionElevator.UP);
        elevatorSystem.start();
    }

    public void bajar(int floor) {
        elevatorSystem.requestElevator(floor, DirectionElevator.DOWN);
        elevatorSystem.start();
    }

}
