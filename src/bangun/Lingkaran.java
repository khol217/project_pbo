/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

import abstracts.AbstractBangunDatar;
import utils.Validator;
import exceptions.RadiusException;

public class Lingkaran
extends AbstractBangunDatar {

    // =====================================
    // ATRIBUT
    // =====================================
    private double radius;

    // =====================================
    // CONSTRUCTOR
    // =====================================
    public Lingkaran(double radius)
            throws RadiusException {

        Validator.validasiRadius(radius);

        this.radius = radius;

        this.nama = "Lingkaran";
    }

    // =====================================
    // GETTER
    // =====================================
    public double getRadius() {

        return radius;
    }

    // =====================================
    // SETTER
    // =====================================
    public void setRadius(double radius)
            throws RadiusException {

        Validator.validasiRadius(radius);

        this.radius = radius;
    }

    // =====================================
    // OVERRIDING
    // =====================================
    @Override
    public double luas() {

        return Math.PI
                * radius
                * radius;
    }

    @Override
    public double keliling() {

        return 2
                * Math.PI
                * radius;
    }
}
