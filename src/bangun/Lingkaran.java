/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

import interfaces.BangunDatar;

public class Lingkaran implements BangunDatar {

    private double jariJari;

    public Lingkaran(double jariJari) {

        this.jariJari = jariJari;
    }

    public double getJariJari() {

        return jariJari;
    }

    public void setJariJari(double jariJari) {

        this.jariJari = jariJari;
    }

    @Override
    public double luas() {

        return Math.PI *
                jariJari *
                jariJari;
    }

    // Overloading
    public double luas(double phi) {

        return phi *
                jariJari *
                jariJari;
    }

    @Override
    public double keliling() {

        return 2 *
                Math.PI *
                jariJari;
    }

    public void tampilInfo() {

        System.out.println(
                "=== LINGKARAN ===");
    }
}
