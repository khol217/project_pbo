/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

import utils.Validator;
import exceptions.*;

public class Juring
extends Lingkaran {

    private double sudut;

    public Juring(
            double radius,
            double sudut)
            throws RadiusException,
            SudutException {

        super(radius);

        Validator.validasiSudut(sudut);

        this.sudut = sudut;
    }

    public double luasJuring() {

        return (sudut / 360)
                * luas();
    }
}
