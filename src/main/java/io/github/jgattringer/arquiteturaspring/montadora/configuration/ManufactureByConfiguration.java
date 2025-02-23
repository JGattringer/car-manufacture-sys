package io.github.jgattringer.arquiteturaspring.montadora.configuration;

import io.github.jgattringer.arquiteturaspring.montadora.Engine;
import io.github.jgattringer.arquiteturaspring.montadora.TypeOfEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// we need to put a annotation to tell spring that this will be a BEAN
// used to confing things like DB connection etc that we just config once and consume later
@Configuration
public class ManufactureByConfiguration {

    // when we create a method that returns a contruct OBJ
    // we use the Bean annotation
    @Bean
    public Engine engine() {
        var engine = new Engine();
        engine.setHorsePower(120);
        engine.setCylinders(4);
        engine.setModel("XPTO-0");
        engine.setFuelUsage(2.0);
        engine.setTypeOfEngine(TypeOfEngine.ASPIRATE);
        return engine;
    }
}
