package Lab05.Ex6;

public class Exercise6 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Rectangle area: " + rect.getArea());
        System.out.println("Rectangle perimeter: " + rect.getPerimeter());

        Circle circle = new Circle(4);
        System.out.println("Circle surface: " + circle.getSurface());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
    }
}
