package daugyboslentele;

import java.util.Scanner;

public class Daugyboslentele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ivesk pirma skaiciu");
        int sk1 = sc.nextInt();

        System.out.println("Ivesk antra skaiciu");
        int sk2 = sc.nextInt();

        System.out.println("------------");
//
//        if (sk1 > sk2) {
//            int tmp = sk1;
//            sk1 = sk2;
//            sk2 = tmp;
//        }
//        int a = sk1;
//        while (a <= sk2) {
//            int b = sk1;
//            while (b <= sk2) {
//                int sandauga = a * b;
//                System.out.print(sandauga + "\t");
//                b++;
//            }
//            System.out.println();
//            a++;
//        }
//
        if (sk1 > sk2) {
            int tmp = sk1;
            sk1 = sk2;
            sk2 = tmp;
        }
        for (int a = sk1; a <= sk2; a++) {
            for (int i = sk1; i <= sk2; i++) {
                int sandauga = i * a;
                System.out.print(sandauga + "\t");
            }
            System.out.println();
        }
    }

}
