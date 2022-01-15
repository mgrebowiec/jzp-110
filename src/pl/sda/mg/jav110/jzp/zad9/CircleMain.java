package pl.sda.mg.jav110.jzp.zad9;

public class CircleMain {
    public static void main(String[] args) {
        Circle sampleCircle = new Circle(new Point2D(0, 0), new Point2D(1, 1));
        System.out.println("Promien: " + sampleCircle.getRadius());
        System.out.println("Obwod: " + sampleCircle.getPerimeter());
        System.out.println("Pole: " + sampleCircle.getArea());
    }
}
