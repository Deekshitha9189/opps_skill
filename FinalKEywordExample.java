package oops_skill;

public class FinalKEywordExample {

    static final double PI = 3.1416;

    static class Circle {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        void area() {
            System.out.println("Area is " + (PI * radius * radius));
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        c1.area();
    }
}

