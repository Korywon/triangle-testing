import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleSideAreaCalculationTest {
    @Test
    public void SideAreaCalculationTest1() {
        Triangle triangle = new Triangle(-1, -1, 0);
        assertEquals(triangle.getArea(), 0.0f);
    }

    @Test
    public void SideAreaCalculationTest2() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(triangle.getArea(), 6);
    }

    @Test
    public void SideAreaCalculationTest3() {
        Triangle triangle = new Triangle(10, 2, 10);
        assertEquals(MathHelper.round(triangle.getArea(), 2), MathHelper.round(.5*2*Math.sqrt(99), 2));
    }

    @Test
    public void SideAreaCalculationTest4() {
        Triangle triangle = new Triangle(0, 0, 0);
        assertEquals(triangle.getArea(), 0);
    }

    @Test
    public void SideAreaCalculationTest5() {
        Triangle triangle = new Triangle(1, (float) Math.sqrt(3), 2);
        assertEquals(MathHelper.round(triangle.getArea(), 2), MathHelper.round(0.5*Math.sqrt(3), 2));
    }

}
