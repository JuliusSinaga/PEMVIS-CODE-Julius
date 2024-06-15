// 12S23035 - Julius Kaisar Bona Theo Sinaga
// 12S23044 - Gracia Pardede

import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] buddy = new String[4];
        int i, n;

        n = 0;
        i = 0;
        inisialisasi(buddy, i);
        n = func_input(buddy, n);
        output(buddy, n);
    }
    
    public static void inisialisasi(String[] buddy, int i) {
        for (i = 0; i <= 3; i++) {
            buddy[i] = "";
        }
    }
    
    public static int func_input(String[] buddy, int n) {
        int a;

        n = 0;
        for (a = 0; a <= 3; a++) {
            buddy[a] = input.nextLine();
            if (buddy[a].equals("---")) {
                a = 4;
            } else {
                n = n + 1;
            }
        }
        
        return n;
    }
    
    public static void output(String[] buddy, int n) {
        int h;

        for (h = 0; h <= n - 1; h++) {
            System.out.println(buddy[h]);
        }
    }
}
