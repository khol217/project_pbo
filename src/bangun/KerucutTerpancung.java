/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

import interfaces.BangunRuang;

public class KerucutTerpancung
extends Lingkaran
implements BangunRuang {

    private double rKecil;
    private double tinggi;

    public KerucutTerpancung(
            double rBesar,
            double rKecil,
            double tinggi) {

        super(rBesar);

        this.rKecil = rKecil;
        this.tinggi = tinggi;
    }

    public double getRKecil() {
        return rKecil;
    }

    public void setRKecil(double rKecil) {
        this.rKecil = rKecil;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {

        double R = getJariJari();
        double r = rKecil;

        return (1.0 / 3.0)
                * Math.PI
                * tinggi
                * (R * R
                + R * r
                + r * r);
    }

    @Override
    public void tampilInfo() {

        System.out.println(
                "=== KERUCUT TERPANCUNG ===");
    }
}
