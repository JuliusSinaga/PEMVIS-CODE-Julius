// 12S23035 - Julius Kaisar Bona Theo Sinaga
// 12S23044 - Gracia Pardede

import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arrayisbn = new String[3];
        double[] arrayharga = new double[3];
        int[] arrayjlhbuku = new int[3];
        int i, z;

        z = 3;
        for (i = 0; i <= z - 1; i++) {
            arrayisbn[i] = "";
            arrayharga[i] = 0;
            arrayjlhbuku[i] = 0;
        }
        double total;

        total = 0;
        boolean next;

        next = true;
        while (next == true) {
            String isbn;
            double harga;
            int jlhbuku;

            isbn = input.nextLine();
            if (isbn.equals("---")) {
                next = false;
            } else {
                harga = Double.parseDouble(input.nextLine());
                jlhbuku = Integer.parseInt(input.nextLine());
                boolean outside;

                outside = false;
                i = 0;
                do {
                    if (arrayisbn[i].equals(isbn)) {
                        arrayjlhbuku[i] = arrayjlhbuku[i] + jlhbuku;
                        outside = true;
                    } else {
                        i = i + 1;
                    }
                } while (!outside && i < z);
                if (!outside) {
                    boolean betul;

                    betul = false;
                    int a;

                    a = 0;
                    do {
                        if (arrayjlhbuku[a] == 0) {
                            betul = true;
                        } else {
                            a = a + 1;
                        }
                    } while (!betul && a < z);
                    arrayisbn[a] = isbn;
                    arrayharga[a] = harga;
                    arrayjlhbuku[a] = jlhbuku;
                    a = a + 1;
                }
            }
        }
        for (i = 0; i <= z - 1; i++) {
            double hargaakhir;

            hargaakhir = arrayharga[i];
            if (arrayjlhbuku[i] >= 20) {
                hargaakhir = arrayharga[i] - 0.12 * arrayharga[i];
            } else {
                if (arrayjlhbuku[i] >= 10 && arrayjlhbuku[i] < 20) {
                    hargaakhir = arrayharga[i] - 0.05 * arrayharga[i];
                } else {
                    if (arrayjlhbuku[i] >= 5) {
                        hargaakhir = arrayharga[i] - 0.02 * arrayharga[i];
                    } else {
                        hargaakhir = arrayharga[i];
                    }
                }
            }
            total = total + hargaakhir * arrayjlhbuku[i];
        }
        System.out.println(toFixed(total,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
