package oops_skill;

public class ConstructorOverLoading {

    static class Box {
        double width, height, depth;

        Box() { // default
            width = height = depth = 0;
        }

        Box(double len) { // cube
            width = height = depth = len;
        }

        Box(double w, double h, double d) { // cuboid
            width = w;
            height = h;
            depth = d;
        }

        void volume() {
            System.out.println("Volume is " + (width * height * depth));
        }
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(10, 20, 15);

        b1.volume();
        b2.volume();
        b3.volume();
    }
}
