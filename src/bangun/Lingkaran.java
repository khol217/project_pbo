/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

import interfaces.BangunDatar;

public class Lingkaran implements BangunDatar {

    // Encapsulation
    private double jariJari;

    // Constructor
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Getter
    public double getJariJari() {
        return jariJari;
    }

    // Setter
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    // Overriding dari interface
    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    // Overloading
    public double luas(double phi) {
        return phi * jariJari * jariJari;
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }

    public void tampilInfo() {
        System.out.println("=== LINGKARAN ===");
    }
}
