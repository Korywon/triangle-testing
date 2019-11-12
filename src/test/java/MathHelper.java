public class MathHelper {
    public static float round(float number) {
        return Math.round(number * 100.0f) / 100.0f;
    }

    public static double round(double number, int decimalPlaces) {
        return Math.round(number * 100.0) / 100.0;
    }
}
