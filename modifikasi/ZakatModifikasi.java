/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zakat.modifikasi;
import java.util.Scanner;

public class ZakatModifikasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilih;

        do {
            System.out.print("Masukkan Jumlah uang (bentuk desimal): ");
            double jumlahUang = input.nextDouble();

            Harta harta = new Harta(jumlahUang);
            ZakatCalculator calculator = new ZakatCalculator();

            if (calculator.memenuhiSyarat(harta.getJumlah())) {
                double zakatMall = calculator.hitungZakat(harta.getJumlah());
                System.out.println("Jumlah zakat mall yang harus dibayarkan sejumlah = Rp. " + zakatMall);
            } else {
                System.out.println("Kumpulin Uang Dulu");
            }

            System.out.print("Apakah ingin mengulangi perhitungan? (y/n): ");
            pilih = input.next();
        } while (pilih.equalsIgnoreCase("y"));

        System.out.println("Perhitungan Zakat mall selesai");
    }
}