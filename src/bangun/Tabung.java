/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun;

import abstracts.AbstractBangunRuang;
import utils.Validator;
import exceptions.*;

public class Tabung
extends AbstractBangunRuang {

    // =====================================
    // COMPOSITION
    // =====================================
    private Lingkaran alas;

    private double tinggi;

    // =====================================
    // CONSTRUCTOR
    // =====================================
    public Tabung(
            double radius,
            double tinggi)
            throws RadiusException,
            TinggiException {

        Validator.validasiRadius(radius);

        Validator.validasiTinggi(tinggi);

        alas = new Lingkaran(radius);

        this.tinggi = tinggi;

        this.nama = "Tabung";
    }

    // =====================================
    // GETTER
    // =====================================
    public Lingkaran getAlas() {

        return alas;
    }

    public double getTinggi() {

        return tinggi;
    }

    // =====================================
    // OVERRIDING
    // =====================================
    @Override
    public double volume() {

        return alas.luas()
                * tinggi;
    }

    // =====================================
    // METHOD TAMBAHAN
    // =====================================
    public double luasPermukaan() {

        return 2
                * alas.luas()
                +
                alas.keliling()
                * tinggi;
    }
}
