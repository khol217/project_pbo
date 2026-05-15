/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

import abstracts.AbstractBangunRuang;
import utils.Validator;
import exceptions.*;

public class Kerucut
extends AbstractBangunRuang {

    private Lingkaran alas;

    private double tinggi;

    public Kerucut(
            double radius,
            double tinggi)
            throws RadiusException,
            TinggiException {

        Validator.validasiRadius(radius);

        Validator.validasiTinggi(tinggi);

        alas = new Lingkaran(radius);

        this.tinggi = tinggi;

        this.nama = "Kerucut";
    }

    @Override
    public double volume() {

        return (1.0 / 3.0)
                * alas.luas()
                * tinggi;
    }
}
