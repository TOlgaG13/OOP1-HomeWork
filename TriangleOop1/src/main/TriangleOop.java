package main;

public class TriangleOop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle1 = new Triangle(3, 4, 5);
		Triangle triangle2 = new Triangle(6, 8, 10);
		Triangle triangle3 = new Triangle(5, 7, 9);

		System.out.println("Area triangle 1: " + triangle1.getArea());
		System.out.println("Area triangle 2: " + triangle2.getArea());
		System.out.println("Area triangle 3: " + triangle3.getArea());
	}
}
