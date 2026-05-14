/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

import interfaces.BangunRuang;

public class Tabung extends Lingkaran
implements BangunRuang {

    private double tinggi;

    public Tabung(double r,
                  double tinggi) {

        super(r);

        this.tinggi = tinggi;
    }

    public double getTinggi() {

        return tinggi;
    }

    public void setTinggi(double tinggi) {

        this.tinggi = tinggi;
    }

    @Override
    public double volume() {

        return luas() * tinggi;
    }

    public double luasPermukaan() {

        return 2 * luas()
                + keliling() * tinggi;
    }

    @Override
    public void tampilInfo() {

        System.out.println(
                "=== TABUNG ===");
    }
}
