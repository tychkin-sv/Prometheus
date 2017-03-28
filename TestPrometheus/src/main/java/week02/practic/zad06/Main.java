package week02.practic.zad06;

import java.util.*;

/**
 * Created by userPG on 28.03.2017.
 */
public class Main {
    private Set<Integer> set;

    public Main(Set<Integer> set){
        this.set = set;
    }
    public void full(int count){
        //for (int i=count; i>0; i--) this.set.add(i/*new Random().nextInt(10)*/);
        this.set.add(4);
        this.set.add(5);
        this.set.add(1);
        this.set.add(2);
        this.set.add(3);
    }

    public void print(){
        System.out.println(this.set.toString());
    }

    public static void main(String[] args) {

        System.out.println("HashSet");

        Main main = new Main(new HashSet<Integer>());
        main.full(5);
        main.print();

        System.out.println("TreeSet");
        main = new Main(new TreeSet<Integer>());
        main.full(5);
        main.print();

        System.out.println("LinkedHashSet");
        main = new Main(new LinkedHashSet<Integer>());
        main.full(5);
        main.print();
    }

}
