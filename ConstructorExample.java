package oops_skill;

// Program to demonstrate Constructor usage
public class ConstructorExample {
    int id;
    String name;

    ConstructorExample(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        ConstructorExample s1 = new ConstructorExample(201, "Charlie");
        ConstructorExample s2 = new ConstructorExample(202, "Diana");

        s1.display();
        s2.display();
    }
}
