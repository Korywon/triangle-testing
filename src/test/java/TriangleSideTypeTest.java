import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleSideTypeTest {
    @Test
    public void SideTypeTest1() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(triangle.getType(), "scalene right ");
    }

    @Test
    public void SideTypeTest2() {
        Triangle triangle = new Triangle(100, 100, 100);
        assertEquals(triangle.getType(), "equilateral ");
    }

    @Test
    public void SideTypeTest3() {
        Triangle triangle = new Triangle(5, 5, 4);
        assertEquals(triangle.getType(), "isosceles ");
    }

    @Test
    public void SideTypeTest4() {
        Triangle triangle = new Triangle(0, 0, 0);
        assertEquals(triangle.getType(), "unknown ");
    }

    @Test
    public void SideTypeTest5() {
        Triangle triangle = new Triangle(1, (float) Math.sqrt(3), 2);
        assertEquals(triangle.getType(), "scalene right ");
    }
}
