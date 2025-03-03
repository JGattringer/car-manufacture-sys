package io.github.jgattringer.arquiteturaspring.montadora.configuration;

import io.github.jgattringer.arquiteturaspring.montadora.Engine;
import io.github.jgattringer.arquiteturaspring.montadora.TypeOfEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// we need to put a annotation to tell spring that this will be a BEAN
// used to confing things like DB connection etc that we just config once and consume later
@Configuration
public class ManufactureByConfiguration {

    // when we create a method that returns a contruct OBJ
    // we use the Bean annotation
    @Bean(name = "aspirate")
    @Primary
    public Engine aspirateEngine() {
        var engine = new Engine();
        engine.setHorsePower(180);
        engine.setCylinders(4);
        engine.setModel("XPTO-0");
        engine.setFuelUsage(2.0);
        engine.setTypeOfEngine(TypeOfEngine.ASPIRATE);
        return engine;
    }

    @Bean(name = "electric")
    public Engine eletricEngine() {
        var engine = new Engine();
        engine.setHorsePower(150);
        engine.setCylinders(3);
        engine.setModel("XPTO-10");
        engine.setFuelUsage(1.4);
        engine.setTypeOfEngine(TypeOfEngine.ELECTRIC);
        return engine;
    }

    @Bean(name = "turbo")
    public Engine turboEngine() {
        var engine = new Engine();
        engine.setHorsePower(120);
        engine.setCylinders(4);
        engine.setModel("XPTO-0");
        engine.setFuelUsage(1.8);
        engine.setTypeOfEngine(TypeOfEngine.TURBO);
        return engine;
    }
}
