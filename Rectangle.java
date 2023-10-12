public class Rectangle {
    double width, height;

    public Rectangle() {
//        width = 1.0;
//        height = 1.0;
    }

    public Rectangle(double width, double h) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public String display() {
        return "Rectangle { width: " + width + ", height: " + height;
    }


}


