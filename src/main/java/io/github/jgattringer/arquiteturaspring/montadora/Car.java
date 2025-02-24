package io.github.jgattringer.arquiteturaspring.montadora;

import io.github.jgattringer.arquiteturaspring.montadora.configuration.CarStatus;

import java.awt.*;

public class Car {
    private String model;
    private Color color;
    private Engine engine;
    private ManufacturedBy manufacturedBy;

    public Car() {
    }

    public Car(String model, Color color, Engine engine, ManufacturedBy manufacturedBy) {
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.manufacturedBy = manufacturedBy;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ManufacturedBy getManufacturedBy() {
        return manufacturedBy;
    }

    public void setManufacturedBy(ManufacturedBy manufacturedBy) {
        this.manufacturedBy = manufacturedBy;
    }

    public CarStatus startEngine(KeyType keyType) {
        if(keyType.getManufacturedBy() != this.manufacturedBy) {
            return new CarStatus("Its not possible to start the engine with this key");
        }
        return new CarStatus("The engine has started and is running with:" + engine.toString());
    }
}
