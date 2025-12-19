package eolymp.task14.task2_rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int n = in.nextInt();
            int m = in.nextInt();

            int p = 2 * (n + m);
            int s = n * m;

            System.out.println(p + " " + s);
        }
    }
}