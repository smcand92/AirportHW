import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {
    private Airport airport;



    @Before
    public void before() {
        airport = new Airport("Glasgow", "GLA");
    }

    @Test
    public void hasName() {
        assertEquals("Glasgow", airport.getName());
    }

    @Test
    public void hasCode(){
        assertEquals("GLA", airport.getCode());
    }

}
