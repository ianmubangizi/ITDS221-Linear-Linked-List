package com.mubangizi;

import com.mubangizi.list.LinearLinkedList;
import com.mubangizi.list.LinearLinkedListImpl;
import java.util.Scanner;

/**
 *
 * @author Ian Mubangizi
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        LinearLinkedList<Integer> list = new LinearLinkedListImpl();

        System.out.println("[Use [Q] -> Quit / [P] -> Print & [C] -> Count]");
        while (true) {
            System.out.print("[INPUT NUMBER OR [Q/P]]: ");
            String input = jin.next();
            if (input.matches("Q") | input.matches("q")) {
                break;
            }
            if (input.matches("P") | input.matches("p")) {
                if (list.count() != 0) {
                    System.out.println("\nLIST DATA IS BELOW");
                    for (Object e : (Object[])list.elements()) {
                        System.out.print("[" + e + "]-->");
                    }
                    System.out.println("(/)\n");
                }
            }
            if (input.matches("C") | input.matches("c")) {
                System.out.println(
                        "\nLIST CONTAINS [" + list.count() + "] ITEMS\n"
                );
            }
            try {
                list.add(Integer.parseInt(input));
            } catch (NumberFormatException e) {
            }
        }
//        list.add(65);
//        list.add(21);
//        list.add(38);
//        list.add(32);
    }
}
