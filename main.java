package Triangle2;

public class main {
	public static void main(String[] args) {
	Point pointA= new Point(2,5); // je cree un point avec un x et un y
	Point pointB= new Point(6,2);
	Point pointC= new Point(3,7);
	Triangle triangle = new Triangle(pointA,pointB,pointC); // je cree un triangle avec les points que j'ai cree
	triangle.Affiche(); // j'affiche les coordonnées de mes points 
	Point pointD= new Point(3,4);
	Point pointE= new Point(6,4);
	Point pointF= new Point(5,9);
	Triangle triangle2 = new Triangle(pointD,pointE,pointF);
	triangle2.Affiche();
	}
}
