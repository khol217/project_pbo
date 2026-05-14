/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

public class Cincin extends Lingkaran {

    private double rDalam;

    public Cincin(double rLuar,
                  double rDalam) {

        super(rLuar);

        this.rDalam = rDalam;
    }

    public double getRDalam() {
        return rDalam;
    }

    public void setRDalam(double rDalam) {
        this.rDalam = rDalam;
    }

    public double luasCincin() {

        return Math.PI
                *
                (
                Math.pow(
                        getJariJari(), 2)
                -
                Math.pow(rDalam, 2)
                );
    }

    @Override
    public void tampilInfo() {

        System.out.println(
                "=== CINCIN ===");
    }
}
