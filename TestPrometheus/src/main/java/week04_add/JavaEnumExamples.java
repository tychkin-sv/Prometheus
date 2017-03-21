package week04_add;
 
import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;
 
public class JavaEnumExamples {
 
    public static void main(String[] args) throws IOException {
                 
        usingEnumMethods();
         
        usingEnumValueOf();
         
        usingEnumValues();
         
        usingEnumInSwitch(ThreadStatesEnum.START);
        usingEnumInSwitch(ThreadStatesEnum.DEAD);
         
        usingEnumMap();
         
        usingEnumSet();
         
    }
 
    private static void usingEnumSet() {
        EnumSet<ThreadStatesEnum> enumSet = EnumSet.allOf(ThreadStatesEnum.class);
        for(ThreadStatesEnum tsenum : enumSet){
            System.out.println("Используем EnumSet, приоритет = " + tsenum.getPriority());
        }
    }
 
    private static void usingEnumMap() {
        EnumMap<ThreadStates, String> enumMap = new EnumMap<ThreadStates,String>(ThreadStates.class);
        enumMap.put(ThreadStates.START, "Поток начал работу");
        enumMap.put(ThreadStates.RUNNING, "Поток ждет");
        enumMap.put(ThreadStates.WAITING, "Поток работает");
        enumMap.put(ThreadStates.DEAD, "Поток умер");
         
        Set<ThreadStates> keySet = enumMap.keySet();
        for(ThreadStates key : keySet){
            System.out.println("ключ = " + key.toString() + " :: значение = " + enumMap.get(key));
        }
         
    }
 
    private static void usingEnumInSwitch(ThreadStatesEnum th) {
        switch (th){
        case START:
            System.out.println("Состояние потока: START");
            break;
        case WAITING:
            System.out.println("Состояние потока: WAITING");
            break;
        case RUNNING:
            System.out.println("Состояние потока: RUNNING");
            break;
        case DEAD:
            System.out.println("Состояние потока: DEAD");
        }
    }
 
    private static void usingEnumValues() {
        ThreadStatesEnum[] thArray = ThreadStatesEnum.values();
         
        for(ThreadStatesEnum th : thArray){
            System.out.println(th.toString() + "::приоритет = " + th.getPriority());
        }
    }
 
    private static void usingEnumValueOf() {
        ThreadStatesEnum th = Enum.valueOf(ThreadStatesEnum.class, "START");
        System.out.println("th приоритет = " + th.getPriority());
    }
 
    private static void usingEnumMethods() throws IOException {
        ThreadStatesEnum thc = ThreadStatesEnum.DEAD;
        System.out.println("приоритет : " + thc.getPriority());
         
        thc = ThreadStatesEnum.DEAD;
        System.out.println("Используем переопределенный метод. " + thc.toString());
         
        thc = ThreadStatesEnum.START;
        System.out.println("Используем переопределенный метод. " + thc.toString());
        thc.setPriority(10);
        System.out.println("Константа Enum изменила значение = " + thc.getPriority());
        thc.close();
    }
 
}