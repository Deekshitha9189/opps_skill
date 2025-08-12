package oops_skill;

public class AccessSpecifiersExample {

    static class Demo {
        public int pub = 1;
        private int pri = 2;
        protected int pro = 3;

        void display() {
            System.out.println("Public: " + pub);
            System.out.println("Private: " + pri);
            System.out.println("Protected: " + pro);
        }
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.display();
    }
}

