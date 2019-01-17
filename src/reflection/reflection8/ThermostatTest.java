package reflection.reflection8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThermostatTest {

    @Test
    void testSkiing() {
        Thermostat thermostat = new Thermostat(t -> t < 0, t -> t + " degrees Celsius");

        String message = thermostat.sense(2.0);
        Assertions.assertEquals("2.0 degrees Celsius",message);

        message = thermostat.sense(-1.0);
        Assertions.assertEquals("Warning!",message);

    }

    @Test
    void testSauna(){
        Thermostat thermostat=new Thermostat(t->t>=80.0,t->t+273.15+" degrees kelvin");

        String message = thermostat.sense(79.0);
        Assertions.assertEquals("352.15 degrees kelvin",message);

         message = thermostat.sense(80.0);
        Assertions.assertEquals("Warning!",message);



    }
}