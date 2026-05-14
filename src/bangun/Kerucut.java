/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

import interfaces.BangunRuang;

public class Kerucut extends Lingkaran
implements BangunRuang {

    private double tinggi;

    public Kerucut(double r,
                   double tinggi) {

        super(r);

        this.tinggi = tinggi;
    }

    @Override
    public double volume() {

        return (1.0 / 3.0)
                * luas()
                * tinggi;
    }

    public double garisPelukis() {

        return Math.sqrt(
                Math.pow(getJariJari(), 2)
                +
                Math.pow(tinggi, 2)
        );
    }

    public double luasPermukaan() {

        return luas()
                +
                (Math.PI
                * getJariJari()
                * garisPelukis());
    }

    @Override
    public void tampilInfo() {

        System.out.println(
                "=== KERUCUT ===");
    }
}
