public class Child extends Parent {
    public Child() {
        System.out.println("D");
    }
    public Child(int a) {
        super(a);
        System.out.println("E");
    }
    public void fn() {
        System.out.println("F");
    }
}
