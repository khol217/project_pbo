/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

public class Tembereng extends Lingkaran {

    private double sudut;

    public Tembereng(double r,
                     double sudut) {

        super(r);

        this.sudut = sudut;
    }

    public double luasTembereng() {

        double luasJuring =
                (sudut / 360.0)
                * luas();

        double luasSegitiga =
                0.5
                * Math.pow(
                getJariJari(), 2)
                * Math.sin(
                Math.toRadians(sudut));

        return luasJuring
                - luasSegitiga;
    }

    @Override
    public void tampilInfo() {

        System.out.println(
                "=== TEMBERENG ===");
    }
}
