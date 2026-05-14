/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

import interfaces.BangunRuang;

public class Bola extends Lingkaran
implements BangunRuang {

    public Bola(double r) {

        super(r);
    }

    @Override
    public double volume() {

        return (4.0 / 3.0)
                * Math.PI
                * Math.pow(
                getJariJari(), 3);
    }

    public double luasPermukaan() {

        return 4
                * Math.PI
                * Math.pow(
                getJariJari(), 2);
    }

    @Override
    public void tampilInfo() {

        System.out.println(
                "=== BOLA ===");
    }
}
