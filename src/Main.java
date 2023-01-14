import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Consumer;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        ArrayList<String> listOfA = new ArrayList<>();
        System.out.println("Введите 5 строк");
        for (int i = 0; i < 5; i++) {
            listOfA.add(scanner.next());

        }
        System.out.println("A" + listOfA);
        Scanner scanner1 = new Scanner(System.in);
        ArrayList<String> listOfB = new ArrayList<>();
        System.out.println("Введите 5 строк");

        for (int i = 0; i < 5; i++) {
            listOfB.add(scanner1.next());

        }
        System.out.println("B" + listOfB);

        ArrayList<String> listOfC = new ArrayList<>();

        Collections.reverse(listOfB);
        listOfC.add(listOfA.get(0));

        listOfC.add(listOfB.get(0));

        listOfC.add(listOfA.get(1));

        listOfC.add(listOfB.get(1));

        listOfC.add(listOfA.get(2));

        listOfC.add(listOfB.get(2));

        listOfC.add(listOfA.get(3));

        listOfC.add(listOfB.get(3));

        listOfC.add(listOfA.get(4));

        listOfC.add(listOfB.get(4));

        System.out.println("listOfC" + listOfC);

        Collections.sort(listOfC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else {
                    if (o1.length() < o2.length()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });
        System.out.println("Список отсортированный по длине строки" + listOfC);
    }
}
