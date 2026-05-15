/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

import abstracts.AbstractBangunRuang;
import utils.Validator;
import exceptions.*;

public class Bola
extends AbstractBangunRuang {

    private Lingkaran lingkaran;

    public Bola(double radius)
            throws RadiusException {

        Validator.validasiRadius(radius);

        lingkaran =
                new Lingkaran(radius);

        this.nama = "Bola";
    }

    @Override
    public double volume() {

        double r =
                lingkaran.getRadius();

        return (4.0 / 3.0)
                * Math.PI
                * r
                * r
                * r;
    }
}
