package OCAJavaSE7.chapter07;

public class Trace {
public static void main(String args[]) {
method1();
}
public static void method1() {
method2();
}
public static void method2() {
String[] students = {"Shreya", "Joseph"};
System.out.println(students[5]);
}
}