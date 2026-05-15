/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

import utils.Validator;
import exceptions.*;

public class Cincin
extends Lingkaran {

    private double radiusDalam;

    public Cincin(
            double radiusLuar,
            double radiusDalam)
            throws RadiusException {

        super(radiusLuar);

        Validator.validasiRadius(radiusDalam);

        Validator.validasiCincin(
                radiusLuar,
                radiusDalam);

        this.radiusDalam =
                radiusDalam;
    }

    public double luasCincin() {

        return luas()
                -
                (Math.PI
                * radiusDalam
                * radiusDalam);
    }
}
