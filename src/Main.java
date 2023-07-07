import java.util.*;

public class Main {

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
        List<Integer> intList = new ArrayList<>(List.of(1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 7));
        String s = ", ";
        StringJoiner j = new StringJoiner(s);
        for (int i : intList) {
            if (i % 2 != 0) {
                j.add(String.valueOf(i));
            }
        }
        System.out.println(j);
        System.out.println();
    }

    public static void task2(){
        Set<Integer> setOfInts = new HashSet<>(List.of(1, 1, 2, 3, 4, 10, 4, 5, 5, 6, 6, 6, 7));
        String s = ", ";
        StringJoiner j = new StringJoiner(s);
        for (int i : setOfInts) {
            if (i % 2 == 0) {
                j.add(String.valueOf(i));
            }
        }
        System.out.println(j);
        System.out.println();
    }
    public static void task3(){
        String s = ", ";
        StringJoiner j = new StringJoiner(s);
        List<String> w = new ArrayList<>(List.of("стол", "стул", "парта", "стул", "сто", "ступа", "стол", "ступа", "сто"));
        Set<String> setOfWords = new HashSet<>(w);
        for (String x : setOfWords) {
            j.add(x);
        }
        System.out.println(j);
        System.out.println();
    }
    public static void task4(){
        List<String> s = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> d = new HashSet<>(s);
        for (String x : d) {
            System.out.println(Collections.frequency(s, x));
        }
    }
}