/*
Buatlah algoritma dalam Bahasa Java, Anda akan keluar membeli migacoan jika mempunyai uang
lebih besar dari 10000 (rupiah) dan pasangan Anda sedang tidak ada kelas di kuliahnya,
yang dapat ditulis sebagai ekspresi: (uang > 10000) && (tidakAdaKelasKuliah)!
*/

package latihanDasar;

import java.util.Scanner;
public class no2{
    public static void main(String[] args){
        // Meminta input dari pengguna
        try (Scanner scanner = new Scanner(System.in)){
            // Meminta input dari pengguna
            System.out.print("Masukkan jumlah uang yang Anda miliki: ");
            int uang = scanner.nextInt();
            
            System.out.print("Apakah pasangan Anda tidak ada kelas kuliah? (true/false): ");
            boolean tidakAdaKelasKuliah = scanner.nextBoolean();
            
            // Menampilkan hasil apakah akan membeli mie gacoan atau tidak
            if (uang > 10000 && tidakAdaKelasKuliah){
                System.out.println("Asik! bisa beli mie gacoan bareng ayang");
            } else {
                System.out.println("Huhu sedih gabisa beli mie gacoan");
            }
        }
    }
}