package io.github.jgattringer.arquiteturaspring.montadora;

import java.awt.*;

public class HondaHRV extends Car{
    public HondaHRV() {
    }

    public HondaHRV(String model, Color color, Engine engine, ManufacturedBy manufacturedBy) {
        super(model, color, engine, manufacturedBy);
        setModel("HondaHRV");
        setColor(Color.BLACK);
        setManufacturedBy(ManufacturedBy.HONDA);

    }

    public HondaHRV(Engine engine) {
        super();
        setModel("HondaHRV");
        setColor(Color.BLACK);
        setEngine(engine);
        setManufacturedBy(ManufacturedBy.HONDA);
    }
}
