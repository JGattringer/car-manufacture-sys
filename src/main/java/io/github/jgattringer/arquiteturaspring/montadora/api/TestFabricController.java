package io.github.jgattringer.arquiteturaspring.montadora.api;

import io.github.jgattringer.arquiteturaspring.montadora.Engine;
import io.github.jgattringer.arquiteturaspring.montadora.HondaHRV;
import io.github.jgattringer.arquiteturaspring.montadora.KeyType;
import io.github.jgattringer.arquiteturaspring.montadora.configuration.CarStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class TestFabricController {

    @Autowired
    @Aspirate // here we're using our anotation that we created
    private Engine engine;

    @PostMapping
    public CarStatus startCar(@RequestBody KeyType keyType){
        var car = new HondaHRV(engine);
        return car.startEngine(keyType);

    }

}
