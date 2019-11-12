import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianglePointTypeTest {
    @Test
    public void PointTest1() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 3);
        Point point3 = new Point(4, 0);
        Triangle triangle = new Triangle(point1, point2, point3);
        assertEquals(triangle.getValid(), true);
    }

    @Test
    public void PointTest2() {
        Point point1 = new Point(0, 0);
        point1.setX(0);
        point1.setY(0);
        Point point2 = new Point(-3, 0);
        point2.setX(-3);
        point2.setY(0);
        Point point3 = new Point(0, -4);
        point3.setX(0);
        point3.setY(-4);
        Triangle triangle = new Triangle(point1, point2, point3);
        assertEquals(triangle.getValid(), true);
    }

    @Test
    public void PointTest3() {
        Point point1 = new Point();
        point1.setCoordinates(0, (float)Math.sqrt(12));
        Point point2 = new Point();
        point2.setCoordinates(-2, 0);
        Point point3 = new Point();
        point3.setCoordinates(2, 0);
        Triangle triangle = new Triangle(point1, point2, point3);
        assertEquals(triangle.getValid(), true);
    }

    @Test
    public void PointTest4() {
        Point point1 = new Point();
        Point point2 = new Point();
        Point point3 = new Point();
        Triangle triangle = new Triangle(point1, point2, point3);
        assertEquals(triangle.getValid(), false);
    }
}
