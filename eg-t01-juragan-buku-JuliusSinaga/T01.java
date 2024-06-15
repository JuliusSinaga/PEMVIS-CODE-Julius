// 12S23035 - Julius Kaisar Bona Theo Sinaga
// 12S23044 - Gracia Pardede

import java.util.*;
import java.lang.Math;

class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn, judul, penulis, tahunterbit, penerbit, formatbuku;
        double harga, minmargin, rating;
        int stok;

        isbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = input.nextLine();
        penerbit = input.nextLine();
        formatbuku = input.nextLine();
        harga = input.nextDouble();
        minmargin = input.nextDouble();
        stok = input.nextInt();
        rating = input.nextDouble();
        System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + harga + "|" + minmargin + "|" + stok + "|" + rating);
    }
}
