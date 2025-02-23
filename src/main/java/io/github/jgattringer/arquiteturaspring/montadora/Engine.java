package io.github.jgattringer.arquiteturaspring.montadora;

public class Engine {
    private String model;
    private Integer horsePower;
    private Integer cylinders;
    private Double fuelUsage;
    private TypeOfEngine typeOfEngine;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }



    public Integer getCylinders() {
        return cylinders;
    }

    public void setCylinders(Integer cylinders) {
        this.cylinders = cylinders;
    }

    public Double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(Double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public TypeOfEngine getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(TypeOfEngine typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", cylinders=" + cylinders +
                ", fuelUsage=" + fuelUsage +
                ", typeOfEngine=" + typeOfEngine +
                '}';
    }
}
