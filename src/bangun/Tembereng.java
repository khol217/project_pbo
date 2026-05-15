/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

import utils.Validator;
import exceptions.*;

public class Tembereng
extends Lingkaran {

    private double sudut;

    public Tembereng(
            double radius,
            double sudut)
            throws RadiusException,
            SudutException {

        super(radius);

        Validator.validasiSudut(sudut);

        this.sudut = sudut;
    }

    public double luasTembereng() {

        double luasJuring =
                (sudut / 360)
                * luas();

        double luasSegitiga =
                0.5
                * getRadius()
                * getRadius()
                * Math.sin(
                Math.toRadians(sudut));

        return luasJuring
                - luasSegitiga;
    }
}
