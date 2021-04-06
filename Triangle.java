package Triangle2;

public class Triangle {
	Point x; // j'importe la variable x de ma classe Point
	Point y; // j'importe la variable y de ma classe Point
	private Point A; // je definis 3 points A B C
	private Point B;
	private Point C;
	public Triangle(Point a,Point b,Point c) { // je cree un  constructeur du triangle avec les points A B C
		A = a;
		B = b;
		C = c;
	}
	public void Affiche() { // je cree une methode Affiche qui montre le triangle avec les coordonnées de x et y
		System.out.println(" triangle : ");
		System.out.println("coté1 : " +"x : "+ A.x +"  "+ "y : " + A.y);
		System.out.println("coté2 : " + "x : "+ B.x +"  "+ "y : "+B.y);
		System.out.println("coté3 : " + "x : "+C.x +"  "+"y : "+ C.y);
	}
}
