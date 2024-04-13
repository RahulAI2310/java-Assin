package assignment2;
import java.lang.Math;

class Triangle {
    double side1;
    double side2;
    double side3;
    
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double calculateArea() {
        // Heron's formula to calculate area
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
    
    public double calculatePerimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }
}

public class Triangle1 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        
        double area = triangle.calculateArea();
        double perimeter = triangle.calculatePerimeter();
        
        System.out.println("Area of the triangle: " + area);
        System.out.println("Perimeter of the triangle: " + perimeter);
    }
}
