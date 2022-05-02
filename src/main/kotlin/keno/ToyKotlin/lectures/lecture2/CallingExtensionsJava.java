package keno.ToyKotlin.lectures.lecture2;

public class CallingExtensionsJava {
    public static String foo(Parent parent) {
        return "parent";
    }
    public static String foo(Child child) {
        return "child";
    }

    public static void main(String[] args) {
        Parent person = new Child();
        System.out.println(foo(person));
    }
}
