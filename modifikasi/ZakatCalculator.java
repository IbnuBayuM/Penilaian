/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zakat.modifikasi;
class ZakatCalculator {
    private double zakatRate = 2.5 / 100; 
    private double syarat = 3 * 5000;     

    public boolean memenuhiSyarat(double harta) {
        return harta >= syarat;
    }

    public double hitungZakat(double harta) {
        return harta * zakatRate;
    }
}