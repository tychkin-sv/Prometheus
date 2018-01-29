package lessons.methods;
// Пример передачи параметров в метод

public class ParameterTransferTry {
    public static void main(String[] args) {
        int intPrimitive = 3;
        // Обратите внимание, что метор toString переопределен, для удобного вывода
        IntegerObject integerObject = new IntegerObject(3);

        String stringObject = new String("3");

        System.out.println("outside method and BEFORE execute");
        System.out.println("intPrimitive = " + intPrimitive + ", integerObject = " + integerObject + ", stringObject = " + stringObject);
        System.out.println("");

        //method execution
        doSomething(intPrimitive, integerObject, stringObject);

        System.out.println("outside method and AFTER execute");
        System.out.println("intPrimitive = " + intPrimitive + ", integerObject = " + integerObject + ", stringObject = " + stringObject);
    }

    public static void doSomething(int intPrimitive, IntegerObject integerObject, String stringObject) {
        // неудачная попытка изменения значения, т.к. работаем с копией значения аргумента.
        // Но это значение будет до конца метода.
        intPrimitive = 5;
        // как мы видим до
        System.out.println("intPrimitive inside method = " + intPrimitive);

        // удачное изменение поля объекта по значению ссылки, которая является копией внешней ссылки
        integerObject.set(5);
        System.out.println("integerObject inside method = " + integerObject);

        // неудачная попытка присвоения, т.к. это создание нового объекта String
        // ссылка на внешний теряется, фактически мы создаем новый экземпляр.
        stringObject = "5";
        // что аналогично записи.
        stringObject = new String("5");
        System.out.println("");
    }
}
class IntegerObject {
    private int a;

    public IntegerObject(int a) {
        this.a = a;
    }

    public void set(int b) {
        a = b;
    }

    @Override
    public String toString() {
        return ""+a;
    }
}