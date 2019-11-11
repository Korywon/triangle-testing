import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleSideValidityTest {
    @Test
    public void SideValidityTest1() {
        Triangle triangle = new Triangle(0, 0, 0);
        assertEquals(triangle.getValid(), false);
    }

    @Test
    public void SideValidityTest2() {
        Triangle triangle = new Triangle(-1, -1, -1);
        assertEquals(triangle.getValid(), false);
    }

    @Test
    public void SideValidityTest3() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(triangle.getValid(), true);
    }

    @Test
    public void SideValidityTest4() {
        Triangle triangle = new Triangle(30, 30, 30);
        assertEquals(triangle.getValid(), true);
    }

    @Test
    public void SideValidityTest5() {
        Triangle triangle = new Triangle(5, 100, 5);
        assertEquals(triangle.getValid(), false);
    }
}
