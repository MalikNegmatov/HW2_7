import java.util.*;

public class Main {

    public static final List<Integer> ints = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    public static final List<String> words = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

    public static void main(String[] args) {
        System.out.println("Задача 1");
        task1();
        System.out.println("Задача 2");
        task2();
        System.out.println("Задача 3");
        task3();
        System.out.println("Задача 4");
        task4();
    }

    public static void task1(){
        StringJoiner j = new StringJoiner(", ");
        for (int i : ints) {
            if (i % 2 != 0) {
                j.add(String.valueOf(i));
            }
        }
        System.out.println(j);
        System.out.println();
    }

    public static void task2(){
        StringJoiner j = new StringJoiner(", ");
        Set<Integer> setOfInts = new HashSet<>(ints);
        for (int i : setOfInts) {
            if (i % 2 == 0) {
                j.add(String.valueOf(i));
            }
        }
        System.out.println(j);
        System.out.println();
    }
    public static void task3(){
        Set<String> setOfWords = new HashSet<>(words);
        System.out.println(setOfWords);
        System.out.println();
    }
    public static void task4(){
        List<String> s = new ArrayList<>(words);
        Set<String> d = new HashSet<>(s);
        for (String x : d) {
            System.out.println(Collections.frequency(s, x));
        }
    }
}