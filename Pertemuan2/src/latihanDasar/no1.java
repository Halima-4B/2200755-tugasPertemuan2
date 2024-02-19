/*
Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah bilangan
bulat negatif dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan tersebut!
*/

package latihanDasar;

import java.util.Scanner;
public class no1{
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)){
            // Meminta input dari pengguna
            System.out.print("Masukkan bilangan pertama : ");
            int bil1 = scanner.nextInt();
            
            System.out.print("Masukkan bilangan kedua   : ");
            int bil2 = scanner.nextInt();
            
            System.out.print("Masukkan bilangan ketiga  : ");
            int bil3 = scanner.nextInt();
            
            // Menampilkan hasil operasi penjumlahan
            int hasilTambah = bil1 + bil2 + bil3;
            System.out.println("Hasil penjumlahan   : " + hasilTambah);
            
            // Menampilkan hasil operasi pengurangan
            int hasilKurang = bil1 - bil2 - bil3;
            System.out.println("Hasil pengurangan   : " + hasilKurang);
            
            // Menampilkan hasil operasi perkalian
            int hasilKali = bil1 * bil2 * bil3;
            System.out.println("Hasil perkalian     : " + hasilKali);
            
            // Menampilkan hasil operasi pembagian
            if (bil2 != 0 && bil3 != 0){
                double hasilBagi = (double) bil1 / (bil2 * bil3);
                System.out.println("Hasil pembagian     : " + hasilBagi);
            } else {
                System.out.println("Pembagian tidak dapat dilakukan karena "
                        + "bilangan kedua atau ketiga adalah nol.");
            }
        }
    }
}