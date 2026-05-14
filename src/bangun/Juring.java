/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

public class Juring extends Lingkaran {

    private double sudut;

    public Juring(double r,
                  double sudut) {

        super(r);

        this.sudut = sudut;
    }

    public double luasJuring() {

        return (sudut / 360.0)
                * luas();
    }

    public double panjangBusur() {

        return (sudut / 360.0)
                * keliling();
    }

    @Override
    public void tampilInfo() {

        System.out.println(
                "=== JURING ===");
    }
}
