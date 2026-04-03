public class HelloApp {
    public static void main(String[] args) {
        // UC3: Handle optional argument with a default using Ternary Operator
        // If args.length > 0 is true, use args[0]. If false, use "World".
        String name = (args.length > 0) ? args[0] : "World";

        System.out.println("Hello, " + name + "!");
    }
}