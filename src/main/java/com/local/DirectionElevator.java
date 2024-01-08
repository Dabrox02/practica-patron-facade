package com.local;

public enum DirectionElevator {

    UP("Subiendo"), DOWN("Bajando");

    private String operacion;

    private DirectionElevator(String operacion) {
        this.operacion = operacion;
    }

    public String getOperacion() {
        return this.operacion;
    }
}
