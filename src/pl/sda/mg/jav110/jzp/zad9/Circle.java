package pl.sda.mg.jav110.jzp.zad9;

public class Circle implements Movable, Resizable {
    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.point = point;
        this.center = center;
    }

    public double getRadius() {
        return Math.sqrt(
                Math.pow(point.getX() - center.getX(), 2) +
                Math.pow(point.getY() - center.getY(), 2)
        );
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.point.move(moveDirection);
        this.center.move(moveDirection);
    }

    @Override
    public String toString() {
        return "Circle[Center(" + center + "), point(" + point + ")]";
    }

    @Override
    public void resize(double resizeFactor) {
        this.point.setX(point.getX() * resizeFactor);
        this.point.setY(point.getY() * resizeFactor);
    }
}
