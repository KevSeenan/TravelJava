import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planeHasAType() {
        //Given I have a plane
        assertNotNull(plane);
        //When a plane is made
        //Then it has a type
        assertEquals(PlaneType.BOEING747, plane.getType());
    }

    @Test
    public void planeHasACapacity() {
        assertNotNull(plane);
        assertEquals(5, plane.getCapacity());


    }

}
