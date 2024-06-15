//12S23035 - Julius Kaisar Bona Theo Sinaga
//12S23044 - Gracia Pardede
import java.util.*;
import java.lang.Math;

public class X01{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double murah, harga, total;

        total = 0;
        murah = 9999;
        do {
            harga = Double.parseDouble(input.nextLine());
            if (harga == 0) {
            } else {
                if (harga < murah) {
                    murah = harga;
                } else {
                    harga = harga;
                }
                total = total + harga;
            }
        } while (harga != 0);
        if (total > 100) {
            total = total - murah;
        } else {
            total = total;
        }
        System.out.println(toFixed(total,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
