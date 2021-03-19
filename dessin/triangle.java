
public class Triangle {
    private Point Pointa, Pointb, Pointc;
    public Triangle(Point A, Point B, Point C) {
        Pointa=A;
        Pointb=B;
        Pointc=C;
    }
public void affiche() {
    System.out.println("Le triangle ABC : ");
    System.out.println("A = ");Pointa.affiche();
    System.out.println("B = ");Pointb.affiche();
    System.out.println("C = ");Pointc.affiche();
}

}