package com.local;

public class Main {
    public static void main(String[] args) {
        ElevatorFacade elevatorFacade = new ElevatorFacade(3, 10);
        elevatorFacade.subir(8);
        elevatorFacade.subir(3);
        elevatorFacade.bajar(8);
    }
}
