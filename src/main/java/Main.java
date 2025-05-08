public class Main {
    public static void main(String[] args) {
        Parent a = new Parent();
        Parent b = new Parent(1);
        Parent c = new Child();
        Parent d = new Child(1);
        Child e = new Child();
        Child f = new Child(1);
    }
}
