/*
Buatlah algoritma dalam bahasa Java, menjumlahkan
kode ASCII dari karakter '4' dan karakter '6'!
*/

package latihanDasar;

public class no3{
    public static void main(String[] args){
        // Mendefinisikan karakter '4' dan '6'
        char char4 = '4';
        char char6 = '6';

        // Mendapatkan nilai ASCII dari karakter '4' dan '6'
        int ascii4 = char4;
        int ascii6 = char6;

        // Menjumlahkan nilai ASCII
        int hasilJumlah = ascii4 + ascii6;

        // Menampilkan hasil
        System.out.println("Kode ASCII dari 4: " + ascii4);
        System.out.println("Kode ASCII dari 6: " + ascii6);
        System.out.println("Hasil jumlah ASCII dari 4 dan 6: " + hasilJumlah);
    }
}