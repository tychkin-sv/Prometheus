package week03;

/**
 * Created by userPG on 02.03.2017.
 */
public class Construcror {
    void Construcror() {
        System.out.println("Метод");
    }
    Construcror(int i){System.out.println("Конструктор");}


    public static void main(String[] args) {

        // Нельзя использовать контруктор по умолчанию, т.к определен хотя бы 1 конструктор пусть и с аргументами
        // Construcror con = new Construcror();
        Construcror con = new Construcror(1);

        con.Construcror(); // Это просто метод

    }
}
