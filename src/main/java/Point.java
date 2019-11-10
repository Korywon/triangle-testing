public class Point {
    /**
     * x coordinate of the point.
     */
    private float x;
    /**
     * y coordinate of the point.
     */
    private float y;

    /**
     * Constructor for Point class that accepts x-coordinate and y-coordinate inputs.
     *
     * @param x
     * @param y
     */
    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Default constructor for Point class.
     */
    Point() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Get function for x coordinate.
     *
     * @return Returns the x-coordinate as a double.
     */
    public float getX() {
        return x;
    }

    /**
     * Get function for y coordinate.
     *
     * @return Returns the y-coordinate as a double.
     */
    public float getY() {
        return y;
    }

    /**
     * Set function for x coordinate.
     *
     * @param x x-coordinate to be set to.
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Set function for y-coordinate.
     *
     * @param y y coordinate to be set to.
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Set function for x and y coordinates.
     *
     * @param x x-coordinate to be set to.
     * @param y y-coordinate to be set to.
     */
    public void setCoordinates(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
