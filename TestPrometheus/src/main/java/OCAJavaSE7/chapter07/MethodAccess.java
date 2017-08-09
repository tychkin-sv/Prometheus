package OCAJavaSE7.chapter07;

public class MethodAccess {
public static void main(String args[]) {
myMethod();
}
public static void myMethod() {
System.out.println("myMethod");
myMethod();
}
}