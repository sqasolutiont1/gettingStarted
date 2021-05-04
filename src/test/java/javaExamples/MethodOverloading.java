package javaExamples;

public class MethodOverloading {
    public static void myMethod() {
        System.out.println("ewrtewrter");
    }

    public static void myMethod(String string) {
        System.out.println(string);
    }

    public static void myMethod(int integer) {
        System.out.println(integer);
    }

    public static void main(String... args) {
        myMethod();
    }
}
