package otus.patterns.homework;

import static java.lang.Math.sqrt;

public class Quadratic {

    /**
     * Нахождение корней квадратного уравнения a*x^2+b*x+c=0
     * @param a - коэффициент квадратного уравнения
     * @param b - коэффициент квадратного уравнения
     * @param c - коэффициент квадратного уравнения
     * @return список корней квадратного уравнения
     */
    public static double[] solve(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d < 0) {
            return new double[]{};
        }
        if (d > 0) {
            return new double[]{
                    (-b + sqrt(d)) / (2 * a),
                    (-b - sqrt(d)) / (2 * a)
            };
        }
        return new double[]{-b / (2 * a)};
    }
}
