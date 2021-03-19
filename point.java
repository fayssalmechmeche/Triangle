
public class Point {
    Double x;
    Double y;

    public Point(Double a, Double b) {
        this.x = a;
        this.y = b;
    }

    public double getx() {
        return this.x;
    }

    public double gety() {
        return this.y;
    }

    public void affiche() {
        System.out.println("Les coordonées de X sont:" + this.x);
        System.out.println("Les coordonnées de Y sont:" + this.y);
    }
}