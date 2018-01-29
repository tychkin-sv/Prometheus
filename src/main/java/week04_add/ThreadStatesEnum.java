package week04_add;

import java.io.Closeable;
import java.io.IOException;
 

// Здесь показано все, что мы можем сделать с Enum
public enum ThreadStatesEnum implements Closeable{
    START(1){
        @Override
        public String toString(){
            return "Реализация START. Приоритет : " + getPriority();
        }
 
        @Override
        public String getDetail() {
            return "START";
        }
    },
    RUNNING(2){
        @Override
        public String getDetail() {
            return "RUNNING";
        }
    },
    WAITING(3){
        @Override
        public String getDetail() {
            return "WAITING";
        }
    },
    DEAD(4){
        @Override
        public String getDetail() {
            return "DEAD";
        }
    };
     
    private int priority;
     
    public abstract String getDetail();
    //Enum конструкторы должны всегда быть private.
    private ThreadStatesEnum(int i){
        priority = i;
    }
     
    //У Enum могут быть методы
    public int getPriority(){
        return this.priority;
    }
     
    public void setPriority(int p){
        this.priority = p;
    }
     
    //Enum может переопределять методы
    @Override
    public String toString(){
        return "Стандартная реализация ThreadStatesConstructors. Приоритет : " + getPriority();
    }
 

    public void close() throws IOException {
        System.out.println("Закрытие Enum");
    }
}