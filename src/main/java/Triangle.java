public class Triangle {

    /**
     * Points of the triangle.
     */
    private Point point1;
    private Point point2;
    private Point point3;

    /**
     * Sides of the triangle.
     */
    private float side1;
    private float side2;
    private float side3;

    /**
     * Area of the triangle. Calculated in <code>calculateArea()</code>.
     *
     * @see #calculateArea()
     */
    private float area;

    /**
     * The type of triangle.
     */
    private String type;

    /**
     * Boolean flag indicating if triangle is valid or not. True if valid, false if
     * not valid.
     */
    private Boolean valid;

    /**
     * Constructor accepting inputs for all three sides.
     *
     * @param side1 First side of triangle.
     * @param side2 Second side of triangle.
     * @param side3 Third side of triangle.
     */
    Triangle(float side1, float side2, float side3) {
        // sets class member variables to parameters
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        // checks and sets validity of triangle
        this.valid = checkValidity();
        // calculates the area of the triangle using the sides
        calculateArea();
        // determines and sets triangle type
        this.type = determineTriangleType();
        // prints the triangle's properties
        printTriangle(false);
    }

    /**
     * Constructor accepting inputs for all three points.
     *
     * @param point1 First xy-point.
     * @param point2 Second xy-point.
     * @param point3 Third xy-point.
     */
    Triangle(Point point1, Point point2, Point point3) {
        // sets class member variables to parameters
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;

        // calculates the sides of the triangles using points
        calculateSides();
        // checks and sets validity of triangle
        this.valid = checkValidity();
        // calculates the area of the triangle using the sides
        calculateArea();
        // determines and sets triangle type
        this.type = determineTriangleType();
        // prints the triangle's properties
        printTriangle(true);
    }

    /**
     * Method to calculate the area of the triangle using the 3 sides given.
     */
    public void calculateArea() {
        // if not valid, return
        if (!this.valid) {
            return;
        }

        // calculates the semi-perimeter
        double s = (side1 + side2 + side3) / 2;
        // returns the area using the semi-perimeter
        this.area = (float)Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
    }

    /**
     * Method to calculate the sides of the triangle using the 3 xy-coordinates given.
     */
    private void calculateSides() {
        this.side1 = (float)Math.sqrt(
            Math.pow((this.point2.getX() - this.point1.getX()), 2) +
                Math.pow((this.point2.getY() - this.point1.getY()), 2)
        );

        this.side2 = (float)Math.sqrt(
            Math.pow((this.point3.getX() - this.point2.getX()), 2) +
                Math.pow((this.point3.getY() - this.point2.getY()), 2)
        );

        this.side3 = (float)Math.sqrt(
            Math.pow((this.point1.getX() - this.point3.getX()), 2) +
                Math.pow((this.point1.getY() - this.point3.getY()), 2)
        );
    }

    /**
     * Checks to see if the sides of the triangle are valid;
     *
     * @return Returns <code>true</code> if triangle is valid. Else, returns <code>false</code>.
     */
    public boolean checkValidity() {
        // if sum of side1 and side2 less than or equal to side3
        if (side1 + side2 <= side3) {
            return false;
        }

        // if sum of side2 and side3 less than or equal to side1
        if (side2 + side3 <= side1) {
            return false;
        }

        // if sum of side3 and side1 less than or equal to side2
        if (side3 + side1 <= side2) {
            return false;
        }

        return true;
    }

    /**
     * Determines the triangle type and sets the type member variable of triangle
     * object.
     */
    private String determineTriangleType() {
        type = "";

        // if triangle is not valid, set triangle type to unknown
        if (!valid) {
            return "unknown";
        }

        // if triangles sides equal to one another
        if (this.side1 == this.side2 && this.side1 == this.side3 && this.side2 == this.side3) {
            type += "equilateral ";
        }
        else if (
            this.side1 == this.side2 ||
            this.side2 == this.side3 ||
            this.side3 == this.side1
        ) {
            type += "isosceles ";
        }

        // if triangles sides do not equal to each other, set type to scalene
        if (this.side1 != this.side2 && this.side2 != this.side3 && this.side3 != this.side1) {
            type += "scalene ";
        }

        // if the triangle satisfies pythagorean theorem, set type to right
        if (
            ((float)Math.pow(this.side1,2) + (float)Math.pow(this.side2,2) == (float)Math.pow(this.side3,2)) ||
            ((float)Math.pow(this.side2,2) + (float)Math.pow(this.side3,2) == (float)Math.pow(this.side1,2)) ||
            ((float)Math.pow(this.side3,2) + (float)Math.pow(this.side1,2) == (float)Math.pow(this.side2,2))
        ) {
            type += "right ";
        }

        return type;
    }

    /**
     * Prints all information about the triangle.
     *
     * @param points Boolean flag to indicate if the triangle used points or not.
     */
    public void printTriangle(boolean points) {
        System.out.println("TRIANGLE INFO:");

        // if points is true, print out each point
        if (points) {
            System.out.println("Point 1: (" + this.point1.getX() + ", " + this.point1.getY() + ")");
            System.out.println("Point 2: (" + this.point2.getX() + ", " + this.point2.getY() + ")");
            System.out.println("Point 3: (" + this.point3.getX() + ", " + this.point3.getY() + ")");
        }

        // if not using points or is valid, prints out the sides of the triangle
        if (!points || valid) {
            System.out.println("Side 1: " + this.side1);
            System.out.println("Side 2: " + this.side2);
            System.out.println("Side 3: " + this.side3);
        }

        // prints out if triangle is valid or not
        System.out.println("Valid: " + this.valid);

        // if valid, print out type(s) and area of triangle
        if (this.valid) {
            System.out.println("Type(s): " + this.type);
            System.out.println("Area: " + this.area);
        }
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}
